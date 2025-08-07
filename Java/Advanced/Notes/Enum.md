# Enum in Java

## Introduction to Enums

- Using a normal `final` variable in Java cannot achieve the **object-level feature** of a constant.
- This limitation led to the introduction of **`enum`** in **Java 1.5**.

```java
static final int i = 10;  // Object-level feature is missing
```

### Java Coding Standards for Constants

- There is a standard convention in Java to name `final` variables using **uppercase letters**.
- This ensures readability and easy identification.

```java
static final int VALUE = 10;
```

---