# Identifiers

- These are the names given in Java programs for <u>identification</u> purposes.

- It can be the name of: `class`, `method` or `variable`.

```java
// BasicSyntax.java
class BasicSyntax
{
    public static void main(String[] args)
    {
        System.out.println("Good Nght !! Doston");
    }
}
```

- *<u>Identifiers</u>* present in `BasicSyntax.java`:
  
  - `BasicSyntax` &rarr; User-defined Class.
  
  - `System`, `String`  &rarr;  Pre-defined Classes.
  
  - `main()`, `println()` &rarr;  Pre-defined Methods.
  
  - `args` &rarr;  User-defined Variable.
  
  - `out` &rarr;  Pre-defined Variable.

## Rules for writing Identifiers.

1. *Allowed* Characters:
   
   - 'lowercase' Alphabets : `a - z`
   
   - 'UPPERCASE' Alphabets : `A - Z`
   
   - 'Digits' : `0 - 9`
   
   - Special Characters : `$`, `_`

2. Should never start with *Digits*.
   
   - `Sambit22` ✅
   
   - `22Sambit` ❌

3. *Reserved Keywords* are *prohibited*.
   
   - `class Sambit { ... }` ✅
   - `class static { ... }` ❌
   - `class void { ... }`     ❌
   - `class if { ... }`         ❌

4. *Case-Sensitive*
   
   - This is because the ASCII values for uppercase letters and thier corresponding lowercase letters is different.
   
   - `class Sambit { ... }` $\neq$ `class sambit { ... }`
   
   - `class Switch { ... }` ✅
   
   - `class switch { ... }` ❌
- Some more examples:
  
  - `class $ { ... }` ✅
  
  - `class _ { ... }` ❌
    
    - Since release 9 of Java, `_` cannot be used *individually* for identification.
  
  - `class _name { ... }` ✅
  
  - `class if { ... }` $\neq$ `class If { ... }`
    
    - `(i, f)` &rarr; `(105, 102)` &rarr; `(1101001, 1100110)` $\neq$ `(1001001, 1100110)` &larr; `(73, 102)` &larr; `(I, f)` &larr; If
  
  - `class Sambit Sagar { ... }` ❌
    
    - '` `' is not an allowed character in identifier.

#### What is ASCII Value?

- ASCII - American Standard Code for Information Interchange.

- These are <u>constant</u> <u>integer</u> values given to each and every character for conversion purpose.

- Useful **ASCII** Values:
  
  - `A - Z` $\equiv$ `65 - 90` $\equiv$ `01000001 - 01011010`
  
  - `a - z` $\equiv$ `97 - 122` $\equiv$ `01100001 - 01111010`
  
  - `0 - 9` $\equiv$ `48 - 57` $\equiv$ `00110000 - 00111001`

### Camel Case Rule

- A naming convention used for **better** code readability and consistency.

- `camelCase` defines a specific way of naming *classes*, *methods* and *variables*.
  
  - Words in the name mus **not** be separated by `' '`.
  - First letter of each word must be **Uppercase**.
  - First letter of the first word must be **Lowercase**.

- E.g.: `functionName`, `longerFunctionName`, `evenLongerFunctionName`.
