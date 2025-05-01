# Flow Control

- The *sequential* order in which the **java code statements** get *executed* at the runtime by the **JVM** is known as ***Flow Control***.

- **Controlling Statements** are used to control the flow of execution of the program.
  
  - *Selection Statements*:
    
    - `if-else`
    
    - `else-if` **OR** `if-elseif-else ladder`.
    
    - `switch`
  
  - *Iterative Statements*:
    
    - `for` loop
    
    - `while` loop
    
    - `do-while` loop
  
  - *Transfer Statements*:
    
    - `break`
    
    - `continue`

## Selection Statements

- A *type* of **flow control** statement, which executes a *choice* among *multiple* choices.

### if-else

- A *conditional selection* statement, where **only 1** of **2** blocks of code gets executed, **according** to the **condition**.

- **Syntax**:
  
  ```java
  class IfElse
  {
      public static void main(String [] args)
      {
          int x = 56;
          System.out.print(x + " is ");
          if (x % 2 == 0) // condition
          { // if body
              System.out.println("Even."); // Even.
          }
          else
          { // else body
              System.out.println("Odd.");
          }
      }
  }
  ```

- If `condition` is **true**, then *executes* `if body`.

- If `condition` is **false**, then *executes* `else body`.

- While `if` block is **mandatory**, `else` block is **optional**.
  
  - `else` block **cannot** *exist* independently.

- There can **not** be any line of code between `if` and `else`.

- `{}` can be removed from `if` or `else`, given that there is **only 1** statement in the block and it is **not** a *declarative* statement.
  
  - `int x = 10; if(x == 10) x = 20;` ✅
  
  - `if(true) int x = 10;` ❌

### else-if OR if-else_if-else ladder.

- A *conditional selection* statement, where **only 1** of **multiple** blocks of code gets executed, **according** to the **condition**.

- **Syntax**:
  
  ```java
  class IfElseIfElseLadder
  {
      public static void main(String [] args)
      {
          int a = 5, b = 8, c = 7;
          boolean flag = false;
          if(a > b && a > c)
              System.out.print(a);
          else if(b > a && b > c)
              System.out.print(b);
          else if(c > a && c > b)
              System.out.print(c);
  
          System.out.println(" is the greatest of " + a + ", " + b + ", " + c + ".");
          // 8 is the greatest of 5, 8, 7.
      }
  }
  ```

### switch

- **Syntax**:
  
  ```java
  class SwitchCase
  {
      public static void main(String [] args)
      {
          int x = 4;
          switch(x)
          {
              case 1:
                  System.out.println("case1");
                  x = 10;
                  break;
              case 2:
                  System.out.println("case2");
                  x = 20;
                  break;
              case 3:
                  System.out.println("case3");
                  x = 30;
                  break;
              case 4:
                  System.out.println("case4"); // case4
                  x = 40;
                  break;
              default:
                  System.out.println("defaultcase");
                  x = 99;
                  break;
          }
          System.out.println(x); // 40
      }
  }
  ```

- **Case Label**
  
  1. *Duplicate* case labels are **not** allowed.
  
  2. Case Labels must **always** be a *constant*.
  
  3. Case Label must be *within* the **range** of the `switch variable`.
  
  4. **Default Case**
     
     - Default Case can be placed **anywhere** inside `switch`, given that it is **followed by** a `break;` statement.
     
     - *Duplicate* default cases are **not** allowed.
     
     - Default Case is **Optional**.

- **Fall Through**
  
  - The *scenario* where while execution of `case`, the JVM does **not** find a `break;` statement.
  
  - This leads to the statements inside the `switch` to get executed regardless of `case label`, **until** another `break;` statement is executed.
    
    ```java
    class FallThrough
    {
        public static void main(String [] args)
        {
            int n = 2;
            switch(n)
            {
                case 1: System.out.println("1"); break;
                case 2: System.out.println("2"); // Fall through
                case 3: System.out.println("3"); // Fall through
                case 4: System.out.println("4"); break;
                case 5: System.out.println("5"); break;
                default: System.out.println("d");
            }
            // OUTPUT: 2
            //         3
            //         4
        }
    }
    ```

## Iterative Statements

### for-loop

* Used if the **exact** no. of iterations is known.

* **Syntax**: `for(Initialization; Condition; Updation) { //body; }`
  
  ```java
  class ForLoop
  {
      public static void main(String [] args)
      {
          int sum = 0;
          for(int i = 1; i < 11; i++)
          {
              sum += i;
          }
          System.out.println("Sum = " + sum); // 55
      }
  }
  ```

### while-loop

* Used if the **exact** no. of iterations is **not** known.

* **Syntax**: `while(condition) { //body; }`
  
  ```java
  class WhileLoop
  {
      public static void main(String [] args)
      {
          int sum = 0, i = 1;
          while(i <= 10)
          {
              sum += i;
              i++;
          }
          System.out.println("Sum = " + sum); // 55
      }
  }
  ```

### do-while loop

- Used if the **body** of the loop, *must* be executed **at least once**.

- **Syntax**: `do { //body; } while(condition);`
  
  ```java
  class DoWhileLoop
  {
      public static void main(String [] args)
      {
          int sum = 0, i = 1;
          do
          {
              sum += i;
              i++;
          } while(i <= 10);
          System.out.println("Sum = " + sum); // 55
      }
  }
  ```
  
  ```java
  class DoWhileLoopFalse
  {
      public static void main(String [] args)
      {
          int sum = 0, i = 1;
          do {
              System.out.println("Hi"); 
              // gets printed once even if the condition is false.
          } while(false);
      }
  }
  ```

## Transfer Statements

- A *type* of **flow control** statement, which on execution, either **skips** *the current iteration* or **exits** *the current code block*.

### break

- Used to **exit** the current code block.

- Used in `switch` or `loops`.

### continue

- Used to **skip** the current iteration.

- Used in `loops`.

```java
class BreakContinue
{
    public static void main(String [] args)
    {
        for(int i = 1; i <= 10; i++)
        {
            if(i == 4)
                break;
            System.out.println(i);
        }
        System.out.println("4 - 10 not executed.");

        for(int i = 1; i <= 10; i++)
        {
            if(i == 4)
            {
                System.out.println("4 not executed.");
                continue;
}
            System.out.println(i);
        }
    }
}
```
