# Class 6 — Encapsulation 🔐 & Abstraction 🎭

## Why This Class Matters

Encapsulation and Abstraction are two of the most important OOP concepts.

Together with:

- Inheritance
- Polymorphism

they form the:

```text
Four Pillars of OOP
```

---

# Four Pillars of OOP

```text
1. Encapsulation

2. Abstraction

3. Inheritance

4. Polymorphism
```

---

# Viva Question

### What are the Four Pillars of OOP?

```text
Encapsulation

Abstraction

Inheritance

Polymorphism
```

---

# PART 1 — ENCAPSULATION 🔐

---

# What is Encapsulation?

Definition:

```text
Binding data and methods
together into a single unit
and protecting data using
access modifiers.
```

---

# Real Life Example

ATM Machine

You can:

```text
Withdraw Money

Check Balance
```

But you cannot directly access:

```text
Database
```

Data is protected.

This is:

```text
Encapsulation
```

---

# Example Program

```java
class Student {

    private int marks;

    public void setMarks(
        int marks
    ) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}
```

---

# Why Use private?

```java
private int marks;
```

Now nobody can do:

```java
s.marks = -100;
```

Direct access blocked.

---

# Data Hiding

Data is hidden from outside classes.

This concept is called:

```text
Data Hiding
```

---

# Getter Method

Used to read data.

```java
public int getMarks()
{
    return marks;
}
```

---

# Setter Method

Used to modify data.

```java
public void setMarks(
    int marks
)
{
    this.marks = marks;
}
```

---

# Complete Program

```java
class Student {

    private int marks;

    public void setMarks(
        int marks
    ) {
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }
}

public class Main {

    public static void main(
        String args[]
    ) {

        Student s =
            new Student();

        s.setMarks(95);

        System.out.println(
            s.getMarks()
        );
    }
}
```

---

# Output

```text
95
```

---

# Advantages of Encapsulation

### Security

Data is protected.

---

### Data Hiding

Variables are hidden.

---

### Better Maintenance

Changes become easier.

---

### Controlled Access

Access only through methods.

---

# Viva Questions

### What is Encapsulation?

```text
Binding data and methods
together and protecting data.
```

---

### What is Data Hiding?

```text
Restricting direct access
to variables.
```

---

### How is Data Hiding Achieved?

Using:

```java
private
```

---

### What is Getter?

```text
Method used to get value.
```

---

### What is Setter?

```text
Method used to set value.
```

---

# PART 2 — ABSTRACTION 🎭

---

# What is Abstraction?

Definition:

```text
Showing essential features
and hiding implementation details.
```

---

# Real Life Example

Driving a Car.

You know:

```text
Brake

Accelerator

Steering
```

You don't know:

```text
Fuel Injection

Engine Internals

Gear Mechanism
```

Hidden details.

This is:

```text
Abstraction
```

---

# How is Abstraction Achieved?

Using:

```text
Abstract Classes

Interfaces
```

---

# Abstract Class

A class declared using:

```java
abstract
```

keyword.

---

# Example

```java
abstract class Shape {

    abstract void draw();
}
```

---

# Can We Create Object?

```java
Shape s =
new Shape();
```

❌ Error

---

# Why?

Abstract class is incomplete.

---

# Abstract Method

Method without body.

---

## Example

```java
abstract void draw();
```

No implementation.

Only declaration.

---

# Child Class

Must provide implementation.

```java
class Circle
extends Shape {

    void draw() {

        System.out.println(
            "Drawing Circle"
        );
    }
}
```

---

# Complete Program

```java
abstract class Shape {

    abstract void draw();
}

class Circle
extends Shape {

    void draw() {

        System.out.println(
            "Drawing Circle"
        );
    }
}

public class Main {

    public static void main(
        String args[]
    ) {

        Circle c =
            new Circle();

        c.draw();
    }
}
```

---

# Output

```text
Drawing Circle
```

---

# Interface

More important than abstract class.

An interface contains:

```text
Method Declarations
```

---

# Example

```java
interface Animal {

    void sound();
}
```

---

# Implementation

```java
class Dog
implements Animal {

    public void sound() {

        System.out.println(
            "Bark"
        );
    }
}
```

---

# Complete Program

```java
interface Animal {

    void sound();
}

class Dog
implements Animal {

    public void sound() {

        System.out.println(
            "Bark"
        );
    }
}

public class Main {

    public static void main(
        String args[]
    ) {

        Dog d =
            new Dog();

        d.sound();
    }
}
```

---

# Output

```text
Bark
```

---

# Interface vs Abstract Class

| Interface | Abstract Class |
|------------|----------------|
| implements | extends |
| Supports Multiple Inheritance | Does Not |
| Pure Abstraction | Partial Abstraction |
| No Constructor | Can Have Constructor |

---

# Multiple Inheritance Problem

Consider:

```text
      A
     / \
    B   C
```

Easy.

---

Now:

```text
A     B
 \   /
   C
```

---

Suppose:

```java
A.show()
```

and

```java
B.show()
```

both exist.

---

Question:

```text
Which show()
should C inherit?
```

Confusion.

---

# Diamond Problem

This ambiguity is called:

```text
Diamond Problem
```

---

# Why Java Doesn't Support Multiple Inheritance Through Classes

To avoid:

```text
Diamond Problem
```

---

# Viva Question

### Why Java Doesn't Support Multiple Inheritance Through Classes?

```text
To avoid ambiguity
called Diamond Problem.
```

---

# How Does Java Support Multiple Inheritance?

Using:

```text
Interfaces
```

---

# Example

```java
interface A {

}

interface B {

}

class C
implements A,B {

}
```

---

# Output Prediction

```java
abstract class A {

    abstract void show();
}

class B
extends A {

    void show() {

        System.out.println(
            "Hello"
        );
    }
}
```

---

Call:

```java
new B().show();
```

Output:

```text
Hello
```

---

# Frequently Asked Viva Questions

### What is Abstraction?

```text
Showing essential features
and hiding implementation details.
```

---

### What is Abstract Class?

```text
Class declared using
abstract keyword.
```

---

### Can We Create Object of Abstract Class?

```text
No
```

---

### What is Abstract Method?

```text
Method without body.
```

---

### What is Interface?

```text
Collection of method declarations.
```

---

### Why Use Interface?

```text
To achieve abstraction
and multiple inheritance.
```

---

### Difference Between Interface and Abstract Class?

```text
Interface → implements

Abstract Class → extends
```

---

### What is Diamond Problem?

```text
Ambiguity caused by
multiple inheritance.
```

---

# Quick Revision

## Encapsulation

```text
Data Hiding
```

---

## Abstraction

```text
Hide Implementation
```

---

## Inheritance

```text
Reuse Code
```

---

## Polymorphism

```text
Many Forms
```

---

# Must Memorize

| Concept | Key Point |
|----------|-----------|
| Encapsulation | Data Hiding |
| private | Restrict Access |
| Getter | Read Data |
| Setter | Modify Data |
| Abstraction | Hide Details |
| Abstract Class | Cannot Create Object |
| Abstract Method | No Body |
| Interface | Pure Abstraction |
| implements | Interface Keyword |
| Diamond Problem | Multiple Inheritance Issue |

---

# 30-Second OOP Revision

```text
Encapsulation
=
Data Hiding

Abstraction
=
Hide Implementation

Inheritance
=
Reuse Code

Polymorphism
=
Many Forms
```

---

# Key Takeaways

✅ Encapsulation protects data

✅ Data hiding is achieved using private

✅ Getter reads value

✅ Setter modifies value

✅ Abstraction hides implementation

✅ Abstract classes cannot be instantiated

✅ Interfaces provide abstraction

✅ Java uses interfaces for multiple inheritance

✅ Diamond Problem prevents multiple inheritance through classes

---

# Golden Rule

```text
Protect Data?
      ↓
Encapsulation

Hide Details?
      ↓
Abstraction

Reuse Code?
      ↓
Inheritance

Many Forms?
      ↓
Polymorphism
```

Master these four pillars and you'll answer almost every basic OOP viva question confidently.
