# Constraints

- **Rules** given to a column to *validate* the data.

- They are of 5 types:
  
  - UNIQUE
  
  - NOT NULL
  
  - CHECK
  
  - PRIMARY KEY
  
  - FOREIGN KEY

- **UNIQUE**: Should **NOT** accept *duplicate* or *repeated* values.

- **NOT NULL**: Should **NOT** accept *NULL* values.

- **CHECK**:  Provides **extra** *validation* with a *condition*.
  
  - If *condition* is satisfied, value is accepted,
  
  - Else, value is rejected.

- **PRIMARY KEY**: Used to **identify** a record *uniquely* from a table.
  
  - There can only be one **PRIMARY KEY** in a table.
  
  - **PRIMARY KEY** does not accept *NULL* values($\equiv$ `NOT NULL`).
  
  - **PRIMARY KEY** does not accept *duplicate* or *repeated* values($\equiv$ `UNIQUE`).
  
  - **PRIMARY KEY** is not *mandatory*, but ***highly recommended***

- **FOREIGN KEY**: Used to **establish** a connection between two tables.
  
  - There can be *multiple* **FOREIGN KEY**s in a table.
  
  - **FOREIGN KEY** belongs to a *parent* table but, actually present in *child* table.
  
  - For an *attribute* to become **FOREIGN KEY**, it has to be a **PRIMARY KEY** in it's *own* table.
  
  - **FOREIGN KEY** is also known as *Referential Integrity Constraint*.
