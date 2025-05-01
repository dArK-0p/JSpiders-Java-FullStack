# Introduction to SQL

### Data:

- Data is a **raw fact** which *describes* the attributes of an <u>Object/Entity</u>.

### Database:

- A <u>place</u> on a *medium* which is used to **store the data** in a *systematic and organized* manner. 

- The basic operations that can be performed on a database are: **C R U D**
  
  - **C**reate $\equiv$ Insert
  
  - **R**ead $\equiv$ Retrieve
  
  - **U**pdate $\equiv$ Modify
  
  - **D**elete $\equiv$ Drop

- Universally these operations are considered as **CRUD** Operations.

### Database Management System: DBMS

- DBMS is a *software* which is used to <u>maintain</u> and <u>manage</u> the database.

- DBMS provides **2** major operations:
  
  - *Authentication*
  
  - Authorisation

- <u>Query Language</u> is **neccessary** to communicate with the DBMS.

- DBMS stores the data in **file and folder** format.

### Relational Database Management System: RDBMS

- It is a type of *DBMS Software* which is used to maintain and manage the database.

- <u>Structured Query language</u> is used to *interact* with RDBMS.

- RDBMS stores data in **table** format.

#### Table:

- *Table* is a logical arrangement of data, which consists of **rows** and **columns**. 

- **Row**:
  
  - Knowns as <u>records</u> or <u>tuples</u>.
  
  - Represents *all the properties* of a **single entity**.

- **Column**:
  
  - Known as <u>attributes</u> or <u>properties</u> or <u>fields</u>.
  
  - Represents a *single property* of **all the entities**.

- **Cell**:
  
  - *Smallest unit* of the table which is used to store the data.

### E. F. Codd Rules:

- The data stored in a *cell* **must** be a *single valued* data, to avoid data loss.

- The data stored in a database should be in the form of a **table**, including <u>metadata</u>.

#### Metadata:

- The *details* of a data. **OR** The *data* about a data.

- According to E. F. Codd, data can be stored in *multiple* tables. If necessary a <u>connection</u> between two tables can be established using **Key/Common** attributes.

- <u>Validation</u> of the data entered into a column can be done:
  
  - By *assigning* data types,
  
  - By *assigning* constraints.

- **Datatypes** are *mandatory*, while **Constraints** are *optional*.


