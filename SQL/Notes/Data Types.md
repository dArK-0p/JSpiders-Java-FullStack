# Data Types

Used to **Specify** the *type* of a **Data** stored at a specific location.

- Data types are *classified* into **5** types:
  - `CHAR`
  - `VARCHAR` / `VARCHAR2`
  - `NUMBER`
  - `DATE`
  - Large Object:
    - Character Large Object (`CLOB`). &rarr; **4GB**
    - Binary Large Object (`BLOB`). &rarr; **4GB**

## `CHAR`

- Stores *sequence of characters*.
- **Syntax**: `CHAR(size)`.
  - **Size**: No. of characters that can be stored in the cell.
  - *MAX SIZE* = 2000.
- Character Sequences are always enclosed within `''`.
  - E. g. : `'Sambit'`.
- Follows a **Fixed Length** memory allocation.
  - `CHAR(10)` -> `|S|a|m|b|i|t| | | | |`
    			                                      `Unused Memory` -> &uarr; &uarr; &uarr; &uarr;
- Some Common Characters are: `A - Z`, `a - z`, `0 - 9`, `!`, `@`, etc.

## `VARCHAR` / `VARCHAR2`

- Stores *sequence of characters*.
- **Syntax**: `VARCHAR(size)` OR `VARCHAR2(size)`
  - **Size**: No. of characters that can be stored in the cell.
  - *MAX SIZE*  = 2000 for `VARCHAR`
  - *MAX SIZE*  = 4000 for `VARCHAR2`
- Character Sequences are always enclosed within `''`.
  - E. g. : `'Sambit'`.
- Follows a **Variable Length** memory allocation.
  - `VARCHAR(10)` -> `|S|a|m|b|i|t|`
  - No *unused memory*.
- Some Common Characters are: `A - Z`, `a - z`, `0 - 9`, `!`, `@`, etc.

## `NUMBER`

- Used to *assign* **only numeric** value to a column.
- **Syntax**: `NUMBER(precision, scale)`
  - **Precision**: No. of Digits.
  - **Scale**: No. of Digits within `precision`, after decimal(`.`).

## `DATE`

- Used to store Date in *Specific* format.
- **Syntax**: `DATE(DD-MM-YY)` OR `DATE(DD-MM-YYYY)`

## Large Object

### Character Large Object (`CLOB`)

Used to store *large* amount of **characters** upto **4GB**.

### Binary Large Object (`BLOB`)

Used to store *binary* values of **images, Videos, etc.** upto **4GB**.
