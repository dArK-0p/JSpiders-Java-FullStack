# Operators

- Special *symbols* in Java, which are used to perform certain <u>operations</u> on <u>operands</u>.

- `10 + 20` &rarr; `+` is the *operator*, while `10, 20` are *operands*.

- The operators are categorized into *3 types*, on the basis of <u>no. of operands</u> being used with it.
  
  1. **Unary** Operators: **1** <u>Operand</u>
     -
  
  2. **Binary** Operator: **2** <u>Operands</u>
     -
  
  3. **Ternary** Operator: **3** <u>Operands</u>
     -

## Unary Operators

- Unary operators are **only applicable for** <u>variables</u> but **not for** *values*.

- `++10`, `++(x++)`, result in error as both `10` and the expression `x++` are values.
  
  - `x++` returns the incremented **value** of `x`.

- Increment and Decrement operations support all primitive data types **except** *boolean*.

### Increment Operator: `++`

- *Increases* value of a variable by **adding 1** to it.

- Types:
  
  - **Pre**-increment.
  
  - **Post**-increment

###### Pre-Increment Operator

```java
class PreIncrement
{
    public static void main(String [] args)
    {
        int x = 12;
        int y = ++x;
        System.out.println(x + " " + y); // 13 13
    }
}
```

- Value is *increased* &rarr; Value is *assigned*.

- `INCREASE` &rarr; `ASSIGN` &rarr; `INITIALIZE` 

###### Post-Increment Operator

```java
class PostIncrement
{
    public static void main(String [] args)
    {
        int x = 12;
        int y = x++;
        System.out.println(x + " " + y); // 13 12
    }
}
```

* Value is *assigned* &rarr; Value is *increased*.

* `ASSIGN` &rarr; `INCREASE` &rarr; `INITIALIZE`

### Decrement Operator: `--`

* *Decreases* value of a variable by **substracting 1** to it.

* Types:
  
  * **Pre**-decrement.
  
  * **Post**-decrement

###### Pre-Decrement Operator

```java
class PreDecrement
{
    public static void main(String [] args)
    {
        int x = 12;
        int y = --x;
        System.out.println(x + " " + y); // 11 11
    }
}
```

* Value is *decreased* &rarr; Value is *assigned*.

* `DECREASE` &rarr; `ASSIGN` &rarr; `INITIALIZE`

###### Post-Decrement Operator

```java
class PostDecrement
{
    public static void main(String [] args)
    {
        int x = 12;
        int y = x--;
        System.out.println(x + " " + y); // 11 12
    }
}
```

* Value is *assigned* &rarr; Value is *decreased*.

* `ASSIGN` &rarr; `DECREASE` &rarr; `INITIALIZE`

#### <u>Self-Assignment Case</u>

```java
class SelfAssignment
{
    public static void main(String [] args)
    {
        int x = 10;
        System.out.println(x); // 10
        x = x++;
        System.out.println(x); // 10
        x = x++;
        System.out.println(x); // 10
        x = x++;
        System.out.println(x); // 10
        x = x++;
        System.out.println(x); // 10

    }
}
```

- A **special case** where using the <u>increment/decrement</u> operation does not update the variable.

- This scenario is encountered when using the same variable to store the expression `x++` or `x--`.

- To avoid this, pre-increment/pre-decrement is used.
  
  - `x = x++` or `x = x--` ❌
  
  - `x = ++x` or `x = --x` ✅
  
  ![](Images/Self-Assignment%20Case.png)

### Bit-wise Complement Operator: `~`

- Applicable only for *integer type* operand and **does not** work for boolean.

- Works by *adding* **1** to the operand and then *flipping* it's sign.
  
  ```java
  class BitwiseComplement
  {
      public static void main(String [] args)
      {
          int i = -7;
          System.out.println(~i); // 6
          System.out.println(~4); // -5
          System.out.println(~22); // -23
          System.out.println(~('a')); // -98
      }
  }
  ```

### Boolean Complement Operator: `!`

- Applicable only for *boolean values*.

- Works by *flipping* the value of operand.
  
  ```java
  class BooleanComplement
  {
      public static void main(String [] args)
      {
          boolean b = true;
          System.out.println(!b); // false
          System.out.println(!true); // false
          System.out.println(!false); // true
      }
  }
  ```

## Binary Operators

### Arithmatic Operators: `+` `-` `*` `/` `%`

```java
class ArithmaticOperators
{
    public static void main(String [] args)
    {
        int a = 10, b = 2;
        System.out.println(a + b); // 12
        System.out.println(a - b); // 8
        System.out.println(a * b); // 20
        System.out.println(a / b); // 5
        System.out.println(a % b); // 0
    }
}
```

- When an operator is used with it's operands, it is called an *expression*.
  
  - E.g.: `a + b`, `a - b`, etc.

- The data type of the expression is decided by a rule: 
  
  - **max(** `int`, *data type of operand1*, *data type of operand2* **)**

![](Images/Type%20Conversion.png)

#### String Concatenation: `+`

- This is a special use of the `+` operator.

- If one of the operands is a **String** Object then, both the operands are *merged*.
  
  - The output is of **String** type.
  
  ```java
  class StringConcatenation
  {
      public static void main(String [] args)
      {
          byte b = 1; short s = 2; int i = 4; long l = 8l;
          float f = 4.0f; double d = 8.0d;
          char c = '2';
          boolean bo = true;
          System.out.println("Sambit" + b); // Sambit1
          System.out.println("Sambit" + s); // Sambit2
          System.out.println("Sambit" + i); // Sambit4
          System.out.println("Sambit" + l); // Sambit8
          System.out.println("Sambit" + f); // Sambit4.0
          System.out.println("Sambit" + d); // Sambit8.0
          System.out.println("Sambit" + c); // Sambit2
          System.out.println("Sambit" + bo); // Sambittrue
      }
  }
  ```

- The main use of this is to make *print* statements more human readable.

### Relational Operator: `<` `<=` `>` `>=`

- The *expression* of relational operators always return **boolean** values.

- These operators are **applicable** to all *primitive data type* **except** *boolean*.

```java
class RelationalOperators
{
    public static void main(String [] args)
    {
        System.out.println(10 < 20); // true
        System.out.println(12 <= 12.65); // true
        System.out.println(97 > 'a'); // false
        System.out.println(97 >= 'a'); // true
    }
}
```

### Equality Operator: `==`

- This operator works with all *primitive* and *non-primitive* data types.
  
  - It's return type is **Boolean**.

- In case of primitive data types, the equality operator **compares** the values of the operands.
  
  - If *values* are *same* &rarr;  returns **true**.
  
  - If *values* are *different* &rarr; returns **false**.

- In case of non-primitive data types, the equality operator **compares** the reference variables.
  
  * If *reference variables* point to the *same* object &rarr; returns **true**.
  
  * If *reference variables* point to *distinct* objects &rarr; returns **false**.

```java
class EqualityOperator
{
    public static void main(String [] args)
    {
        int x = 10, y = 10, z = 20;
        EqualityOperator ob1 = new EqualityOperator();
        EqualityOperator ob2 = new EqualityOperator();
        EqualityOperator ob3 = ob1;
        System.out.println(x == y); // true
        System.out.println(x == z); // false
        System.out.println(ob1 == ob2); // false
        System.out.println(ob1 == ob3); // true
    }
}
```

### Assignment Operator: `=`

- **Assigns** *value* to a <u>variable</u> or *variable* to an <u>object</u>.

- Types:
  
  - Simple Assignment.
  
  - Chain Assignment.
  
  - Compound Assignment.

- Simple Assignment:
  
  - 

- Chain Assignment:
  
  - Assigning a single *value* to **multiple** variables, simultaneously.
    
    ```java
    class ChainAssignment
    {
        public static void main(String [] args)
        {
            int a, b, c;
            ChainAssignment ob, obj;
            a = b = c = 10;
            ob = obj = new ChainAssignment();
            System.out.println(a + " " + b + " " + c); // 10 10 10
            System.out.println(ob + " " + obj); // address address
            // Both ob and obj point to the same object.
        }
    }
    ```

- Compound Assignment:
  
  - Using any other operator as *prefix* with assignment operator.
    
    ```java
    class CompoundAssignment
    {
        public static void main(String [] args)
        {
            int a = 10;
            System.out.println(a); // 10
            a += 10; // -> a = a + 10;
            System.out.println(a); // 20
            a -= 1; // -> a = a - 1;
            System.out.println(a); // 19
            a *= 2; // -> a = a * 2;
            System.out.println(a); // 38
            a /= 2; // -> a = a / 2;
            System.out.println(a); // 19
        }
    }
    ```

### Bit-wise Operator: `&` `|` `^`

- The **bit-wise operators** are applicable for **all** *primitive* data type **except** the *floating point* data types.

###### Bit-wise AND: `&`

- *Returns* **true** only when both the arguments are **true**.
  
  ```java
  class BitwiseAND
  {
      public static void main(String [] args)
      {
          System.out.println(true & true); // true
          System.out.println(true & false); // false
          System.out.println(false & true); // false
          System.out.println(false & false); // false
      }
  }
  ```

###### Bit-wise OR: `|`

* *Returns* **false** only when both the arguments are **false**.
  
  ```java
  class BitwiseOR
  {
      public static void main(String [] args)
      {
          System.out.println(true | true); // true
          System.out.println(true | false); // true
          System.out.println(false | true); // true
          System.out.println(false | false); // false
      }
  }
  ```

###### Bit-wise **XOR**: `^`

* *Returns* **true** only when both the arguments are **different**.
  
  ```java
  class BitwiseXOR
  {
      public static void main(String [] args)
      {
          System.out.println(true ^ true); // false
          System.out.println(true ^ false); // true
          System.out.println(false ^ true); // true
          System.out.println(false ^ false); // false
      }
  }
  ```

###### Miscellaneous

```java
class BitwiseOperators
{
    public static void main(String [] args)
    {
        System.out.println(4 & 5); // 4
        System.out.println(4 | 5); // 5
        System.out.println(4 ^ 5); // 1
    }
}
```

|        | 8   | 4   | 2   | 1   |     |
| ------:|:---:|:---:|:---:|:---:| --- |
| **4**  | 0   | 1   | 0   | 0   |     |
| **5**  | 0   | 1   | 0   | 1   |     |
| **&**  | 0   | 1   | 0   | 0   | = 4 |
| **\|** | 0   | 1   | 0   | 1   | = 5 |
| **^**  | 0   | 0   | 0   | 1   | = 1 |

### Logical Operators: `&&` `||`

- *Executes* 2$^{nd}$ operand based on the **output** of 1$^{st}$ operand.

- Types:
  
  - Logical AND: `&&`
    
    - 2$^{nd}$ operand will be *executed* **If and only If** 1$^{st}$ operand is **true**.
  
  - Logical OR: `||`
    
    - 2$^{nd}$ operand will be *executed* **If and only If** 1$^{st}$ operand is **false**.
  
  ```java
  class LogicalOperators
  {
      public static void main(String [] args)
      {
          boolean result;
  
          // Logical AND
          result = ( (10 > 2) && (12 != 12) );
          System.out.println(result); // false
          result = ( (10 > 2) && (12 == 12) );
          System.out.println(result); // true
  
          // Logical OR
          result = ( (10 > 2) || (12 != 12) );
          System.out.println(result); // true
          result = ( (10 < 2) || (12 != 12) );
          System.out.println(result); // false
      }
  }
  ```

## Ternary Operator:

# ## Conditional Operator: `?:`

- **Syntax**: `(condition) ? Statement1 : Statement2`

- If *condition* is **true**, `Statement1` will get executed.

- If *condition* is **false**, `Statement2` will get executed.
  
  ```java
  class TernaryOperator
  {
      public static void main(String [] args)
      {
          int s = (1 > 0) ? 1000 : 2000;
          String S = (false) ? "Sagar" : "Sambit";
          System.out.println(s + " " + S); // 1000 Sambit
      }
  }
  ```
