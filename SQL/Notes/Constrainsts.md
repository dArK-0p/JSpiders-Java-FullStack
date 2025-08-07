# Constraints

- These are the *rules* given to a column to validate the **Data**.
- Constraints are of **5** types:
  - `UNIQUE`
  - `NOT NULL`
  - `CHECK`
  - `PRIMARY KEY`
  - `FOREIGN KEY`

## `UNIQUE`

**Ensures** that the column has no *repeated* or *duplicate* values.

## `NOT NULL`

**Ensures** that the column has no `null` values.

## `CHECK`

**Ensures** that the column meets an explicit *condition*. If the **condition** is *true*, **Data** is selected, else rejected.

## `PRIMARY KEY`

Used to **identify** an **Entity / Record** uniquely.

### Characteristics

- There can be only **one** `PRIMARY KEY` in a table.
- `PRIMARY KEY` is **always** `NOT NULL` and `UNIQUE`.
- It is **not** *mandatory* (but, **recommended**) to have a `PRIMARY KEY` in a table.

## `FOREIGN KEY` : REFERENTIAL INTEGRITY CONSTANT

Used to **establish** a connection between two tables.

### Characteristics

- There can be **multiple** `FOREIGN KEYs` in a table.
- Duplicated and `null` values are **allowed**.
- `FOREIGN KEY` is present in the *child* table, but **references** a `PRIMARY KEY` in the *parent* table.