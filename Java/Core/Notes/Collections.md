# INTERFACE : Collection

The **Collection Framework** in Java was introduced to overcome the limitations of arrays and to provide a unified architecture for representing and manipulating collections of objects.

------

## Components of Collections Framework

1. **Collection Interface** – For storing *single values* (e.g., List, Set, Queue).
2. **Map Interface** – For storing *key-value pairs*.

Java provides several **predefined classes** to implement both `Collection` and `Map` interfaces efficiently.

------

## Iteration Techniques

To traverse through elements in a collection:

- `<Iterator>`
- `<ListIterator>` (extends `<Iterator>`)

------

## Sorting Mechanisms

To sort collections and arrays, Java provides:

- `<Comparable>` – Natural ordering (e.g., `String`, `Integer`).
- `<Comparator>` – Custom ordering logic.

------

## Collection vs Collections

| **Collection**                         | **Collections**                                      |
| -------------------------------------- | ---------------------------------------------------- |
| Interface, part of the Collections API | Utility class (`java.util.Collections`)              |
| Used for storing elements              | Contains static methods for sorting, searching, etc. |

------

## Array vs Collection

| **Array**                                               | **Collection**                                        |
| ------------------------------------------------------- | ----------------------------------------------------- |
| Fixed in size                                           | Dynamic in size                                       |
| Raw data structure                                      | Advanced data structure with utility features         |
| Homogeneous elements -- Type Safety                     | Can store heterogeneous elements                      |
| Index-based access                                      | May or may not be index-based                         |
| Allows duplicate elements                               | Duplicate handling depends on specific implementation |
| Suitable for small datasets where size is known upfront | Suitable for large and complex datasets               |
| No built-in utility methods                             | Rich set of utility methods provided                  |
| Supports primitives and objects                         | Supports only objects                                 |

------

![](/home/darkop/JSpiders-Java-FullStack/Core%20Java/Notes/Images/Collections.png)

------

## Methods of Collection Interface

### Add Elements

- `boolean add(Object element);` – Inserts a **single element**.
- `boolean addAll(Collection<?> c);` – Inserts **all elements** from another collection.

### Remove Elements

- `boolean remove(Object element);` – Removes the **specified element**, if present.
- `boolean removeAll(Collection<?> c);` – Removes **all elements** that exist in the specified collection.

### Check Containment

- `boolean contains(Object element);` – Returns `true` if the element is present.
- `boolean containsAll(Collection<?> c);` – Returns `true` if all elements are present.

### Size and Emptiness

- `int size();` – Returns the **number of elements** in the collection.
- `boolean isEmpty();` – Returns `true` if the collection is **empty**.

### Clear Collection

- `void clear();` – Removes **all elements** from the collection.

### Iteration

- `Iterator<E> iterator();` – Returns an iterator over the collection elements.

### Retain Elements

- `boolean retainAll(Collection<?> c);` – Retains only the elements that are **also present** in the specified collection.

------

## List Interface

- Direct child of `Collection` interface.
- Maintains **insertion order**.
- Allows **duplicate elements** and **null values**.
- Supports **index-based operations**: insert, delete, update, retrieve.

### Common Implementations

- `ArrayList`
- `LinkedList`
- `Vector`
- `Stack`

------

## Core Methods of List Interface

```java
void add(int index, Object element);
boolean addAll(int index, Collection c);
Object get(int index);
Object remove(int index);
Object set(int index, Object element);
int indexOf(Object o);
int lastIndexOf(Object o);
```

### Example:

```java
List<Integer> list = new ArrayList<>();
list.add(10); list.add(20); list.add(30); list.add(40);
list.add(2, 99); // inserts 99 at index 2
System.out.println(list); // [10, 20, 99, 30, 40]
```

------

## ArrayList

- Implements `List` interface.
- Maintains insertion order and allows duplicates and nulls.
- Internally uses a **growable array**.

### Constructors of ArrayList

```java
ArrayList()                      // initial size = 10
ArrayList(int initialCapacity)   // user-defined size
ArrayList(Collection c)          // copies elements from given collection
```

### Growth Formula:

```
newSize = oldSize + (oldSize / 2) = 1.5 * oldSize;
```

### Example:

```java
List<Integer> l1 = new ArrayList<>();
l1.add(10); l1.add(20); l1.add(30);
l1.add(2, 34);
System.out.println(l1); // [10, 20, 34, 30]

List<Integer> l2 = new ArrayList<>();
l2.add(55); l2.add(56);
l1.addAll(0, l2);
System.out.println(l1); // [55, 56, 10, 20, 34, 30]
```

------

## LinkedList

### Why LinkedList?

- Overcomes `ArrayList` limitations:
  - Internal fragmentation (unused memory slots).
  - Inefficient insertion/deletion at first or middle index.
  - Costly resizing and element shifting.

### Properties:

- Implements `List` and `Deque` interfaces.
- Internally uses **doubly linked node structure**.
- Does **not support indexing**.
- Suitable when frequent insertion/deletion at start/middle is required.

### Useful in: Employee Management Systems, Task Queues, etc.

### Constructors:

```java
LinkedList()
LinkedList(Collection c)
```

### Methods:

```java
void addFirst(Object o)
void addLast(Object o)
Object removeFirst()
Object removeLast()
```

------

## Vector

- Legacy class that implements `List`.
- Internally uses a **growable array** like `ArrayList`.
- All methods are **synchronized** (thread-safe).
- Performs slower than `ArrayList` in modern multi-threaded environments.

### Constructors:

```java
Vector()
Vector(int initialCapacity)
Vector(Collection c)
```

### Common Methods:

```java
void addElement(Object o)
boolean removeElement(Object o)
void removeElementAt(int index)
void removeAllElements()
Object elementAt(int index)
Object firstElement()
Object lastElement()
int capacity()
```

### Example:

```java
Vector<Integer> v = new Vector<>();
v.addElement(10); v.addElement(20);
v.addElement(30); v.addElement(40);
v.removeElement(30);
System.out.println(v); // [10, 20, 40]
```

------

## Stack

- A subclass of `Vector`.
- Represents a **Last-In-First-Out (LIFO)** structure.
- Operations are performed from **one end only** (the top).

### Common Methods:

```java
Object push(Object o)
Object pop()
Object peek()
boolean empty()
int search(Object o)
```

### Example:

```java
Stack<Integer> s = new Stack<>();
s.push(10); s.push(5); s.push(20); s.push(15);
System.out.println(s);         // [10, 5, 20, 15]
System.out.println(s.peek());  // 15
System.out.println(s.pop());   // 15
System.out.println(s.empty()); // false
System.out.println(s.search(20)); // 2
```

---

## Arrays of Objects in Java

In Java, it is possible to create an array that stores objects instead of primitive values. This is useful for grouping related data structures.

### Example: Array of `Student` Objects

```java
class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] students = {
            new Student("A", 45),
            new Student("B", 45),
            new Student("C", 72),
            new Student("D", 100),
            new Student("E", 78)
        };

        for (Student s : students) {
            System.out.println(s);
        }
    }
}

class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }

    public String toString() {
        return "Student [name=" + name + ", mark=" + mark + "]";
    }
}
```

**Output:**

```text
Student [name=A, mark=45]
Student [name=B, mark=45]
Student [name=C, mark=72]
Student [name=D, mark=100]
Student [name=E, mark=78]
```

------

## Sorting Arrays in Java

The `Arrays.sort()` method can be used to sort primitive arrays and object arrays.

### Example: Sorting Integer Array

```java
class Test {
    public static void main(String[] args) {
        int[] a = {5, 1, 9, 0, 2, 5, 2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
```

**Output:** `[0, 1, 2, 2, 5, 5, 9]`

------

## User-Defined Object Sorting using `Comparable`

To sort an array of user-defined objects using `Arrays.sort()`, the class must implement the `Comparable` interface and override the `compareTo()` method.

### Method Signature

```java
int compareTo(Object o)
```

- Positive: current object > argument
- Zero: current object == argument
- Negative: current object < argument

### Example

```java
class ArrayOfObjects {
    public static void main(String[] args) {
        Student[] students = {
            new Student("A", 96),
            new Student("B", 81),
            new Student("C", 76),
            new Student("D", 73),
            new Student("E", 68)
        };

        Arrays.sort(students);
        System.out.println(Arrays.toString(students));
    }
}

class Student implements Comparable {
    String name;
    int marks;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return "Student [name=" + name + ", marks=" + marks + "]";
    }

    public int compareTo(Object o) {
        Student s = (Student) o;
        return this.marks - s.marks;
    }
}
```

------

## User-Defined Sorting with `Comparator`

When multiple sorting conditions are needed, or sorting logic should not reside inside the entity class, `Comparator` is a better solution.

### Method Signature

```java
int compare(Object o1, Object o2)
```

### Example

```java
class Main {
    public static void main(String[] args) {
        Employee[] employees = {
            new Employee("A", 1000, 2),
            new Employee("B", 2000, 3),
            new Employee("C", 1500, 1),
            new Employee("D", 3000, 5)
        };

        Arrays.sort(employees, new EmpSalCompare());
        Arrays.sort(employees, new EmpYopCompare());
        Arrays.sort(employees, new EmpNameCompare());

        System.out.println(Arrays.toString(employees));
    }
}

class Employee {
    String name;
    int sal;
    int yop;

    Employee(String name, int sal, int yop) {
        this.name = name;
        this.sal = sal;
        this.yop = yop;
    }

    public String toString() {
        return "Employee [name=" + name + ", sal=" + sal + ", yop=" + yop + "]";
    }
}

class EmpSalCompare implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.sal - e2.sal;
    }
}

class EmpYopCompare implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.yop - e2.yop;
    }
}

class EmpNameCompare implements Comparator {
    public int compare(Object o1, Object o2) {
        Employee e1 = (Employee) o1;
        Employee e2 = (Employee) o2;
        return e1.name.compareTo(e2.name);
    }
}
```

------

## Cursor in Java Collections

A **cursor** is used to iterate over collection elements. Java provides three types:

1. **Iterator** – for all collections
2. **ListIterator** – for lists only
3. **Enumeration** – for legacy classes like `Vector`

### Iterator Methods

- `boolean hasNext()`
- `Object next()`
- `void remove()`

### Example

```java
List<Integer> list = new ArrayList<>();
list.add(1); list.add(2); list.add(3);
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

*Disadvantage:* Iterator can only move in the forward direction.

------

## ListIterator

Supports **bidirectional traversal**.

### Methods

- `boolean hasNext()`
- `Object next()`
- `boolean hasPrevious()`
- `Object previous()`
- `void remove()`

### Example

**Forward Traversal:**

```java
List<Integer> list = new ArrayList<>();
list.add(1); list.add(2); list.add(3);
ListIterator<Integer> li = list.listIterator();
while (li.hasNext()) {
    System.out.println(li.next());
}
```

**Backward Traversal:**

```java
while (li.hasPrevious()) {
    System.out.println(li.previous());
}
```

------

## Enumeration

Used to iterate over legacy classes like `Vector`.

### Example

```java
Vector<Integer> v = new Vector<>();
v.add(1); v.add(2); v.add(3);
Enumeration<Integer> e = v.elements();
while (e.hasMoreElements()) {
    System.out.println(e.nextElement());
}
```

------

## Set Interface

- Child interface of `Collection`
- Does not maintain insertion order
- Does not allow duplicate elements
- Allows at most one null value

### Implementations

- `HashSet`
- `LinkedHashSet`
- `TreeSet`

------

## HashSet Overview

- Does not preserve insertion order.
- Uses `hashCode()` and `equals()` methods to prevent duplicate entries.
- Internally uses a **Hashtable**, and from Java 8+, a **Balanced Tree (Red-Black Tree)** in case of collisions.
- Positioning logic: `(element.hashCode() % capacity)` determines storage bucket.

### Example

```java
Set<Integer> s = new HashSet<>();
s.add(43); s.add(34); s.add(22); s.add(90); s.add(78);
System.out.println(s);

Iterator<Integer> it = s.iterator();
while (it.hasNext()) {
    System.out.println(it.next());
}
```

------

## SortedSet Interface

A **SortedSet** stores elements in **ascending order** and provides navigation methods.

### Common Methods

- `SortedSet subset(Object start, Object end)`
- `SortedSet headset(Object toElement)`
- `SortedSet tailSet(Object fromElement)`
- `Object first()`
- `Object last()`

### Example

```java
SortedSet<Integer> s = new TreeSet<>();
s.add(10); s.add(20); s.add(30); s.add(40); s.add(50);
System.out.println(s.subSet(20, 50)); // [20, 30, 40]
System.out.println(s.headSet(30));    // [10, 20]
System.out.println(s.tailSet(30));    // [30, 40, 50]
```

------

## NavigableSet Interface

Extends `SortedSet` and includes additional **navigation methods**.

### Common Methods

- `Object higher(Object o)` – next higher
- `Object lower(Object o)` – next lower
- `Object ceiling(Object o)` – equal or higher
- `Object floor(Object o)` – equal or lower
- `Object pollFirst()` – removes and returns first
- `Object pollLast()` – removes and returns last

### Example

```java
NavigableSet<Integer> s = new TreeSet<>();
s.add(23); s.add(34); s.add(56); s.add(67);
System.out.println(s.higher(34)); // 56
System.out.println(s.floor(56));  // 56
System.out.println(s.pollFirst()); // 23
System.out.println(s);
```

------

## LinkedHashSet

- Preserves insertion order.
- Internally uses a **Hashtable** and a **Doubly Linked List**.

### Example

```java
Set<Integer> s = new LinkedHashSet<>();
s.add(10); s.add(22); s.add(43);
System.out.println(s); // [10, 22, 43]
```
