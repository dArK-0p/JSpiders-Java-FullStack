# Introduction To Java

### What is Java?

Java is a <u>Programming Language</u>, using which it is possible to **create** a software or **test** a software.

### 1. ***What*** is Happening?

##### Java Source Code Execution Procedure.

![Java code execution process](Images/JSC%20execution%20process.png "Java Source Code Execution Process.")  

The code written by the programmer is known as <u>Java Source Code(**JSC**)</u>. This code is not understandable by the System. In order to make our System understand the JSC, two software are introduced: 

1. Compiler.

2. Java Virtual Machine(**JVM**).

###### **Compiler** -

- A piece of software that understands the JSC.

- It *compiles* the JSC by:
  
  - *checking* the syntax(format),
  
  - *converting* the JSC into Byte Code(**ByC**),
  
  - then forwarding the byte code to the JVM.

*This is done because the JVM only understands Byte Code.*

###### **Java Virtual Maachine(JVM)** -

- A piece of software that runs/executes the code.

- It *executes* the code by:
  
  - *receiving* the ByC,
  
  - *checking* for run-time errors,
  
  - *converting* ByC into Binary Code(**BiC**).

*This is done because the System only understands Binary Code(also known as **Machine Code**)*.

Once the System receives the BiC, it's processor processes the BiC to produce the **Output**.

In order to perform any Java related Operation, we require a <u>Software</u>, which is known as **IDE**.

### 2. ***Where*** is it Happening?

##### **Integrated Development Environment(IDE)**

- Provides a <u>Platform</u> where any java related operation can be performed.

- Some IDEs are:
  
  - *Code Editors:*
    
    1. Notepad,
    
    2. Notepad++,
    
    3. EditPlus, etc.
  
  . *Advanced IDEs:*
  
  1. Eclipse,
  
  2. VSCode,
  
  3. IntelliJ,
  
  4. Sublime, etc.

. In order to perform any java related operations in the IDE, another software is required, which is known as **JDK**.

### 3. ***Who*** will be of help?

##### Java Development Kit(JDK)

- Provides the necessary <u>tools or kits</u> which can be used to perform any java related operation in the IDE.

### 4. ***Using what*** does the process work?

##### Major Components of Java:

1. Class,

2. Method,

3. Variable,

4. Object.

##### Basic Syntax of Java:

```java
class BasicSyntax
{
    public static void main(String[] args)
    {
        System.out.println("Good Nght !! Doston");
    }
}
```

- `class BasicSyntax { ... }` &rarr; class 

- `public static void main( ... ) { ... }` &rarr; method

- `System.out.println( ... );` &rarr; printing statement

### 5. ***What*** needs to be done?

##### **WRITE &rarr; SAVE &rarr; COMPILE&rarr; RUN &rarr; OUTPUT**

### 6. ***How*** is it done?

To get output from a java code, certain steps are to be followed:

1. *Write*: Type the code.

2. *Save*: The code needs to be saved at an accessible path.

3. *Compile*: The JSC is compiled using the commands of the compiler.
   
   ```cmd
   javac path\to\fileName.java
   ```
   
   - After successful compilation, a `.class` file is generated, which is the ByC.

4. *Run/Execute*: The ByC is processed by JVM using its' commands.
   
   ```cmd
   java path\to\ClassName
   ```
   
   - After converting the ByC to BiC for the System, the System prints the Output.
