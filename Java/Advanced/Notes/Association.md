# Has-A Relationship

### Problems with Is-A Relationship

- A class can directly inherit from a single class only.
- In inheritance, all properties of the parent class are present in the child class irrespective of requirement and usage.

## Association

- The act of an *independent object* **accessing** another *independent object* is known as an association.
  - This relationship is referred to as *Object_1* **Has-A-Relation** with *Object_2*.

```java
class Driver {
    Car c = new Car();

    void drive() {
        c.start();
        c.accelerate();
        c.stop();
    }
}

class Car {
    void start() {
        System.out.println("Started.");
    }
    void accelerate() {
        System.out.println("Accelerating...");
    }
    void stop() {
        System.out.println("Stopped.");
    }
}

class Main {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.c = null;
        d.drive(); // NullPointerException on c.start();
    }
}

class Main {
    public static void main(String[] args) {
        Driver d = new Driver();
        d = null;
        d.drive(); // NullPointerException
    }
}
```

- If a reference variable is assigned `null`, any method call on it will result in a `NullPointerException`.
- As `c` is an *instance variable*, when `d` is destroyed, `c` is also destroyed—demonstrating **association**.

### Terminology

- **Container Object**: An object that holds another object as its data member.
  - Also known as *Source* or *Dependent*.
- **Contained Object**: An object that exists as a data member of another object.
  - Also known as *Component*, *Target*, *Independent*, or *Destination*.

### Types of Association

- **Composition**: Strong Has-A relationship.
  - The existence of the component object is **entirely dependent** on the existence of the container object.
- **Aggregation**: Weak Has-A relationship.
  - The existence of the component object is **partially dependent** on the existence of the container object.

![Has-A-Relation](/home/darkop/JSpiders-Java-FullStack/Advanced%20Java/Images/HasARelation.png)

```java
class Department {
    String name;
    Faculty F1, F2, F3;

    public Department(String name) {
        this.name = name;
    }

    public Department(String name, Faculty F1, Faculty F2, Faculty F3) {
        this.name = name;
        this.F1 = F1;
        this.F2 = F2;
        this.F3 = F3;
    }
}

class Faculty {
    String name;

    public Faculty(String name) {
        this.name = name;
    }
}

public class University {
    Department d1, d2;

    public University(Department d1, Department d2) {
        this.d1 = d1;
        this.d2 = d2;
    }
}

class Main {
    public static void main(String[] args) {
        University uni = new University(
            new Department("CSE"),
            new Department("EE")
        );
        uni = null; // Both departments are also destroyed.
    }
}

class Main {
    public static void main(String[] args) {
        University uni = new University(
            new Department(
                "CSE",
                new Faculty("Akshit"),
                new Faculty("Swayam"),
                new Faculty("Avinash")
            ),
            new Department(
                "CSE",
                new Faculty("Aryan"),
                new Faculty("Rishabh"),
                uni.d1.F3
            )
        );
        uni.d1 = null;
        // Akshit and Swayam are destroyed.
        // Avinash survives because it is associated with uni.d2 as well.
    }
}
```

