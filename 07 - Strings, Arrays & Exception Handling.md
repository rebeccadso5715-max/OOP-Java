# Class 7 — Strings, Arrays & Exception Handling ⚡

## Why This Class Matters

These topics are extremely common in:

- Java Viva
- Practical Exams
- Technical Interviews

Because they test:

```text
Java Fundamentals
Beyond OOP
```

---

# PART 1 — STRINGS 📝

---

# What is a String?

A String is:

```text
A Sequence of Characters
```

Example:

```java
String name = "Rebecca";
```

---

# String Representation

```text
R e b e c c a
0 1 2 3 4 5 6
```

Indexes start from:

```text
0
```

---

# Common String Methods

---

# 1. length()

Returns number of characters.

```java
String s = "Hello";

System.out.println(
    s.length()
);
```

Output:

```text
5
```

---

# 2. toUpperCase()

Converts string to uppercase.

```java
String s = "hello";

System.out.println(
    s.toUpperCase()
);
```

Output:

```text
HELLO
```

---

# 3. toLowerCase()

Converts string to lowercase.

```java
String s = "HELLO";

System.out.println(
    s.toLowerCase()
);
```

Output:

```text
hello
```

---

# 4. charAt()

Returns character at index.

```java
String s = "Java";

System.out.println(
    s.charAt(2)
);
```

Output:

```text
v
```

---

# Visualization

```text
J a v a
0 1 2 3
```

Index:

```text
2
```

Character:

```text
v
```

---

# 5. equals()

Compares content.

```java
String a = "Java";

String b = "Java";

System.out.println(
    a.equals(b)
);
```

Output:

```text
true
```

---

# 6. compareTo()

Used for lexicographical comparison.

```java
System.out.println(
    "A".compareTo("B")
);
```

Output:

```text
Negative Value
```

---

# compareTo() Rules

```text
0
```

Strings equal.

---

```text
Negative
```

First string smaller.

---

```text
Positive
```

First string greater.

---

# Most Important Viva Question

## Difference Between == and equals()

---

### ==

Compares:

```text
References
```

---

### equals()

Compares:

```text
Content
```

---

# Example

```java
String a =
new String("Java");

String b =
new String("Java");
```

---

```java
a == b
```

Output:

```text
false
```

Different objects.

---

```java
a.equals(b)
```

Output:

```text
true
```

Same content.

---

# Viva Questions

### What is a String?

```text
Sequence of characters.
```

---

### Index Starts From?

```text
0
```

---

### Difference Between == and equals()?

```text
== compares references

equals() compares content
```

---

# PART 2 — ARRAYS 📦

---

# What is an Array?

Definition:

```text
Collection of elements
of same data type
stored in contiguous memory.
```

---

# Example

```java
int arr[] =
{
    10,
    20,
    30,
    40
};
```

---

# Memory Visualization

```text
Index

0   1   2   3

Value

10 20 30 40
```

---

# Accessing Elements

```java
System.out.println(
    arr[0]
);
```

Output:

```text
10
```

---

# Traversing Array

```java
for(
    int i = 0;
    i < arr.length;
    i++
)
{
    System.out.println(
        arr[i]
    );
}
```

---

# Output

```text
10
20
30
40
```

---

# Enhanced For Loop

Also called:

```text
For-Each Loop
```

---

```java
for(int x : arr)
{
    System.out.println(x);
}
```

---

# Output

```text
10
20
30
40
```

---

# Array of Objects

Very Important Viva Topic.

---

```java
Student s[] =
new Student[3];
```

---

Create Objects

```java
s[0] = new Student();

s[1] = new Student();

s[2] = new Student();
```

---

# Visualization

```text
s[0]

s[1]

s[2]
```

Each element stores:

```text
Object Reference
```

---

# Array Properties

## Size

```java
arr.length
```

Returns:

```text
Array Size
```

---

# Example

```java
int arr[] =
{
    10,
    20,
    30
};

System.out.println(
    arr.length
);
```

Output:

```text
3
```

---

# Viva Questions

### What is an Array?

```text
Collection of same type
elements stored in
contiguous memory.
```

---

### Array Index Starts From?

```text
0
```

---

### What is arr.length?

```text
Returns size of array.
```

---

# PART 3 — EXCEPTION HANDLING 🚨

---

# What is an Exception?

Definition:

```text
Runtime Error
```

that interrupts normal program execution.

---

# Common Exceptions

---

## ArithmeticException

```java
10 / 0
```

---

## ArrayIndexOutOfBoundsException

```java
arr[10]
```

when size is smaller.

---

## NullPointerException

```java
str.length()
```

when:

```java
str = null
```

---

# try-catch

Used to handle exceptions.

---

# Example

```java
try
{
    int x = 10 / 0;
}
catch(Exception e)
{
    System.out.println(
        "Error"
    );
}
```

---

# Output

```text
Error
```

Program continues.

---

# Why Use try-catch?

Without it:

```text
Program Crashes
```

---

With it:

```text
Exception Handled
```

---

# Multiple Catch Blocks

Different exceptions handled separately.

---

```java
try
{
}
catch(
ArithmeticException e
)
{
}
catch(
ArrayIndexOutOfBoundsException e
)
{
}
```

---

# finally Block

Always executes.

---

```java
try
{
    System.out.println("Try");
}
finally
{
    System.out.println("Finally");
}
```

---

# Output

```text
Try

Finally
```

---

# Why finally?

Used for:

```text
Cleanup Tasks

Closing Files

Closing Database Connections
```

---

# throw Keyword

Used to manually create exception.

---

```java
throw new
ArithmeticException(
    "Invalid"
);
```

---

# Example

```java
int age = -5;

if(age < 0)
{
    throw new
    ArithmeticException(
        "Invalid Age"
    );
}
```

---

# throws Keyword

Used in method declaration.

---

```java
void show()
throws IOException
{
}
```

---

Meaning:

```text
This method may
generate exception.
```

---

# throw vs throws

| throw | throws |
|---------|---------|
| Creates Exception | Declares Exception |
| Inside Method | Method Signature |
| Single Exception | Multiple Exceptions Possible |

---

# Output Prediction 1

```java
try
{
    int x = 10/0;
}
catch(Exception e)
{
    System.out.println(
        "Exception"
    );
}
```

Output:

```text
Exception
```

---

# Output Prediction 2

```java
try
{
    System.out.println("A");
}
finally
{
    System.out.println("B");
}
```

Output:

```text
A

B
```

---

# Frequently Asked Viva Questions

### What is an Exception?

```text
Runtime error.
```

---

### Why Use Exception Handling?

```text
Prevents program crash.
```

---

### What is try Block?

```text
Contains risky code.
```

---

### What is catch Block?

```text
Handles exception.
```

---

### What is finally Block?

```text
Always executes.
```

---

### What is throw?

```text
Used to create exception.
```

---

### What is throws?

```text
Used to declare exception.
```

---

### Difference Between throw and throws?

```text
throw → creates exception

throws → declares exception
```

---

# Quick Revision

## Strings

```text
length()

charAt()

equals()

compareTo()
```

---

## Arrays

```text
arr[i]

arr.length

for loop

for-each loop
```

---

## Exceptions

```text
try

catch

finally

throw

throws
```

---

# Must Memorize

| Concept | Purpose |
|----------|----------|
| length() | String Length |
| charAt() | Character Access |
| equals() | Content Comparison |
| == | Reference Comparison |
| arr.length | Array Size |
| try | Risky Code |
| catch | Handle Exception |
| finally | Always Executes |
| throw | Create Exception |
| throws | Declare Exception |

---

# 30-Second Viva Revision

```text
String
=
Sequence of Characters

Array
=
Collection of Same Type Elements

Exception
=
Runtime Error

try-catch
=
Handles Exception

finally
=
Always Executes

throw
=
Creates Exception

throws
=
Declares Exception
```

---

# Key Takeaways

✅ Strings store characters

✅ equals() compares content

✅ Arrays store same data type elements

✅ Arrays use zero-based indexing

✅ arr.length gives size

✅ Exceptions are runtime errors

✅ try-catch prevents crashes

✅ finally always executes

✅ throw creates exceptions

✅ throws declares exceptions

---

# Golden Rule

```text
Text?
 ↓
String

Multiple Values?
 ↓
Array

Runtime Error?
 ↓
Exception Handling
```

Master these three topics and you'll confidently answer a large portion of Java viva and practical exam questions.
