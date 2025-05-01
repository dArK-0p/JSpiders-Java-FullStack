# Variables

- A *variable* is an **identifier** associated with a memory location where data can be *stored, retrieved, and modified* during a program's execution.
  
  - Value and Object, both are considered to be data.

- There are *two* parts of a variable:
  
  - **Declaration.**
  - **Initialization**
  
  ![](Images/Variable%20Creation.png)

- While *Declaration* is <u>mandatory</u>, *Initialization* is <u>optional</u>.
  
  - **JVM** provides *default* values for variables that are not initialized.

### Default Value

- These are the *values* provided to the un-initialized variables, by the JVM.
  
  ```java
  class DefaultValues
  {
      byte b;
      short s;
      int i;
      long l;
  
      float f;
      double d;
  
      char c;
  
      boolean _b;
  
      DefaultValues dv;
  
      String S;
      System _S;
  
      public static void main(String [] args)
      {
          DefaultValues DV = new DefaultValues();
          System.out.println(DV.b + "\n" + DV.s + "\n" + DV.i + "\n" + DV.l);
          System.out.println(DV.f + "\n" + DV.d);
          System.out.println(DV.c);
          System.out.println(DV._b);
  
          System.out.println(DV.dv);
          System.out.println(DV.S + "\n" + DV._S);
      }
  }
  ```

## Types of Variables

* Categorization of Vatiables has been done on the basis of ***where*** it is declared in the class and ***how*** it is declared in the class.

* There are 3 *types* of variables:
  
  * Non-Static Variable.
  
  * Static Variable.
  
  * Local Variable.

### Non-Static Variable

- Variables with values *depending* upon the **object in context**,
  
  - which means that each object has a different value for the same variable.

- Each object has a *separate copy* of non-static varibles.

- Name of two non-static variables **cannot** be same.

- Initialization is **optional**, JVM provides *default* values for un-initialized non-static variables.

###### Declaration:

- Declared *inside* the **class**, *outside* the **method, block or contructor**.
  
  ```java
  class NSVExample
  {
      int x = 10; // Non-Static Variable
      public static void main(String [] args)
      {
  
      }
  }
  ```

###### Access:

- The only way to *access* a **non-static varible** is by **object-reference**.
  
  ```java
  class NSVAccessExample
  {
      int x = 10; // Non-Static Variable
      public static void main(String [] args)
      {
          NSVAccessExample obj1 = new NSVAccessExample();
          NSVAccessExample obj2 = new NSVAccessExample();
          System.out.println(obj1.x + " " +obj2.x);
          obj1.x = 99;
          obj2.x = -99;
          System.out.println(obj1.x + " " +obj2.x);
      }
  }
  ```

###### Storage Area:

- Stored in the **Heap Memory**.

###### Memory Allocation:

- Memory is allocated at run-time, *after* the **object creation**, and is present *within* the memory aloocated to the object.

### Static Variable

- Variables with *same* values, irrespective of the object in context.

- Each object will share a ***common*** copy of the static variable.

- Name of two static variables **cannot** be same.

- Name of static and non-staic variables **cannot** be same, because of:
  
  - Same *Storage Area*.
  
  - Common way of access. &rarr; `Object Reference`

- Initialization is **optional**, JVM provides *default* values for un-initialized static variables.

###### Declaration:

- Declared *inside* the **class**, *outside* the **method, block or constructor**, using the `static` keyword.
  
  ```java
  class SVExample
  {
      static int x = 10; // Static Variable
      public static void main(String [] args)
      {
  
      }
      static int y = 20; // Static Variable
  }
  ```

###### Access:

- There are *three* ways to access static variables:
  
  - Directly. &rarr; `... System.out.println(z); ...`
  
  - By `class` name(Recommended).&rarr; `... System.out.println(SVAccessExample.z); ...`
  
  - By `object` reference.&rarr; `... System.out.println(obj.z); ...`
  
  ```java
  class SVAccessExample
  {
      static boolean z = true;
      public static void main(String [] args)
      {
          SVAccessExample obj = new SVAccessExample();
          System.out.println(z); // Directly
          System.out.println(SVAccessExample.z); // By class Name
          System.out.println(obj.z); // By object Reference
      }
  }
  ```

```java
class SVAccessExample
{
    int x = 10; // Non-Static Variable
    public static void main(String [] args)
    {
        SVAccessExample obj1 = new SVAccessExample();
        SVAccessExample obj2 = new SVAccessExample();
        System.out.println(obj1.x + " " +obj2.x);
        obj1.x = 99;
        System.out.println(obj1.x + " " +obj2.x);
    }
}
```

###### Storage Area:

- Stored in the class/method area, but afterit is stored in the **Heap Memory**.

###### Memory Allocation:

- Allocated the at the time of *class loading*.

### Local Variable

- Referred to as *temporary* variables.
  
  - After the completion of execution of the memory / code block where the varible is present, the local varible gets *destroyed* by the **JVM**.

- Name of two local variables **cannot** be same.

- Name of local variables and non-static variables **can** be same, as they have **different** modes of access.

- Name of local variables and static variables **can** be same.
  
  - But, **priority** is given to the local varibles due to it's *closer proximity*.
  
  ```java
  class SVLV
  {
      static int x = 100;
      public static void main(String [] args)
      {
          int x = 10;
          System.out.println(x); // 10
          System.out.println(SVLV.x); // 100
      }
  }
  ```

- Initialization is **mandatory**, before using it.
  
  ```java
  class LVExample
  {
      public static void main(String [] args)
      {
          int x, y; // Declared x, y.
          y = 10; // Initialization of y.
          System.out.println(y); // 10
          // x is not initialized, but it is not being used.
      }
  }
  ```

- The concept of *Default Values* is **not** applicable to local variables.

###### Declaration:

- Declared *inside* the class and also *inside* a method.
  
  ```java
  class LVExample
  {
      public static void main(String [] args)
      {
          int x = 10; // Local Variable
      }
  }
  ```

###### Access:

- The only way to *access* a **local varible** is **directly**.
  
  ```java
  class LVExample
  {
      public static void main(String [] args)
      {
          int x = 10;
          System.out.println(x);
      }
  }
  ```

###### Storage Area:

- Stored in the **Stack Memory**.

###### Memory Allocation:

- Allocated when the *method / code block* where the variable is present gets executed.
