# Program 2 — Student Class (Classes, Objects & Grade Calculation)

**Difficulty:** Easy

**Concepts Covered:**
- Classes
- Objects
- Constructors
- Methods
- this Keyword
- Conditional Statements
- Grade Calculation
- Scanner Class

---

# Problem Statement

Create a:

```java
Student
```

class containing:

```java
rollNo

name

marks
```

Implement methods:

```java
display()

calculateGrade()
```

Accept student details from user and display grade.

---

# Complete Program

```java
import java.util.Scanner;

class Student {

    int rollNo;

    String name;

    int marks;

    Student(
        int rollNo,
        String name,
        int marks
    ) {

        this.rollNo = rollNo;

        this.name = name;

        this.marks = marks;
    }

    void display() {

        System.out.println(
            "Roll No: " + rollNo
        );

        System.out.println(
            "Name: " + name
        );

        System.out.println(
            "Marks: " + marks
        );
    }

    void calculateGrade() {

        if(marks >= 90)

            System.out.println(
                "Grade A"
            );

        else if(marks >= 75)

            System.out.println(
                "Grade B"
            );

        else if(marks >= 50)

            System.out.println(
                "Grade C"
            );

        else

            System.out.println(
                "Fail"
            );
    }
}

public class Main {

    public static void main(
        String[] args
    ) {

        Scanner sc =
            new Scanner(System.in);

        System.out.print(
            "Enter Roll No: "
        );

        int r = sc.nextInt();

        sc.nextLine();

        System.out.print(
            "Enter Name: "
        );

        String n =
            sc.nextLine();

        System.out.print(
            "Enter Marks: "
        );

        int m =
            sc.nextInt();

        Student s =
            new Student(r,n,m);

        s.display();

        s.calculateGrade();
    }
}
```

---

# Sample Output

```text
Enter Roll No: 101

Enter Name: Rebecca

Enter Marks: 92

Roll No: 101

Name: Rebecca

Marks: 92

Grade A
```

---

# OOP Concepts Used

## Class

```java
class Student
```

A class is a:

```text
Blueprint
```

for creating objects.

---

## Object

```java
Student s =
new Student(...);
```

Object is:

```text
Instance of a Class
```

---

## Constructor

```java
Student(
    int rollNo,
    String name,
    int marks
)
```

Used to initialize object data.

Automatically runs when object is created.

---

## Method

```java
display()

calculateGrade()
```

Methods perform specific tasks.

---

# Understanding Constructor

```java
Student(
    int rollNo,
    String name,
    int marks
)
{
    this.rollNo = rollNo;

    this.name = name;

    this.marks = marks;
}
```

---

# What is this?

```java
this.rollNo = rollNo;
```

Left Side:

```java
this.rollNo
```

Instance Variable

---

Right Side:

```java
rollNo
```

Parameter

---

# Visualization

```text
this.rollNo
      ↓

Student Object Variable

------------------------

rollNo
      ↓

Constructor Parameter
```

---

# Viva Question

### Why use this keyword?

```text
To differentiate
instance variables
from local variables.
```

---

# Understanding display()

```java
void display()
```

Displays student details.

---

Output Example

```text
Roll No: 101

Name: Rebecca

Marks: 92
```

---

# Understanding calculateGrade()

Grade logic:

```text
90+      Grade A

75-89    Grade B

50-74    Grade C

Below 50 Fail
```

---

# Flow

Marks:

```text
92
```

Check:

```text
92 >= 90
```

True

Output:

```text
Grade A
```

---

# Grade Table

| Marks | Grade |
|---------|---------|
| 90+ | A |
| 75-89 | B |
| 50-74 | C |
| Below 50 | Fail |

---

# Dry Run

Input:

```text
Roll No = 1

Name = Raj

Marks = 85
```

---

Object Created

```java
Student s =
new Student(
    1,
    "Raj",
    85
);
```

---

Display

```text
Roll No: 1

Name: Raj

Marks: 85
```

---

Grade

```text
85 >= 75
```

Output:

```text
Grade B
```

---

# Scanner Explanation

## Input Integer

```java
int r = sc.nextInt();
```

---

## Input String

```java
String n =
sc.nextLine();
```

---

## Why sc.nextLine() After nextInt()?

```java
sc.nextLine();
```

consumes:

```text
Newline Character
```

left in buffer.

---

# Viva Question

### What happens if we remove sc.nextLine()?

```text
Name input gets skipped.
```

Very common viva question.

---

# Local Variable vs Instance Variable

| Local Variable | Instance Variable |
|---------------|------------------|
| Inside Method | Inside Class |
| Temporary | Exists With Object |
| Created During Method Call | Created With Object |

---

# Example

```java
class Student {

    int marks;

    void show() {

        int x = 10;
    }
}
```

Instance Variable:

```java
marks
```

Local Variable:

```java
x
```

---

# Common Examiner Modifications

## Modification 1 — Pass/Fail

```java
if(marks >= 40)

    System.out.println("Pass");

else

    System.out.println("Fail");
```

---

## Modification 2 — Percentage

Suppose total marks:

```text
500
```

Formula:

```java
double percentage =
(marks / 500.0) * 100;
```

---

## Modification 3 — Multiple Students

Create array:

```java
Student s[] =
new Student[5];
```

Store:

```text
5 Students
```

---

## Modification 4 — Distinction

```java
if(marks >= 75)

    System.out.println(
        "Distinction"
    );
```

---

# Output Prediction Question

```java
Student s1 =
new Student(
    1,
    "Raj",
    85
);

s1.display();
```

Output:

```text
Roll No: 1

Name: Raj

Marks: 85
```

---

# Frequently Asked Viva Questions

### What is a Class?

```text
Blueprint used to
create objects.
```

---

### What is an Object?

```text
Instance of a class.
```

---

### What is a Constructor?

```text
Special method used
to initialize objects.
```

---

### Does Constructor Have Return Type?

```text
No
```

Not even:

```java
void
```

---

### Why use this keyword?

```text
Refers to current object.
```

---

### What is a Method?

```text
A block of code that
performs a task.
```

---

### Why use methods?

```text
Code becomes reusable
and modular.
```

---

# Memory Trick

```text
Class
  ↓
Object
  ↓
Constructor
  ↓
Method
```

---

# Must Memorize

| Statement | Purpose |
|------------|----------|
| class Student | Create Class |
| new Student() | Create Object |
| this.marks = marks | Initialize Data |
| display() | Show Details |
| calculateGrade() | Grade Logic |
| sc.nextLine() | Consume Newline |

---

# Key Takeaways

✅ Class is a blueprint

✅ Object is an instance

✅ Constructor initializes data

✅ this refers to current object

✅ Methods perform tasks

✅ Scanner takes user input

✅ Grade calculation uses if-else ladder

---

# Golden Rule

```text
Class
  ↓
Object
  ↓
Constructor
  ↓
Methods
  ↓
OOP Program
```

This program is one of the most important beginner Java OOP programs and is frequently asked in practical exams and viva examinations.
