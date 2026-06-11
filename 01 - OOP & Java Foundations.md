# Class 1 — OOP & Java Foundations

## Why This Class Matters

Before learning advanced Java concepts like:

- Inheritance
- Polymorphism
- Interfaces
- Collections
- JDBC
- Multithreading

you must understand:

```text
Class
Object
Constructor
Methods
OOP Basics
```

These are the foundation of Java.

---

# What is Java?

Java is a:

- Object-Oriented Language
- Platform Independent Language
- Secure Language
- Robust Language
- Portable Language

Developed by:

```text
Sun Microsystems
```

Currently maintained by:

```text
Oracle
```

---

# Java Program Execution Flow

```text
Java Source Code (.java)
            ↓
       javac Compiler
            ↓
      Bytecode (.class)
            ↓
            JVM
            ↓
          Output
```

---

# Example

```java
class Main
{
    public static void main(String args[])
    {
        System.out.println("Hello World");
    }
}
```

---

# Viva Question

### Q: Why is Java Platform Independent?

### Answer

```text
Java source code is compiled into bytecode.
The bytecode runs on JVM.
Since JVM is available on different operating systems,
the same Java program can run anywhere.
```

---

# What is OOP?

OOP means:

```text
Object Oriented Programming
```

Programming is done using:

```text
Objects
```

instead of only functions.

---

# Four Pillars of OOP

1. Encapsulation
2. Inheritance
3. Polymorphism
4. Abstraction

---

# What is a Class?

A class is:

```text
Blueprint
or
Template
```

used to create objects.

---

## Example

```java
class Student
{
    int id;
    String name;
}
```

Here:

```text
Student
```

is a class.

---

# Real Life Example

```text
Class = House Blueprint

Object = Actual House
```

Blueprint describes:

```text
Rooms
Doors
Windows
```

Actual house is built using it.

---

# What is an Object?

Object is:

```text
Instance of a Class
```

---

## Example

```java
Student s1 = new Student();
```

Here:

```text
Student
```

→ Class

```text
s1
```

→ Object Reference

---

# Visualization

```text
Class

Student
  |
  |
Create Object
  |
  ↓

s1
```

---

# Viva Question

### Q: Difference Between Class and Object?

| Class | Object |
|---------|---------|
| Blueprint | Real Entity |
| Logical | Physical |
| No Memory Allocated | Memory Allocated |
| Used to Create Objects | Created from Class |

---

# Data Members

Variables inside a class.

---

## Example

```java
class Student
{
    int id;
    String name;
}
```

Here:

```text
id
name
```

are data members.

---

# Methods

Functions inside a class.

---

## Example

```java
class Student
{
    void display()
    {
        System.out.println("Hello");
    }
}
```

Here:

```text
display()
```

is a method.

---

# Creating Objects

```java
Student s1 = new Student();
```

Breakdown:

---

### Student

```text
Class Name
```

---

### s1

```text
Reference Variable
```

---

### new

```text
Allocates Memory
```

---

### Student()

```text
Constructor Call
```

---

# Constructor

Constructor is a special method used to initialize objects.

Runs automatically when object is created.

---

## Example

```java
class Student
{
    Student()
    {
        System.out.println(
            "Object Created"
        );
    }
}
```

---

## Object Creation

```java
Student s1 =
    new Student();
```

Output:

```text
Object Created
```

---

# Properties of Constructor

✅ Same name as class

✅ No return type

✅ Runs automatically

✅ Used for initialization

---

# Viva Question

### Q: Does Constructor Have a Return Type?

### Answer

```text
No.

Not even void.
```

---

# Types of Constructors

## 1. Default Constructor

```java
Student()
{
}
```

No parameters.

---

## 2. Parameterized Constructor

```java
Student(int id)
{
    this.id = id;
}
```

Accepts values.

---

# Example

```java
class Student
{
    int id;

    Student(int id)
    {
        this.id = id;
    }
}
```

Object:

```java
Student s1 =
    new Student(101);
```

---

# What is this Keyword?

Represents:

```text
Current Object
```

---

## Example

```java
class Student
{
    int id;

    Student(int id)
    {
        this.id = id;
    }
}
```

---

### Left Side

```java
this.id
```

Class Variable

---

### Right Side

```java
id
```

Parameter

---

# Visualization

```text
this.id = id

  ↓       ↓

Instance  Local
Variable  Variable
```

---

# Viva Question

### Q: Why Use this Keyword?

### Answer

```text
To refer to the current object and
differentiate instance variables from
local variables.
```

---

# Access Specifiers

Control accessibility.

---

## Public

Accessible everywhere.

```java
public int age;
```

---

## Private

Accessible only inside class.

```java
private int age;
```

---

## Protected

Accessible:

```text
Same Package

and

Subclasses
```

```java
protected int age;
```

---

# Access Specifier Table

| Modifier | Same Class | Same Package | Subclass | Other Package |
|-----------|------------|-------------|-----------|-------------|
| private | ✅ | ❌ | ❌ | ❌ |
| protected | ✅ | ✅ | ✅ | ❌ |
| public | ✅ | ✅ | ✅ | ✅ |

---

# Encapsulation

Encapsulation means:

```text
Wrapping Data
and
Methods Together
```

and protecting data.

---

## Example

```java
class Student
{
    private int marks;

    public void setMarks(
        int marks
    )
    {
        this.marks = marks;
    }

    public int getMarks()
    {
        return marks;
    }
}
```

---

# Why Encapsulation?

Benefits:

- Security
- Data Hiding
- Controlled Access
- Better Maintenance

---

# Viva Question

### Q: What is Encapsulation?

### Answer

```text
Binding data and methods together
into a single unit and protecting
data using access modifiers.
```

---

# JVM, JRE and JDK

Most Asked Viva Question.

Relationship:

```text
JDK
 └── JRE
       └── JVM
```

---

# JVM

```text
Java Virtual Machine
```

Responsibilities:

- Executes Bytecode
- Converts Bytecode to Machine Code

---

# JRE

```text
Java Runtime Environment
```

Contains:

- JVM
- Libraries

Used to:

```text
Run Java Programs
```

---

# JDK

```text
Java Development Kit
```

Contains:

- JRE
- Compiler (javac)
- Debugger
- Development Tools

Used to:

```text
Develop Java Applications
```

---

# Viva Question

### Q: Difference Between JVM, JRE and JDK?

### Answer

```text
JVM executes bytecode.

JRE provides runtime environment.

JDK provides development tools
and compiler.
```

---

# Memory Tricks

```text
Class
   ↓
Object
   ↓
Method
```

---

```text
JDK
 ↓
JRE
 ↓
JVM
```

---

```text
private
   ↓
protected
   ↓
public
```

Increasing accessibility.

---

# Complete Mini Program

```java
class Student
{
    int id;

    String name;

    void display()
    {
        System.out.println(id);

        System.out.println(name);
    }
}

public class Main
{
    public static void main(
        String args[]
    )
    {
        Student s1 =
            new Student();

        s1.id = 101;

        s1.name = "Becca";

        s1.display();
    }
}
```

---

# Output

```text
101
Becca
```

---

# Viva Questions (Must Memorize)

### Q1. What is Java?

Object-oriented, platform-independent programming language.

---

### Q2. What is OOP?

Programming using classes and objects.

---

### Q3. What is a Class?

Blueprint used to create objects.

---

### Q4. What is an Object?

Instance of a class.

---

### Q5. What is Constructor?

Special method used to initialize objects.

---

### Q6. Does Constructor Have Return Type?

No.

---

### Q7. What is this Keyword?

Refers to current object.

---

### Q8. What is Encapsulation?

Binding data and methods together while protecting data.

---

### Q9. Difference Between JDK, JRE and JVM?

JDK → Development

JRE → Runtime

JVM → Execution

---

# Key Takeaways

✅ Java is platform independent

✅ OOP revolves around classes and objects

✅ Constructors initialize objects

✅ this refers to current object

✅ Access specifiers control visibility

✅ Encapsulation protects data

✅ JDK > JRE > JVM

---

# Golden Rule Learned

```text
Class
  ↓
Object
  ↓
Method
  ↓
OOP
```

Master these basics first. Every advanced Java topic is built on top of them.
