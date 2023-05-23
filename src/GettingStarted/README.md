# Getting Started

## Variables

---

Suppose we want to create a adder that takes in 2 number and outputs the sum.

5 + 3 (input) → ADDER → 8 (output)

### How to store data?

Variables are buckets or containers which store values. Each variable in Java has a type associated with it which id defined at the time of declaration.

```
int marks = 20;
```

**Variable name** → a label for the memory location

**Value** → some data that will be stored

**Storage** → place where data will be stored (mainly RAM)

**Declaration** → Announcing a variable (usually done at the beginning of a program)

**Naming conventions** → set of rules for declaring a variable

**Assignment** → Setting a value to the variable

**Java is a strongly typed programming language so each variable needs to be declared before using it.**

## Data Types

---

Data types mean to identify the type of the data and associate the operations on that data. Data types define the value a variable can take.

**Data types also give us information about —**

1. The size of the memory location
2. The maximum and minimum value of range in that memory location
3. Different types of operations that can be done on the memory location

### Primitive and Non-primitive data types

---

1. Primitives data types are the ones that are provided outside the box by Java
2. Non-primitive data types are user created data types (with the help of Objects and Classes)

**Data types:**

- **Primitive data types:**
    - Numeric
        - Integers (`byte` `short` `int` `long`)
        - Floating points (`double` `float`)
    - Non-numeric
        - Character (`char`)
        - Boolean (`boolean`)
- **Non-primitive data types:**
    - String
    - Arrays
    - User defined classes

## Strings in Java

---

1. Strings are non-primitive data types
2. A string is a sequence of characters
3. A single line of string is denoted with double `""` quotes and double line string is denoted with triple quotes `""" """`

**Java indexes out the strings**

```
String str = "Hello";
str.charAt(0); // H
str.charAt(1); // e
```

**Strings have properties and methods attached to it**

## Typecasting

---

It means changing the data type of a variable from one type to another.

### 1. Widening typecasting

Moving from a smaller data type to a bigger data type

```
int i = 20;
int l = i; // error
```

byte → short → int → long → float → double

This is done automatically by Java

### 2. Explicit typecasting

```
long x = 1000000000;
int y = x;
```

Java does not allow us to do this we need to explicitly specify this to Java

```
int y = (int) x;
```

It means that the value of `x` needs to be first converted to an integer. As long as the  value will be in range of the smaller integer there is no issue.

```
int x = 2000;
byte b = (byte) x;
System.out.println(b) // -48 (this results in lossy conversion)
```

## Constant variables

---

Constant variables are the ones that are declared with `final` keyword. Once the value is initialised it cannot be modified

```
double PI = 3.14;
PI = 3; // variable got re-assigned to a different value

final double PI = 3.14;
PI = 3; // error 
```

## Scanner Class

---

Scanner class is an easy way to accept user input in a Java program.

```
import java.util.Scanner;

Scanner sc = new Scanner(System.in); // Scanner constructor expects an argument
int x = sc.nextInt(); // to read "int" values (similarly other types can be used)
System.out.println(x * x);

String username = sc.nextLine(); // to read "String" inputs
System.out.println(username);
```