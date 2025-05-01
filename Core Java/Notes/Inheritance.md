# Inheritance

- The process of **acquiring** *properties* of one `class` by another `class`.
  
  - **Properties** = **Variables** + **Methods**.

- The `class` that has it's *properties* **acquired**, is the **Parent/Super/Base** `class`.

- The `class` that **acquires** the *properties*, is the **Child/Sub/Derived** `class`.

- `extends` keyword is used by the **child** class to mention the name of the **parent** class.

- **Parent** class reference cab be used to hold it's **child** class object. But vice-versa is **not** possible.
  
  - `ParentClass PC = new ChildClass();` ✅
  
  - `ChildClass PC = new ParentClass();` ❌

## Object Class

- `Object` class is the **SUPER-MOST** class in Java.
  
  - **Every** class in Java, is a **child** class of `Object` class.

- If a `class` *does not* **extend** any other class, then it is called **Direct Child** of `Object` class.

- If a `class` *does* **extend** any other class, then it is called **In-direct Child** of `Object` class.

## Types

- There are **5** types of **Inheritance**:
  
  - *Single* Inheritance.
  
  - *Multi-level* Inheritance.
  
  - *Multiple* Inheritance.(**Not Applicable to Classes in Java.**)
  
  - *Hierarchical* Inheritance.
  
  - *Hybrid* Inheritance.

![](Images/Types%20of%20Inheritance.png)

### Single Inheritance

- **Requires** two classes, i.e. *Parent Class* and *Child Class*.
  
  ```java
  class ParentClass
  {
      int var1 = 12; // Property of ParentClass
      public void func1() // Property of ParentClass
      {
          System.out.println("In Parent class");
      }
  }
  
  class ChildClass extends ParentClass
  {
      int var2 = 11; // Property of ChildClass
      public void func2() // Property of ChildClass
      {
          System.out.println("In Child class");
      }
      public static void main(String [] args)
      {
          ParentClass PC = new ParentClass();
          ParentClass PC1 = new ChildClass();
          ChildClass CC = new ChildClass();
  
          // Using PC
          System.out.println(PC.var1);
          PC.func1();
  
          // Using CC
          System.out.println(CC.var1);
          CC.func1();
          System.out.println(CC.var2);
          CC.func2();
  
          // Using PC1
          System.out.println(PC1.var1);
          PC1.func1();
      }
  }
  ```

- **Parent** class method can be called using **Child** class *reference*. But vice-versa is **not** possible.

- **Child** class object can be created using **Parent** class *reference*. But vice-versa is **not** possible.
  
  - Because, **Parent** class *reference* can hold/refer to **Child** class object.

- The method calling can be performed in any class, as long as it is the same page.

### Multi-level Inheritance

- A **Child** class will the **Parent** class of **another** class.

- Combination of *two* or *more than 2* **Single Inheritance**.
  
  ```java
  class A
  {
      public static void func1()
      {
          System.out.println("In Class A.");
      }
  }
  
  class B extends A
  {
      public static void func2()
      {
          System.out.println("In Class B.");
      }
  }
  
  class C extends B
  {
      public static void func3()
      {
          System.out.println("In Class C.");
      }
  }
  
  class MultiLevelInheritance
  {
      public static void main(String [] args)
      {
          A a = new A();
          B b = new B();
          C c = new C();
  
          a.func1();
          b.func1();
          b.func2();
          c.func1();
          c.func2();
          c.func3();
      }
  }
  ```

- ### Hierarchical Inheritance

- One **Parent** class and *multiple* **child** classes.
  
  ```java
  class A
  {
      public static void func1()
      {
          System.out.println("In Class A.");
      }
  }
  
  class B extends A
  {
      public static void func2()
      {
          System.out.println("In Class B.");
      }
  }
  
  class C extends A
  {
      public static void func3()
      {
          System.out.println("In Class C.");
      }
  }
  
  class HierarchicalInheritance
  {
      public static void main(String [] args)
      {
          A a = new A();
          B b = new B();
          C c = new C();
  
          a.func1();
          b.func1();
          b.func2();
          c.func1();
          c.func3();
      }
  }
  ```

### Multiple Inheritance

- One **Child** class and multiple **Parent** class.

- **Not Applicable** to `classes` in java, due to the issue of **ambiguity**.
  
  - **Ambiguity** arises in a situation, when both *parent* class have methods with the same **Method Signature** and it is called from the *child* class.
    
    - Here, JVM is confused as to which method to be executed.
  
  - **Interfaces** can be used to implement **Multiple Inheritance**.
  
  ```java
  class A
  {
      public static void func()
      {
          System.out.println("In Class A.");
      }
  }
  
  class B extends A
  {
      public static void func()
      {
          System.out.println("In Class B.");
      }
  }
  
  class MultipleInheritance extends A, B
  {
      public static void main(String [] args)
      {
          MultipleInheritance ob = new MultipleInheritance();
          ob.func(); // can be A.func() or B.func() : Ambiguity.
      }
  }
  ```

### Hybrid Inheritance

- *Combination* of **one** or **more** types of Inheritance.
  
  - All except **Multiple Inheritance**

# 

### VAR ARG

- A type of *argument*, which can take **any** number of argument as an input, including no arguments.

- **VAR ARG Method**:
  
  - A *method*, which takes a *var arg* as an argument.
  
  ```java
  class VarArgMethod
  {
      public void varArgMethod(int...varArg)
      {
          System.out.println("Hello...");
          for(int i : varArg)
              System.out.println(i);
          for(int i = 0; i < varArg.length; i++)
              System.out.println(varArg[i]);
      }
      public static void main(String [] args)
      {
          VarArgMethod ob = new VarArgMethod();
          ob.varArgMethod();
          ob.varArgMethod(1);
          ob.varArgMethod(1, 2);
          ob.varArgMethod(1, 2, 3);
      }
  }
  ```

- Rules:
  
  - **Exact match** is preferred over *VAR ARG*.
    
    ```java
    class Rule1
    {
        public void func(int...varArg)
        {
            System.out.println("Hello VAR ARG...");
            for(int i : varArg)
                System.out.println(i);
        }
    
        public void func(int Arg)
        {
            System.out.println("Hello Single ARG...");
            System.out.println(i);
        }
    
        public static void main(String [] args)
        {
            (new Rule1()).func(1);
        }
    }
    ```
  
  - **Up-cast match** is preferred over *VAR ARG*.
    
    - **Up-casting** is older technique than *VAR ARG*.
    
    ```java
    class Rule2
    {
        public void func(int...varArg)
        {
            System.out.println("Hello VAR ARG...");
            for(int i : varArg)
                System.out.println(i);
        }
    
        public void func(long Arg)
        {
            System.out.println("Hello Single ARG...");
            System.out.println(i);
        }
    
        public static void main(String [] args)
        {
            (new Rule2()).func(1);
        }
    }
    ```
  
  - **VAR ARG** is always the *last* parameter.
    
    - Compilation Error if violated.
  
  - There can be only **1** **VAR ARG** in a method parameter.
    
    - `public void func(int...a, int...b) {/* ... */}` &rarr; a **violates** the last parameter rule.
