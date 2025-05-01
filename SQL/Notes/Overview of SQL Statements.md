# SQL Statements

- 5 Types:
  
  - **DDL** - **D**ata **D**efinition **L**anguage.
  
  - **DML** - **D**ata **M**anipulation **L**anguage.
  
  - **TCL** - **T**ransaction **C**ontrol **L**anguage.
  
  - **DCL** - **D**ata **C**ontrol **L**anguage.
  
  - **DQL** - **D**ata **Q**uery **L**anguage.

## DQL - Data Query Language

- Used to *retrieve* the data from the table.

- Has **4** Statements:
  
  - `SELECT`
  
  - `PROJECTION`
  
  - `SELECTION`
  
  - `JOINS`

### SELECT and PROJECTION

- `SELECT` is used to *retrieve* the data from the table and *display* it.

- `PROJECTION` is the process or phenomenon of *retrieving* the data by *only selecting columns*.

- In projection all the records present in a particular column are selected by default.

- **Syntax**: `SELECT` `* / [DISTINCT] COLUMN NAME / EXPRESSION` `[ALIAS]`

#### Order of Execution

- `FROM` clause &rarr;  `SELECT` clause.
1. `FROM` clause **starts** the execution pf a projection.
2. `FROM` clause will accept **table name** as an **argument**.
3. `FROM` clause **searches** the database for the table and **puts** the table under **execution**.
4. `SELECT` clause will get executed **after** the execution of `FROM` clause.
5. `SELECT` clause can be passed **3** arguments:
   - `*` - All columns.
   
   - `column name` - Name of the column to be selected from.
   
   - `expression` - Mathematical Expression.

6- `SELECT` clause *selects* the column(s) mentioned from the the* table under execution*.

7- `SELECT` clause is **responsible** for preparing the **result table**.

#### DISTINCT

- Used to **remove** *duplicate* records from the result table.

- `DISTINCT` clause has to be used as the 1$^{st}$ argument of a ``SELECT` clause.

- In case *multiple cloumns* are *passed* to the `DISTINCT` clause, it **removes** the **combination of cloumns** in which the records are **repeated**. 

#### Expression

- **Any** statement which *gives* a **result**.

- **Always** a *combination* of **operators** and **operands**.

#### Alias

- **Alternate name** given to *column* or *an expression* in the result table.

### SELECTION

- Phenomenon of *retrieving* the data by selecting **both** *rows* and *columns*.

- **Syntax**:
  
  ```sql
  SELECT * / [DISTINCT] COLUMN NAME / EXPRESSION [ALIAS]
  FROM TABLE_NAME
  WHERE FILTER_CONDITION;
  ```

#### WHERE

- Used to *filter* the records.
1. `WHERE` clause executes **after** the `FROM` clause.

2. `WHERE` clause *executes* *row* by *row*.

3. `WHERE` clause supports *multiple* `FILTER-CONDITIONs` with the help of logical operators.


