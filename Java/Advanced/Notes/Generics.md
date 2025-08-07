# Generics in Java

## Type Safety Problem in Collections

- Java collections can store *heterogeneous* data types.
- This flexibility leads to a **type safety problem** — the compiler cannot guarantee that all elements are of the same type.
- **Generics** solve this by enforcing type constraints at **compile-time**, preventing runtime errors.

------

### Down-casting Problem (Pre-Generics)

- Collections store elements as `Object` when generics are not used.
- Accessing an element's specific property requires **explicit down-casting**, which is error-prone.

```java
ArrayList list = new ArrayList();
list.add(10);         // int autoboxed to Integer
list.add(10.5);       // double autoboxed to Double
list.add(false);      // boolean autoboxed to Boolean

int x = (Integer) list.get(0);  // Downcasting required
```

**Using Generics**:

```java
ArrayList<Integer> list = new ArrayList<>();
list.add(10);           // Valid
// list.add(10.5);     // Compile-Time Error (CTE)
// list.add(false);    // CTE
```

------

## Properties & Rules of Generics

- **Cannot be primitive types**: Use wrapper classes (`Integer`, `Double`, etc.).
- **Raw Type**: If generics are omitted, the type defaults to `Object`.

```java
ArrayList list = new ArrayList();                 // Raw type
ArrayList<Object> list = new ArrayList<>();       // Explicit object type
ArrayList<Integer> list = new ArrayList<>();      // Type-safe
```

- **Base types can be upcasted**, but **generic parameters cannot be**:

```java
List<Object> list = new ArrayList<Demo>();  // Compile-Time Error
List<Object> list = new ArrayList<Object>(); // Valid
```

------

## User-Defined Generic Class

```java
public class Container<T> {
    private T value;

    public void addValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

public class Main {
    public static void main(String[] args) {
        Container<String> container = new Container<>();
        container.addValue("Hello");
        String val = container.getValue();
        System.out.println(val);  // Output: Hello
    }
}
```

---
