# Class 8 — File Handling, Packages & Scanner 📂

## Why This Class Matters

These topics are frequently asked in:

- Java Viva
- Practical Exams
- Interviews

They test your understanding of:

```text
User Input

File Operations

Code Organization
```

---

# PART 1 — SCANNER CLASS ⌨️

---

# What is Scanner?

Scanner is a predefined Java class used to:

```text
Take Input
From User
```

---

# Import Statement

```java
import java.util.Scanner;
```

Allows Java to use Scanner class.

---

# Creating Scanner Object

```java
Scanner sc =
new Scanner(System.in);
```

---

# Visualization

```text
Keyboard
    ↓
System.in
    ↓
Scanner
    ↓
Program
```

---

# Integer Input

```java
int n =
sc.nextInt();
```

---

## Example

```java
System.out.print(
    "Enter Number: "
);

int n =
sc.nextInt();
```

Input:

```text
25
```

Output Stored:

```text
25
```

---

# Double Input

```java
double d =
sc.nextDouble();
```

---

## Example

Input:

```text
12.75
```

Stored:

```text
12.75
```

---

# String Input (Single Word)

```java
String s =
sc.next();
```

---

Input:

```text
Hello World
```

Stored:

```text
Hello
```

---

# Why?

Because:

```java
next()
```

stops at:

```text
Space
```

---

# String Input (Full Line)

```java
String s =
sc.nextLine();
```

---

Input:

```text
Hello World
```

Stored:

```text
Hello World
```

---

# Most Asked Viva Question

## Difference Between next() and nextLine()

| next() | nextLine() |
|----------|-----------|
| Reads One Word | Reads Entire Line |
| Stops At Space | Includes Spaces |
| Faster | Reads Complete Input |

---

# Example

```java
String s =
sc.next();
```

Input:

```text
Java Programming
```

Stored:

```text
Java
```

---

```java
String s =
sc.nextLine();
```

Stored:

```text
Java Programming
```

---

# Common Scanner Trap

```java
int n =
sc.nextInt();

String s =
sc.nextLine();
```

String gets skipped.

---

# Solution

```java
int n =
sc.nextInt();

sc.nextLine();

String s =
sc.nextLine();
```

---

# Viva Questions

### What is Scanner?

```text
Class used to take
user input.
```

---

### Which package contains Scanner?

```java
java.util
```

---

### Difference between next() and nextLine()?

```text
next()
=
One Word

nextLine()
=
Entire Line
```

---

# PART 2 — FILE HANDLING 📁

---

# What is File Handling?

Definition:

```text
Process of storing
and retrieving data
from files.
```

---

# Why Use File Handling?

To:

```text
Save Data Permanently
```

Unlike variables.

---

# Writing to a File

---

## Program

```java
import java.io.FileWriter;

public class Main {

    public static void main(
        String args[]
    )
    throws Exception {

        FileWriter fw =
            new FileWriter(
                "test.txt"
            );

        fw.write(
            "Hello Java"
        );

        fw.close();
    }
}
```

---

# Output File

```text
test.txt

Hello Java
```

---

# Why close()?

```java
fw.close();
```

Used to:

```text
Save Data Properly

Release Resources
```

---

# Viva Question

### Why Use close()?

```text
To save file and
prevent resource leakage.
```

---

# Reading From File

---

## Program

```java
import java.io.FileReader;

public class Main {

    public static void main(
        String args[]
    )
    throws Exception {

        FileReader fr =
            new FileReader(
                "test.txt"
            );

        int ch;

        while(
            (ch = fr.read())
            != -1
        )
        {
            System.out.print(
                (char) ch
            );
        }

        fr.close();
    }
}
```

---

# Output

```text
Hello Java
```

---

# Understanding read()

```java
fr.read()
```

Reads:

```text
One Character
At A Time
```

---

# Meaning of -1

When:

```text
End Of File
```

is reached.

---

```java
fr.read()
```

returns:

```text
-1
```

---

# FileReader vs FileWriter

| FileReader | FileWriter |
|------------|------------|
| Reads File | Writes File |
| Input Operation | Output Operation |
| Retrieves Data | Stores Data |

---

# Viva Questions

### What is File Handling?

```text
Process of storing
and retrieving data
from files.
```

---

### Difference Between FileReader and FileWriter?

```text
FileReader → Reads

FileWriter → Writes
```

---

### What Does read() Return at EOF?

```text
-1
```

---

# PART 3 — PACKAGES 📦

---

# What is a Package?

Definition:

```text
Collection of Related
Classes and Interfaces
```

---

# Example

```java
java.util
```

Contains:

```text
Scanner

ArrayList

Date

Collections
```

---

# Import Statement

```java
import java.util.Scanner;
```

---

# Why Import?

Allows access to:

```text
Classes From Another Package
```

---

# Create Custom Package

```java
package mypack;

public class Demo
{
}
```

---

# Visualization

```text
mypack
  │
  └── Demo.java
```

---

# Advantages of Packages

---

## 1. Organization

Keeps code structured.

---

## 2. Avoid Naming Conflicts

Two classes can have same name.

Different packages.

---

## 3. Security

Controls access.

---

# Example

Package:

```java
package college;
```

Class:

```java
public class Student
{
}
```

---

Use In Another File

```java
import college.Student;
```

---

# Viva Questions

### What is a Package?

```text
Collection of related
classes and interfaces.
```

---

### Why Use Packages?

```text
Organization

Security

Avoid Naming Conflicts
```

---

### What Does import Do?

```text
Allows access to
classes from another package.
```

---

### What is java.util?

```text
Predefined package
containing utility classes.
```

---

# Output Prediction 1

```java
Scanner sc =
new Scanner(System.in);

String s =
sc.next();
```

Input:

```text
Hello Java
```

Stored:

```text
Hello
```

---

# Output Prediction 2

```java
String s =
sc.nextLine();
```

Input:

```text
Hello Java
```

Stored:

```text
Hello Java
```

---

# Frequently Asked Coding Tasks

---

# Reverse Number

```java
int rev = 0;

while(n > 0)
{
    rev =
        rev * 10
        +
        n % 10;

    n = n / 10;
}
```

---

# Palindrome Number

```java
if(original == reverse)

    System.out.println(
        "Palindrome"
    );
```

---

# Fibonacci Series

```java
int a = 0;

int b = 1;

for(
    int i = 1;
    i <= n;
    i++
)
{
    System.out.print(
        a + " "
    );

    int c = a + b;

    a = b;

    b = c;
}
```

---

# Largest of Three Numbers

```java
if(a > b && a > c)
{
    System.out.println(a);
}
```

---

# Sum of Array Elements

```java
int sum = 0;

for(int x : arr)
{
    sum += x;
}
```

---

# Lightning Viva Round ⚡

### What is Scanner?

```text
Class used for user input.
```

---

### Difference Between next() and nextLine()?

```text
next()
=
One Word

nextLine()
=
Entire Line
```

---

### What is File Handling?

```text
Reading and writing files.
```

---

### Difference Between FileReader and FileWriter?

```text
Read vs Write
```

---

### Why Use close()?

```text
Release resources
and save file properly.
```

---

### What is a Package?

```text
Collection of related classes.
```

---

### Why Use Packages?

```text
Organization
and avoiding conflicts.
```

---

### What Does import Do?

```text
Access classes
from another package.
```

---

### What Does read() Return at EOF?

```text
-1
```

---

### What is java.util?

```text
Utility package
containing Scanner,
ArrayList, etc.
```

---

# Examiner Trap Question 🚨

### Can a Java Program Run Without Scanner?

✅ Yes

---

# Why?

Scanner is needed only for:

```text
User Input
```

Programs can run without input.

---

# Example

```java
public class Main {

    public static void main(
        String args[]
    ) {

        System.out.println(
            "Hello Java"
        );
    }
}
```

Runs perfectly.

---

# Quick Revision

## Scanner

```text
next()

nextLine()

nextInt()

nextDouble()
```

---

## File Handling

```text
FileReader

FileWriter

read()

write()

close()
```

---

## Packages

```text
package

import

java.util
```

---

# Must Memorize

| Concept | Purpose |
|----------|----------|
| Scanner | User Input |
| next() | One Word |
| nextLine() | Full Line |
| FileReader | Read File |
| FileWriter | Write File |
| read() | Read Character |
| close() | Release Resources |
| Package | Group of Classes |
| import | Access Package Classes |

---

# Golden Rule

```text
User Input?
     ↓
Scanner

Store Data?
     ↓
File Handling

Organize Classes?
     ↓
Packages
```

These topics are easy marks in viva exams because most questions are direct theory-based and require simple practical understanding.
