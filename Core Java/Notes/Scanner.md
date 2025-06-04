# CLASS: Scanner

The `Scanner` class is a *predefined* class in the **`java.util`** package, used to take **input from the user at run-time**.

---

## ✅ Importing the Scanner Class

It is *necessary* to import the `Scanner` class before using it:

```java
import java.util.Scanner;
```

---

## ✅ Creating a Scanner Object

To access the members of the `Scanner` class, create an object:

```java
Scanner userInput = new Scanner(System.in);
```

---

## ✅ Useful Methods

| Data Type | Method Name                |
| --------- | -------------------------- |
| `byte`    | `.nextByte();`             |
| `short`   | `.nextShort();`            |
| `int`     | `.nextInt();`              |
| `long`    | `.nextLong();`             |
| `float`   | `.nextFloat();`            |
| `double`  | `.nextDouble();`           |
| `char`    | `.next().charAt(index);`   |
| `boolean` | `.nextBoolean();`          |
| `String`  | `.next();`, `.nextLine();` |

---

## ✅ Example: Check Whether a Number is Prime

```java
import java.util.Scanner;

class PrimeChecker {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = userInput.nextInt();

        boolean isPrime = true;
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
```

---
