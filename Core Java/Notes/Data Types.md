# Data Types

###### Definition 1: *Outdated*

- Every *data* has some *type* and that type is known as <u>Data</u> <u>Type</u>.

###### Definition 2: *Better*

- *Data type* will *define* the type of data that a variable can *hold/store* in it's memory allocation.

## Types of Data Types in Java

- There are two types of Data Types:
  - Primitive
  - Non-Primitive

#### **Primitive** Data Type:

- These are the data types that can only store <u>values</u>.

- There are 8 types of Primitive data types:

![Data Types](Images/Data%20Type.png)

```java
class PrimitiveDataTypes
{
    public static void main(String [] args)
    {
        byte b = 123;
        short s = 12345;
        int i = 12;
        long l = 12L; // L / l is used to denote long values.
        float f = 1.1F; // F / f is used to denote float values.
        double d = 2.2D; // D / d is used to denote double values.
        char c = 'a';
        boolean bo = true;
        System.out.println(b + "\n" + s + "\n" + i + "\n" + l);
        System.out.println(f + "\n" + d);
        System.out.println(c);
        System.out.println(bo);    }
}
```

#### **Non-Primitive** Data Type:

- Non-primitive data types are called **reference types** because they refer to <u>objects</u>.

##### Object:

- A <u>real world</u> entity which has some **State** and **Behavior**.
  
  - *State* is represented by *Variables*.
  
  - *Behavio

- Creating an Object.
  
  ```java
  class ObjectCreation
  {
      public static void main(String [] args)
      {
          ObjectCreation ob = new ObjectCreation();
      }
  }
  ```
  
  ![Object Creation](Images/Object%20Creation.png)

- More than one object of a class can be created, given that none of those objects share thier identifiers.
  
  - i.e. names of the reference variables must be different.
    
    ```java
    class MultipleObjects
    {
        public static void main(String [] args)
        {
            MultipleObjects ob1 = new MultipleObjects();
            MultipleObjects ob2 = new MultipleObjects();
            MultipleObjects ob3 = new MultipleObjects();
            MultipleObjects ob4 = new MultipleObjects();
        }
    }
    ```

- The <u>reference variable</u> **stores** the *address* of the *object* present in the **Heap Memory**.
  
  ```java
  class ObjectAddress
  {
      public static void main(String [] args)
      {
          ObjectAddress ob1 = new ObjectAddress();
          ObjectAddress ob2 = new ObjectAddress();
          System.out.println(ob1 + "\n" + ob2);
      }
  }
  ```

## Miscellaneous Examples

```java
byte b = 127;
b++;
System.out.println(b);
```

###### Output:

```java
-128
```

- Value of a <u>variable</u> of a *certain data type* can vary only within it's range.
  
  - *This applies to all data types with a range.*
  
  <img title="" src="Images/Bound%20by%20Range.png" alt="" data-align="center">

### Method Resolution

![](Images/Method%20Resolution.png)
