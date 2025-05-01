# Data Types

- Used to *specify* the **type** of data to be stored in a specific location.

- There are 5 types of **Data Type**:
  
  - CHAR
  
  - VARCHAR
  
  - NUMBER
  
  - DATE
  
  - Large Objects:
    
    - Character Large Object.
    
    - Binary Large Object.

### CHAR

- Used to store:
  
  - Uppercase or Lowercase Alphabets,
  
  - Numbers,
  
  - Special Characters,
  
  into a specified column.

- Characters must always be enclosed in single quotes(`''`).

- To used the CHAR datatype, it is *necessary* to mention it's **Size**.

- **Syntax:** `CHAR( size )`
  
  - `CHAR(10)`

##### Size

- *Defines* Storage Capacity.
  
  - Specifies the maximum no. of characters a column can store.
  
  - E.g.: `CHAR(10)` &rarr;  Column can store upto 10 characters.

- *Fixed* Storage Allocation.
  
  - `CHAR(n)` always *reserves* exactly `n` bytes of memory.
  
  - Uses `' '` to compensate for *fewer* characters. 

- Maximum capacity: 2000 (varies by database system).

- *Efficient* for fixed-length data.
  
  - Best suited for fixed-length values.
  
  - *Inefficient* for variable-length data because of unnecessary `' '` usage.
    
    ```sql
    CHAR(10) = 'SQL'
    [ 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8 | 9 | 10 ]
    ['S'|'Q'|'L'|' '|' '|' '|' '|' '|' '|' ' ]
                |____________________________|
                                |
                 Unused Memory -> Space Padded
    ```

### VARCHAR

* Used to store:
  
  * Uppercase or Lowercase Alphabets,
  
  * Numbers,
  
  * Special Characters,
  
  into a specified column.
- **Syntax:** `VARCHAR( size )`, `VARCHAR2( size )`
  
  * `VARCHAR(10)`, `VARCHAR2(10)`

- Maximum capacity: `VARCHAR` &rarr;  2000, `VARCHAR2` &rarr; 4000

- *Follows* variable memory allocation.

### NUMBER

- Used to assign only *numeric* values to a column.

- **Syntax:** `NUMBER( precision, scale )`

##### Precision

- *Determines* the no. of digits to store an integer value.

##### Scale

- *Determines* the no. of digits to store after the decimal point(`.`) within the precision.

### DATE

- Used to store date in a *specific* format.

- **Syntax:** `DATE`

### Large Object

- **Character** Large Object - Used to store large amount of *characters* upto **4GB**.
- **Binary** Large Object - Used to store binary values of *images, audios, videos* upto **4GB**.
