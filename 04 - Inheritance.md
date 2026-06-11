# Class 4 — Inheritance 👑

## Why Inheritance Matters

Inheritance is one of the **Four Pillars of OOP** and one of the **most frequently asked viva topics**.

It allows:

- Code Reusability
- Better Organization
- Reduced Duplication
- Easy Maintenance

---

# What is Inheritance?

Inheritance allows one class to acquire the properties and methods of another class.

```text
Parent Class
      ↓
Child Class
```

The child class automatically gets access to the parent's members.

---

# Real Life Example

```text
Animal
  ↓
Dog
```

A dog is an animal.

So:

```text
Dog IS-A Animal
```

This is inheritance.

---

# Basic Example

```java
class Animal {

    void eat() {

        System.out.println(
            "Animal Eats"
        );
    }
}

class Dog extends Animal {

    void bark() {

        System.out.println(
            "Dog Barks"
        );
    }
}

public class Main {

    public static void main(
        String args[]
    ) {

        Dog d = new Dog();

        d.eat();

        d.bark();
    }
}
```

---

# Output

```text
Animal Eats

Dog Barks
```

---

# Understanding the Program

Parent Class:

```java
Animal
```

Contains:

```java
eat()
```

---

Child Class:

```java
Dog
```

Contains:

```java
bark()
```

---

Because:

```java
Dog extends Animal
```

Dog can access:

```java
eat()
```

and

```java
bark()
```

---

# extends Keyword

Used for inheritance.

Syntax:

```java
class Child extends Parent
```

Example:

```java
class Dog extends Animal
```

---

# Inheritance Visualization

```text
Animal
   |
   |
extends
   |
   ↓

Dog
```

Dog receives:

```text
eat()
```

from Animal.

---

# Why Use Inheritance?

Without inheritance:

```java
class Dog {

    void eat() {}
}
```

```java
class Cat {

    void eat() {}
}
```

Code duplicated.

---

With inheritance:

```java
class Animal {

    void eat() {}
}
```

```java
class Dog extends Animal {}
```

```java
class Cat extends Animal {}
```

Reuse code.

---

# Types of Inheritance in Java

---

# 1. Single Inheritance

One parent.

One child.

```text
A
↓
B
```

Example:

```java
class A {}

class B extends A {}
```

---

# 2. Multilevel Inheritance

Chain of inheritance.

```text
A
↓
B
↓
C
```

Example:

```java
class A {}

class B extends A {}

class C extends B {}
```

---

# Visualization

```text
Grandparent
      ↓
Parent
      ↓
Child
```

---

# 3. Hierarchical Inheritance

One parent.

Multiple children.

```text
      A
     / \
    B   C
```

Example:

```java
class A {}

class B extends A {}

class C extends A {}
```

---

# 4. Multiple Inheritance

```text
A     B
 \   /
   C
```

---

# Does Java Support It?

❌ No

Not through classes.

---

# Why Not?

To avoid:

```text
Diamond Problem
```

Ambiguity.

---

# Supported Through Interfaces

```java
interface A {}

interface B {}

class C implements A, B {}
```

---

# Constructor in Inheritance

Parent constructor runs first.

---

## Example

```java
class A {

    A() {

        System.out.println(
            "Parent"
        );
    }
}

class B extends A {

    B() {

        System.out.println(
            "Child"
        );
    }
}
```

---

# Object Creation

```java
B obj = new B();
```

---

# Output

```text
Parent

Child
```

---

# Why?

Java automatically calls:

```java
super();
```

first.

---

# super Keyword

Used to refer parent class.

---

# Example

```java
class A {

    A() {

        System.out.println("A");
    }
}

class B extends A {

    B() {

        super();

        System.out.println("B");
    }
}
```

---

# Output

```text
A

B
```

---

# Uses of super

## Call Parent Constructor

```java
super();
```

---

## Call Parent Method

```java
super.show();
```

---

## Access Parent Variable

```java
super.x
```

---

# Method Overriding

Same method in:

```text
Parent

and

Child
```

Child provides its own implementation.

---

# Example

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

# Output

```text
Bark
```

Child method overrides parent method.

---

# Runtime Polymorphism

```java
Animal a =
new Dog();

a.sound();
```

Output:

```text
Bark
```

Even though reference is:

```java
Animal
```

actual object is:

```java
Dog
```

So child method runs.

---

# Viva Question

### What is Runtime Polymorphism?

```text
Method call is resolved
at runtime based on
actual object.
```

---

# Overloading vs Overriding

| Overloading | Overriding |
|-------------|------------|
| Same Class | Parent-Child |
| Parameters Different | Parameters Same |
| Compile Time | Run Time |
| Multiple Methods | Redefined Method |

---

# Example of Overloading

```java
void add(int a,int b)
{
}

void add(int a,int b,int c)
{
}
```

Different parameters.

---

# Example of Overriding

```java
class A {

    void show() {}
}

class B extends A {

    void show() {}
}
```

Same signature.

---

# IS-A Relationship

Inheritance creates:

```text
IS-A
```

relationship.

Example:

```java
Dog extends Animal
```

Meaning:

```text
Dog IS-A Animal
```

---

# HAS-A Relationship

Composition creates:

```text
HAS-A
```

relationship.

Example:

```java
Car has Engine
```

```text
Car HAS-A Engine
```

---

# Viva Question

### Difference Between IS-A and HAS-A?

IS-A:

```text
Inheritance
```

Example:

```text
Dog IS-A Animal
```

---

HAS-A:

```text
Composition
```

Example:

```text
Car HAS-A Engine
```

---

# Exam Trick Question

```java
class A {

    void show() {

        System.out.println("A");
    }
}

class B extends A {
}

public class Main {

    public static void main(
        String args[]
    ) {

        B obj = new B();

        obj.show();
    }
}
```

---

# Output

```text
A
```

---

# Why?

Because:

```java
show()
```

was inherited.

---

# Frequently Asked Viva Questions

### What is Inheritance?

```text
Acquiring properties
and methods of another class.
```

---

### Which Keyword Is Used?

```java
extends
```

---

### Why Use Inheritance?

```text
Code Reusability
```

---

### Can Java Support Multiple Inheritance?

```text
Not through classes.

Possible through interfaces.
```

---

### What is Method Overriding?

```text
Same method signature
in parent and child class.
```

---

### What is super?

```text
Refers to parent class.
```

---

### Which Constructor Executes First?

```text
Parent Constructor
```

---

### What is Runtime Polymorphism?

```text
Child method executes
through parent reference.
```

---

# Memory Tricks

## Inheritance

```text
Parent
   ↓
Child
```

---

## Constructor Order

```text
Parent

↓

Child
```

---

## Relationships

```text
IS-A
   ↓
Inheritance
```

```text
HAS-A
   ↓
Composition
```

---

# Must Memorize

| Keyword | Purpose |
|----------|----------|
| extends | Inheritance |
| super() | Parent Constructor |
| super.show() | Parent Method |
| Override | Redefine Parent Method |
| IS-A | Inheritance |
| HAS-A | Composition |

---

# Key Takeaways

✅ Inheritance promotes code reuse

✅ extends keyword is used

✅ Java supports Single, Multilevel, Hierarchical inheritance

✅ Multiple inheritance not supported through classes

✅ Parent constructor executes first

✅ super refers to parent class

✅ Overriding enables runtime polymorphism

✅ IS-A = Inheritance

✅ HAS-A = Composition

---

# Golden Rule

```text
Parent Class
      ↓
extends
      ↓
Child Class
      ↓
Code Reuse
```

Inheritance is one of the most important OOP concepts and appears in almost every Java viva, practical exam, and interview.
