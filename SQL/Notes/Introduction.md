# Introduction to SQL.

## DATA

**Raw Data** which describes *attributes* of an <u>entity</u>.

## DATABASE

- A *medium* used to store **Data** in a *systematic* manner.
- The basic operations that can be performed on database are: **C R U D** Operations, 
  - **C**reate / Insert
  - **R**ead / Retrieve
  - **Delete** / Drop
  - **U**pdate / Modify.

## DATABASE MANAGEMENT SYSTEM (DBMS)

- Software used to *maintain* and *manage* a **Database**.
- **Features**: 
  - *Authorization**
  - **Authentication*

- A *Query* language is used to communicate with a **Database**.
- Stores **Data** in *file* and *folder* format.

### RELATIONAL DATABASE MANAGEMENT SYSTEM (RDBMS)

- A type of **DBMS** that stores **Data** in *table format*.
- A ***S**tructured **Q**uery **L**anguage*(SQL) is used to communicate with a **RDBMS**.
- **E. F. Codd** is the *founder* of **RDBMS**.

#### TABLE

**Logical Representation** of **Data**, consisting of *Rows* and *Columns*.

#### ROWS

*Represents* **all** the **properties** of an **Entity**.

#### COLUMNS

*Represents* a **single property** of *all* **Entities**.

#### CELL

**Smallest** unit of a *table* which consists of **Data**.

## E. F. CODD RULES

- The **Data** stored in a *cell* must be a **single valued data** to avoid *data loss*.
- The **Data** stored in a **Database** should be in *tabular* format.
  - Also *applicable* to **Metadata**.
- **Metadata**: The *details* of a a **Data**, or *data* of a **Data**.
- The **Data** is stored in *multiple* tables and **connection** among the tables can be established by using `Key` attribute (Common Attribute).
- The **Data** to be entered into a column is **validated** by:
  - *Assigning* Data type.
  - *Assigning* Constraints.
- Data types are **Mandatory** while Constraints are **Optional**.

## Overview of SQL Statements

- **D. D. L.** -> **D**ata **D**efinition **L**anguage.
- **D. M. L.** -> **D**ata **M**anipulation **L**anguage.
- **D. C. L.** -> **D**ata **C**ontrol **L**anguage.
- **D. Q. L.** -> **D**ata **Q**uery **L**anguage.
- **T. C. L.** -> **T**ransaction **C**ontrol **L**anguage.