# Data Query Language Statements.

- Used to **retrieve** the data from **Database**.

- **Syntax**:

  ```sql
  SELECT * / [DISTINCT] column_name / expression AS [ALIAS]
  FROM table_name;
  ```

- **Parts**: Select, Projection, Selection, Joins.

## Syntax Description

### `SELECT` `<arguments>`

Used to *retrieve* **Data** from table and *display* it.

- **Arguments**:
  - `*` /
  - `COLUMN_NAME` /
  - `expression`
- `SELECT` is **responsible** for *preparing* the result table.

#### `DISTINCT`

- **Filters** *duplicate* records from the result table.
- Always used right after the `SELECT` clause.
- Allows *multiple* columns to be specified.
  - Removes rows that have the **same combination of values** across all those columns.

#### `expression`

**Valid** combination of *operands* and *operators* that results in a *single* value.

#### `ALIAS`

**Alternate name** given to a column or an expression in the result table.

---

### Projection(from Relational Algebra)

**Phenomenon** of *retrieving* **Data** by selecting a *specific column*.

- **All records** present inside a *selected* column are by default **selected**.
- Also known as, **Column-wise** filtering.

---

### `FROM` `table_name`

Used to *specify* the `table_name` to be **put under execution**.

---

## Selection

Process of *filtering* rows according to a specified condition.

- Also known as, **Row-wise** filtering.
- Implemented using the `WHERE` clause in SQL.

### `WHERE` `<condition>`

- Used to *filter* records.
- **Filters** *row-wise* according to the `<condition>` specified.
- **Multiple** filter conditions can be mentioned using *logical operators*.

## Order of Execution

In SQL, the **logical order of execution** determines how a query is processed internally. This sequence is **different** from the *written* syntax and is essential for understanding correct query behavior and debugging.

### Logical Execution Order of SQL Clauses

| Step | Clause     | Operation Type                  | Description                                                  |
| ---- | ---------- | ------------------------------- | ------------------------------------------------------------ |
| 1    | `FROM`     | Data Retrieval                  | Retrieves tables, applies joins, views, or subqueries.       |
| 2    | `WHERE`    | Row Filtering (*Selection*)     | Filters rows based on specified logical conditions.          |
| 3    | `GROUP BY` | Grouping                        | Organizes rows into groups for aggregation functions.        |
| 4    | `HAVING`   | Group Filtering                 | Filters groups formed in the previous step using aggregate conditions. |
| 5    | `SELECT`   | Column Selection (*Projection*) | Chooses specific columns or computed expressions for output. |
| 6    | `ORDER BY` | Sorting                         | Sorts the final output rows based on one or more expressions. |
| 7    | `LIMIT`    | Row Limiting                    | Restricts the number of rows returned in the final result.   |

------

- The `FROM` clause initiates execution by scanning the database and preparing the working dataset.
- The `WHERE` clause applies *selection logic* to eliminate rows that do not meet the criteria.
- The `GROUP BY` clause forms grouped subsets of the filtered rows for aggregation.
- The `HAVING` clause applies conditions to those groups, unlike `WHERE` which applies to individual rows.
- The `SELECT` clause performs *projection* by computing and returning the final column set after filtering and grouping.
- Aliases defined in the `SELECT` clause cannot be referenced in `WHERE` or `GROUP BY`, but can be used in `ORDER BY`.
- The `DISTINCT` keyword, when used, removes duplicate rows **after** the `SELECT` clause processes the data.

---