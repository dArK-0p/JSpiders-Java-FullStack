# Arrays in Java

An **array** is an **indexed collection** of a fixed number of *homogeneous* data elements. Arrays are a foundational structure in Java used for storing multiple values under a single name.

------

## ✅ Advantages

- Store multiple elements using a **single variable**.
- Enable **random access** using indices.
- Arrays are **type-safe** — only elements of the declared type are allowed.

## ❌ Disadvantages

- **Fixed size**: Cannot grow dynamically.
- Only **homogeneous** elements allowed.
- No utility methods like in Java Collections.
- Susceptible to **fragmentation** issues.
- Not suitable for large-scale data manipulation.
- **No key-value mapping** like in maps.

------

## Declaration, Creation, and Initialization

### ✅ Declaration

```java
int[] x;
int x[];

int[][] x;
int x[][];
int[] x[];
int[] x[][]; // multi-dimensional
```

❌ Invalid:

```java
int x[8]; // ❌ Size cannot be specified at declaration
```

### ✅ Creation

Arrays are **objects**, and thus must be created using the `new` keyword.

```java
x = new int[5];
```

**Rules:**

- Size must be specified.
- Acceptable size types: `byte`, `short`, `char`, `int`.
- Size cannot be negative — runtime exception `NegativeArraySizeException`.

```java
int[] x = new int[5];
System.out.println(x.getClass().getName()); // [I
```

### ✅ Initialization

```java
x[0] = 100;
x[1] = 50;
x[2] = 25;
```

Accessing an invalid index (`< 0` or `>= length`) throws `ArrayIndexOutOfBoundsException`.

------

## Array Type → Class Representation

| Array Type  | Class Name |
| ----------- | ---------- |
| `int[]`     | `[I`       |
| `int[][]`   | `[[I`      |
| `byte[]`    | `[B`       |
| `short[]`   | `[S`       |
| `long[]`    | `[J`       |
| `float[]`   | `[F`       |
| `double[]`  | `[D`       |
| `boolean[]` | `[Z`       |
| `char[]`    | `[C`       |

------

## Multi-Dimensional Arrays

```java
int[][] matrix = new int[2][3];
```

Equivalent to:

```java
int[][] matrix = new int[2][];
matrix[0] = new int[3];
matrix[1] = new int[3];
```

Each row is a reference to a separate 1D array:

```java
int[][] jagged = new int[3][];
jagged[0] = new int[3];
jagged[1] = new int[5];
jagged[2] = new int[2];
```

### ✅ 3D Array Example

```java
int[][][] cube = new int[4][3][2];

for (int i = 0; i < 4; i++)
    for (int j = 0; j < 3; j++)
        for (int k = 0; k < 2; k++)
            cube[i][j][k] = 9;

for (int[][] plane : cube) {
    for (int[] row : plane)
        System.out.print(Arrays.toString(row) + " ");
    System.out.println();
}
```

------

## Searching in Arrays

### 🔍 Linear Search

```java
public int linearSearch(int[] arr, int ele) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == ele) return i;
    }
    return -1;
}
```

- Time Complexity: **O(n)**

### 🔍 Binary Search

Array must be **sorted**:

```java
public int binarySearch(int[] arr, int ele) {
    int low = 0, high = arr.length - 1;
    while (low <= high) {
        int mid = (low + high) / 2;
        if (arr[mid] == ele) return mid;
        if (arr[mid] > ele) high = mid - 1;
        else low = mid + 1;
    }
    return -1;
}
```

- Time Complexity: **O(log n)**

------

## Sorting Arrays

### 🔄 Bubble Sort

```java
public void bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length - 1; i++) {
        boolean swapped = false;
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j] > arr[j + 1]) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped) break;
    }
}
```

---

