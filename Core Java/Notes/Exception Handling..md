# Exception Handling

- **Exception:** An unexpected, unwanted event that disturbs the normal flow of the program.

- **Exception Handling:** The process of providing an alternative course of action to continue program execution after an exception.
  
  - The main objective of exception handling is to achieve **normal termination** of the program.

---

## Types of Exceptions

- **Exception:** Typically caused by programming mistakes and are generally **recoverable**.

- **Error:** Usually caused by system-level issues (e.g., memory exhaustion) and are typically **non-recoverable**.

### Classification

![](/home/darkop/Documents/JSpiders-Java-FullStack/Core%20Java/Notes/Images/Throwable.png)

- **Checked Exceptions:**
  
  - Checked at **compile-time**.
  
  - The compiler ensures they are either caught or declared in the method signature.

- **Unchecked Exceptions:**
  
  - Not checked at compile-time.
  
  - Include `RuntimeException` and its subclasses, `Error` and its subclasses.

> Note: Whether checked or unchecked, **all exceptions occur at run-time**.

---

## Run-time Stack Mechanism

```java
class RSM {
    public static void func() { func2(); }
    public static void func2() {
        System.out.println("func2");
    }
    public static void main(String[] args) {
        func();
    }
}
/* Stack
|       |    |       |    |func2();|
|       | -> |func();| -> |func(); |
|main();|    |main();|    |main(); |
*/
```

- For every thread, the JVM creates a separate **stack** at the time of thread creation.

- All method calls performed by that thread are stored in the stack.

- Each entry in the stack is called an **activation record** (or **stack frame**).
  
  - After completing a method call, the JVM removes the corresponding entry from the stack.

- Once all method calls are complete, the JVM destroys the empty stack and terminates the program normally.

---

## Default Exception Handler

```java
class DEH {
    public static void func() { func2(); }
    public static void func2() {
        System.out.println(10/0);
    }
    public static void main(String[] args) {
        func();
    }
}
```

- The method where an exception occurs is responsible for creating an **exception object** with:
  
  - Name of the exception.
  
  - Description of the exception.
  
  - Location where it occurred.

- After creating the exception object, the method hands it to the **JVM**.

- The JVM checks if the method has exception handling code:
  
  - If not, it terminates the method **abnormally** and continues up the call stack.
  
  - This continues until the `main()` method.

- If `main()` also lacks handling code, the JVM terminates the program and delegates the exception to the **default exception handler**.

- The **default exception handler** prints the exception in the format:
  
  ```
  Exception in thread "<thread-name>" <ExceptionType>: <Description>
      at <Location>
  ```

---

## Customized Exception Handling

```java
class CEH {
    public static void main(String[] args) {
        System.out.println("Hii");
        System.out.println(10/0);
        System.out.println("Bye");
    }    
}
```

### `try-catch`

- Code that may raise an exception is known as **risky code**.

- Risky code should be placed in the `try` block.

- Exception handling logic is written inside the `catch` block.

```java
class TryCatchBlock {
    public static void main(String[] args) {
        System.out.println("Hii");
        try {
            System.out.println(10/0);
        } catch (ArithmeticException e) {
            System.out.println(10/2);
        }
        System.out.println("Bye");
    }    
}
```

### Flow Control in `try-catch` Block

```java
class TCB {
    public static void main(String[] args) {
        try {
            System.out.println("St 1");
            System.out.println("St 2");
            System.out.println("St 3");
        } catch (Exception e) {
            System.out.println("St 4");
        }
        System.out.println("St 5");
    }
}
```

#### Scenarios

- **Case 1**: No exception
  
  - Output: `St 1`, `St 2`, `St 3`, `St 5`

- **Case 2**: Exception at `St 2`
  
  - Output: `St 1`, `St 4`, `St 5`

- **Case 3**: Exception at `St 2`, not handled
  
  - Output: `St 1`, followed by program termination and exception trace

- **Case 4**: Exception at `St 4`
  
  - Output: `St 1`, `St 2`, `St 3`, `St 5`

> - If no exception occurs, the `catch` block is ignored.
> 
> - If an exception occurs in the `try` block, the remaining code in that block is **skipped**, regardless of whether the exception is handled.
