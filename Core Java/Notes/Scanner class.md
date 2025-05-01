# Scanner Class

- A *pre-defined* class in the *java.util* package, which is **used** to take **input** from user at **run-time**.

- It is *necessary* to import the `Scanner` class before using it.
  
  - `import java.util.Scanner;`

- `Object` is used to *access* the members of the `Scanner` class.
  
  - `Scanner sc = new Scanner(System.in);`

- **Useful Methods**:
  
  | Data Type | Method Name           |
  | --------- | --------------------- |
  | byte      | nextByte()            |
  | short     | nextShort()           |
  | int       | nextInt()             |
  | long      | nextLong()            |
  | float     | nextFloat()           |
  | double    | nextDouble()          |
  | char      | next().charAt(index)  |
  | boolean   | nextBoolean()         |
  | String    | next()<br/>nextLine() |

- **WAP to take a number as input and check for prime.**

```java
import java.util.Scanner;
class PrimeNumber
{
    public static void main(String [] args)
    {
        Scanner sc = new Scanner(System.in);
        String S;
        int x;

        System.out.print("Enter a number: ");
        x = sc.nextInt();

        if(x % 2 == 0)
            S = "Even";
        else
            S = "Odd";

        System.out.println(x + " is " + S + ".");
    }
}
```
