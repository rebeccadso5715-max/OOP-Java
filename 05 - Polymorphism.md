# Class 5 — Polymorphism 🎭

## Why Polymorphism Matters

Polymorphism is one of the **Four Pillars of OOP** and one of the most frequently asked Java viva topics.

The word:

```text
Poly = Many

Morph = Forms
```

Meaning:

```text
One Thing
Many Forms
```

---

# What is Polymorphism?

Polymorphism allows the same method or object to behave differently in different situations.

Example:

```text
Animal
```

can become:

```text
Dog

Cat

Lion
```

Each has a different sound.

---

# Real Life Example

```text
Person
```

can act as:

```text
Student

Employee

Teacher
```

Same person.

Different forms.

---

# Types of Polymorphism

Java supports:

## 1. Compile-Time Polymorphism

Achieved using:

```text
Method Overloading
```

---

## 2. Run-Time Polymorphism

Achieved using:

```text
Method Overriding
```

---

# 1. Compile-Time Polymorphism

Also called:

```text
Static Polymorphism
```

Compiler decides which method to execute.

---

# Method Overloading

Same method name.

Different parameters.

---

## Example

```java
class Calculator {

    int add(int a, int b) {

        return a + b;
    }

    int add(
        int a,
        int b,
        int c
    ) {

        return a + b + c;
    }
}
```

---

# Why is This Overloading?

Method name:

```java
add()
```

is same.

Parameters:

```java
(int,int)
```

and

```java
(int,int,int)
```

are different.

---

# Example

```java
Calculator obj =
new Calculator();

System.out.println(
    obj.add(10,20)
);

System.out.println(
    obj.add(10,20,30)
);
```

---

# Output

```text
30

60
```

---

# Rules of Method Overloading

✅ Same method name

✅ Different parameter list

---

❌ Only changing return type is NOT overloading

---

# Wrong Example

```java
int add(
    int a,
    int b
)
{
    return a+b;
}

double add(
    int a,
    int b
)
{
    return a+b;
}
```

Compiler Error.

Because parameters are identical.

---

# Viva Question

### What is Method Overloading?

```text
Multiple methods having
same name but different
parameter lists.
```

---

### Why Use Overloading?

```text
Improves readability
and flexibility.
```

---

# Compile-Time Resolution

Example:

```java
obj.add(10,20);
```

Compiler immediately knows:

```java
add(int,int)
```

should run.

Hence:

```text
Compile-Time Polymorphism
```

---

# 2. Run-Time Polymorphism

Achieved using:

```text
Method Overriding
```

---

# Method Overriding

Child class provides its own version of parent method.

---

## Example

```java
class Animal {

    void sound() {

        System.out.println(
            "Animal Sound"
        );
    }
}

class Dog extends Animal {

    void sound() {

        System.out.println(
            "Bark"
        );
    }
}
```

---

# Object Creation

```java
Animal a =
new Dog();

a.sound();
```

---

# Output

```text
Bark
```

---

# Why?

Because:

```text
Actual Object
=
Dog
```

Runtime decides method.

---

# Method Overriding Rules

## Rule 1

Same method name.

```java
sound()
```

---

## Rule 2

Same parameters.

```java
void sound()
```

---

## Rule 3

Parent-child relationship required.

```java
Dog extends Animal
```

---

# Runtime Polymorphism

Method selection happens:

```text
At Runtime
```

not compile time.

---

# Dynamic Method Dispatch

Most Important Viva Question.

---

## Example

```java
Animal a =
new Dog();
```

Reference:

```java
Animal
```

---

Object:

```java
Dog
```

---

Method Call:

```java
a.sound();
```

---

Output:

```text
Bark
```

---

# Why?

Java looks at:

```text
Actual Object
```

not reference type.

---

This mechanism is called:

```text
Dynamic Method Dispatch
```

---

# Visualization

```text
Animal a
      ↓

new Dog()
      ↓

sound()
      ↓

Dog's Method Runs
```

---

# Output Prediction 1

```java
class A {

    void show() {

        System.out.println("A");
    }
}

class B extends A {

    void show() {

        System.out.println("B");
    }
}

public class Main {

    public static void main(
        String args[]
    ) {

        A obj = new B();

        obj.show();
    }
}
```

---

# Output

```text
B
```

---

# Why?

Runtime Polymorphism.

Child method overrides parent.

---

# Output Prediction 2

```java
class Test {

    void display(int a) {

        System.out.println(
            "One"
        );
    }

    void display(
        int a,
        int b
    ) {

        System.out.println(
            "Two"
        );
    }
}
```

---

## Call

```java
obj.display(10);
```

Output:

```text
One
```

---

## Call

```java
obj.display(10,20);
```

Output:

```text
Two
```

---

# Overloading vs Overriding

| Overloading | Overriding |
|-------------|------------|
| Compile Time | Run Time |
| Same Class | Parent-Child |
| Parameters Different | Parameters Same |
| Faster | Slightly Slower |
| Static Binding | Dynamic Binding |

---

# Constructor Overloading

Possible.

---

## Example

```java
class Student {

    Student() {

    }

    Student(int id) {

    }
}
```

---

# Viva Question

### Can Constructors Be Overloaded?

✅ Yes

---

# Constructor Overriding

Possible?

❌ No

Because constructors are:

```text
Not Inherited
```

---

# Viva Question

### Can Constructors Be Overridden?

```text
No

Constructors are not inherited.
```

---

# Static Method Overriding

Possible?

❌ No

---

## Example

```java
class A {

    static void show() {
    }
}
```

Static methods belong to class.

Not object.

---

# Viva Question

### Can Static Methods Be Overridden?

```text
No

Static methods are resolved
at compile time.
```

---

# Frequently Asked Viva Questions

### What is Polymorphism?

```text
One thing
many forms.
```

---

### Types of Polymorphism?

```text
Compile-Time

Run-Time
```

---

### How is Compile-Time Polymorphism Achieved?

```text
Method Overloading
```

---

### How is Run-Time Polymorphism Achieved?

```text
Method Overriding
```

---

### What is Dynamic Method Dispatch?

```text
Method selection based on
actual object at runtime.
```

---

### Can Constructors Be Overloaded?

```text
Yes
```

---

### Can Constructors Be Overridden?

```text
No
```

---

### Can Static Methods Be Overridden?

```text
No
```

---

# Memory Tricks

## Overloading

```text
Same Name

Different Parameters

Compile Time
```

---

## Overriding

```text
Same Name

Same Parameters

Parent + Child

Run Time
```

---

## Dynamic Method Dispatch

```text
Reference
     ↓

Parent

Object
     ↓

Child

Method
     ↓

Child Method Executes
```

---

# Must Memorize

| Concept | Key Point |
|----------|-----------|
| Overloading | Same Name, Different Parameters |
| Overriding | Same Name, Same Parameters |
| Compile-Time | Overloading |
| Run-Time | Overriding |
| Dynamic Method Dispatch | Runtime Method Selection |
| Constructor Overloading | Allowed |
| Constructor Overriding | Not Allowed |
| Static Method Overriding | Not Allowed |

---

# 10-Second Viva Answer

### What is Polymorphism?

```text
Polymorphism means
one interface with
multiple implementations.

In Java it is achieved through:

1. Method Overloading
   (Compile-Time Polymorphism)

2. Method Overriding
   (Run-Time Polymorphism)
```

---

# Key Takeaways

✅ Polymorphism means one thing, many forms

✅ Overloading = Compile-Time Polymorphism

✅ Overriding = Run-Time Polymorphism

✅ Dynamic Method Dispatch uses actual object type

✅ Constructors can be overloaded

✅ Constructors cannot be overridden

✅ Static methods cannot be overridden

---

# Golden Rule

```text
Different Parameters
        ↓
Overloading
        ↓
Compile Time

----------------

Same Parameters
Parent + Child
        ↓
Overriding
        ↓
Run Time
```

Polymorphism is one of the most important Java OOP concepts and almost guaranteed to appear in viva exams, interviews, and coding assessments.
