# Type Casting

- Converting one type of data value into another type of data type, is known as **Type Casting**.

- This is also refereed to *Primitive Type Casting*.

- Applicable for all the primitive data types except *Boolean*.

- There are two types of 'Data Type' casting:
  
  - *Implicit* Type Casting.
    
    - Also refereed to as, *Up-casting*, *Widening*.
  
  - *Explicit* Type Casting.
    
    - Also refereed to as, *Down-casting*, *Narrowing*.
  
  ![](Images/Type%20Conversion.png)

###### Implicit Type Casting - Up-casting:

- Conversion of *lower* datatype value into *higher* datatype value.

- <u>Compiler</u> is responsible for *Up-casting*.
  
  ```java
  class UpcastingExample
  {
      public static void main(String [] args)
      {
          int i = 'A';
          System.out.println(i); // 65
          int i1 = 10; long l = i1;
          System.out.println(l); // 10
          double d = 10;
          System.out.println(d); // 10.0
          float f = 1.5f; double d1 = f;
          System.out.println(d1); // 1.5
          byte b = 10; int i2 = b;
          System.out.println(i2); // 10
      }
  }
  ```

###### Explicit Type Casting - Down-casting:

- Conversion of *higher* datatype value into *lower* datatype value.

- <u>Programmer</u> is responsible for *Down-casting*.
  
  ```java
  class DowncastingExample 
  {
      public static void main(String [] args)
  {
          // int x = 10.5; // Error as higher type datatype (double) can't be stored inside lower datatype (int)
          int x = (int) 10.5;
          System.out.println(x); // 10
          short s = (short) 10.5;
          System.out.println(s); // 10
          double d = 10.5;
          int y = (int) d;
          System.out.println(y); // 10
          // int a = 1.5f; // Error as implicit downcasting from float to int is not allowed.
          long l = (long) 1.5f;
          System.out.println(l); // 1
          char ch3 = 3533;
          System.out.println(ch3); // '?' (Unicode character)
          // char ch4 = 65383; // Error as character value exceeds valid range.
      }
  }
  ```

###### Miscellaneous

```java
class TC
{
    public static void main(String [] args)
    {
        int x = 10;
        byte y = 10;
        x = x + 1;
        // y = y + 1; --> Error
        y = (byte) (y + 1);
        System.out.println(x); // 11
        System.out.println(y); // 11
    }
}
```

- `y + 1`, here `y` is `byte`, but `1` is `int`, which makes the entire expression `int`.
  
  - `int` **cannot** be stored in byte.

- `x++` $\equiv$ `x = x + 1` but `y++` $\not\equiv$ `y = y + 1`

- `y++` $\equiv$ `y = (byte) (y + 1)`
