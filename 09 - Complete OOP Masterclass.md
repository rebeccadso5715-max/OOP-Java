# Class 9 — Complete OOP Masterclass 🚀

## Why This Class Matters

This class covers the advanced Java concepts most commonly asked in:

- External Viva
- Lab Practical Exams
- Placement Interviews

If you understand these topics well, you'll answer viva questions confidently and sound like a strong Java student.

---

# 1. STATIC KEYWORD ⚡

---

# What is static?

A static member belongs to:

```text
Class
```

not:

```text
Object
```

---

# Static Variable

```java
class Student {

    static String college =
        "KIT";
}
```

---

# Access Without Object

```java
System.out.println(
    Student.college
);
```

Output:

```text
KIT
```

---

# Why?

Because:

```text
Only One Copy
Exists
For Entire Class
```

---

# Visualization

```text
Student Class

college = KIT
```

All objects share the same variable.

---

# Static Method

```java
class Demo {

    static void show() {

        System.out.println(
            "Hello"
        );
    }
}
```

Call:

```java
Demo.show();
```

Output:

```text
Hello
```

---

# Why No Object Needed?

Because static belongs to:

```text
Class
```

---

# Most Asked Viva Question

### Why is main() static?

```java
public static void main(
    String args[]
)
```

Answer:

```text
JVM can call main()
without creating an object.
```

---

# 2. FINAL KEYWORD 🔒

---

# What Does final Mean?

```text
Cannot Be Changed
```

---

# Final Variable

```java
final int x = 10;
```

---

Trying:

```java
x = 20;
```

Gives:

❌ Compile-Time Error

---

# Final Method

```java
final void show()
{
}
```

Cannot be:

```text
Overridden
```

---

# Final Class

```java
final class Test
{
}
```

Cannot be:

```text
Inherited
```

---

# Example

```java
final class Test {

}
```

---

```java
class Demo
extends Test
{
}
```

❌ Error

---

# Viva Question

### Why Use final?

```text
To restrict modification
of variables, methods,
or classes.
```

---

# 3. CONSTRUCTOR CHAINING 🔗

---

# What is Constructor Chaining?

Calling one constructor from another constructor.

---

# Example

```java
class Student {

    Student() {

        this(101);

        System.out.println(
            "Default"
        );
    }

    Student(int id) {

        System.out.println(id);
    }
}
```

---

# Object Creation

```java
new Student();
```

---

# Output

```text
101

Default
```

---

# Why?

```java
this(101);
```

calls:

```java
Student(int id)
```

first.

---

# this()

Used to call:

```text
Another Constructor
Of Same Class
```

---

# Examples

```java
this();
```

Default constructor.

---

```java
this(100);
```

Parameterized constructor.

---

# super()

Used to call:

```text
Parent Constructor
```

---

# Example

```java
super();
```

---

# Difference

| this() | super() |
|----------|----------|
| Same Class Constructor | Parent Constructor |
| Current Class | Parent Class |

---

# Viva Question

### Difference Between this() and super()?

```text
this()
→ Current Class Constructor

super()
→ Parent Class Constructor
```

---

# 4. WRAPPER CLASSES 📦

---

# Why Wrapper Classes?

Java Collections store:

```text
Objects
```

not:

```text
Primitive Types
```

---

# Primitive vs Wrapper

| Primitive | Wrapper |
|------------|----------|
| int | Integer |
| double | Double |
| char | Character |
| boolean | Boolean |
| float | Float |
| long | Long |

---

# Example

```java
Integer x = 10;
```

---

# Viva Question

### Why Use Wrapper Classes?

```text
Collections require objects,
not primitive types.
```

---

# 5. AUTOBOXING & UNBOXING 🔄

---

# Autoboxing

Primitive → Object

---

Example:

```java
int a = 10;

Integer x = a;
```

Automatically converts:

```text
int → Integer
```

---

# Unboxing

Object → Primitive

---

Example:

```java
Integer x = 10;

int a = x;
```

Automatically converts:

```text
Integer → int
```

---

# Memory Trick

```text
Primitive
    ↓
Object

Autoboxing
```

---

```text
Object
    ↓
Primitive

Unboxing
```

---

# 6. GARBAGE COLLECTION 🗑️

---

# What is Garbage Collection?

Java automatically removes:

```text
Unused Objects
```

from memory.

---

# Example

```java
Student s =
new Student();
```

---

```java
s = null;
```

Now object has:

```text
No Reference
```

---

Object becomes:

```text
Eligible For
Garbage Collection
```

---

# Who Performs Garbage Collection?

Answer:

```text
JVM Garbage Collector
```

---

# Advantage

```text
Prevents Memory Leaks
```

---

# Viva Question

### Who Performs Garbage Collection?

```text
JVM Garbage Collector
```

---

# 7. JVM MEMORY 🧠

Very Common External Viva Topic.

---

# JVM Memory Structure

```text
JVM Memory

├── Stack

└── Heap
```

---

# Stack Memory

Stores:

```text
Local Variables

Method Calls
```

---

# Example

```java
int x = 10;
```

Stored in:

```text
Stack
```

---

# Heap Memory

Stores:

```text
Objects
```

---

Example:

```java
Student s =
new Student();
```

Object stored in:

```text
Heap
```

---

Reference stored in:

```text
Stack
```

---

# Visualization

```text
Stack

s
│
▼

Heap

Student Object
```

---

# Viva Question

### Where Are Objects Stored?

```text
Heap Memory
```

---

### Where Are Local Variables Stored?

```text
Stack Memory
```

---

# 8. STRING IMMUTABILITY 🔐

---

# What is Immutability?

Once created:

```text
String Cannot Be Modified
```

---

# Example

```java
String s = "Java";
```

---

```java
s = s + " OOP";
```

---

Does Java modify original string?

❌ No

---

Instead:

```text
Creates New String Object
```

---

# Visualization

```text
"Java"

↓

New Object

"Java OOP"
```

---

# Why Are Strings Immutable?

### Security

Safer programs.

---

### Thread Safety

Multiple threads can use strings safely.

---

### Performance

String pool optimization.

---

# Viva Question

### Why Are Strings Immutable?

```text
Security

Thread Safety

Performance
```

---

# Advanced Output Questions

---

# Question 1

```java
class Test {

    static int x = 10;

    public static void main(
        String args[]
    ) {

        System.out.println(x);
    }
}
```

Output:

```text
10
```

---

# Question 2

```java
final int x = 10;

x = 20;
```

Output:

```text
Compile-Time Error
```

---

# Question 3

```java
class A {

    A() {

        System.out.println(
            "A"
        );
    }
}

class B extends A {

    B() {

        System.out.println(
            "B"
        );
    }
}

new B();
```

Output:

```text
A

B
```

---

# Frequently Asked Viva Questions

### What is static?

```text
Belongs to class,
not object.
```

---

### Why is main() static?

```text
JVM can call it
without object creation.
```

---

### What is final?

```text
Cannot be changed.
```

---

### What is Constructor Chaining?

```text
Calling one constructor
from another constructor.
```

---

### What is Wrapper Class?

```text
Object version of
primitive data type.
```

---

### What is Autoboxing?

```text
Primitive → Object
```

---

### What is Unboxing?

```text
Object → Primitive
```

---

### What is Garbage Collection?

```text
Automatic removal
of unused objects.
```

---

### Where Are Objects Stored?

```text
Heap Memory
```

---

### Where Are Local Variables Stored?

```text
Stack Memory
```

---

### Why Are Strings Immutable?

```text
Security

Thread Safety

Performance
```

---

# Quick Revision

## static

```text
Belongs To Class
```

---

## final

```text
Cannot Change
```

---

## this()

```text
Current Class Constructor
```

---

## super()

```text
Parent Constructor
```

---

## Wrapper Classes

```text
int → Integer

double → Double
```

---

## Garbage Collection

```text
JVM Removes
Unused Objects
```

---

## JVM Memory

```text
Stack → Variables

Heap → Objects
```

---

## String

```text
Immutable
```

---

# Must Memorize

| Concept | Key Point |
|----------|-----------|
| static | Class Member |
| final | Cannot Change |
| this() | Same Class Constructor |
| super() | Parent Constructor |
| Integer | Wrapper for int |
| Autoboxing | Primitive → Object |
| Unboxing | Object → Primitive |
| Garbage Collection | Removes Unused Objects |
| Stack | Variables |
| Heap | Objects |
| String | Immutable |

---

# 60-Second OOP Revision 🚀

```text
Encapsulation
=
Data Hiding

Abstraction
=
Hide Implementation

Inheritance
=
Code Reuse

Polymorphism
=
Many Forms

static
=
Class Member

final
=
Cannot Change

Wrapper
=
Object Version Of Primitive

Garbage Collection
=
JVM Removes Unused Objects

Stack
=
Variables

Heap
=
Objects

String
=
Immutable
```

---

# Golden Rule

```text
Class Member?
      ↓
static

Cannot Change?
      ↓
final

Current Constructor?
      ↓
this()

Parent Constructor?
      ↓
super()

Unused Object?
      ↓
Garbage Collector

Object Storage?
      ↓
Heap

Variable Storage?
      ↓
Stack
```

Master these concepts and you'll be prepared for nearly every Java OOP viva question from beginner to advanced level.
