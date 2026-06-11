# Program 1 — NumberOperations

**Difficulty:** Easy

**Concepts Covered:**
- Even/Odd Number
- Prime Number
- Factorial
- Sum of Digits
- Classes & Objects
- Constructors
- Methods
- Scanner Class

---

# Problem Statement

Create a class:

```java
NumberOperations
```

that contains methods:

```java
isEven()

isPrime()

factorial()

sumOfDigits()
```

Create a Main class that:

- Accepts a number from user
- Creates object
- Calls all methods

---

# Complete Program

```java
import java.util.Scanner;

class NumberOperations {

    int num;

    NumberOperations(int num) {
        this.num = num;
    }

    void isEven() {

        if(num % 2 == 0)
            System.out.println("Even Number");
        else
            System.out.println("Odd Number");
    }

    void isPrime() {

        boolean prime = true;

        if(num <= 1)
            prime = false;

        else {

            for(int i = 2; i <= num / 2; i++) {

                if(num % i == 0) {

                    prime = false;

                    break;
                }
            }
        }

        if(prime)
            System.out.println("Prime Number");
        else
            System.out.println("Not Prime Number");
    }

    void factorial() {

        long fact = 1;

        for(int i = 1; i <= num; i++) {

            fact = fact * i;
        }

        System.out.println(
            "Factorial = " + fact
        );
    }

    void sumOfDigits() {

        int temp = num;

        int sum = 0;

        while(temp > 0) {

            sum = sum + temp % 10;

            temp = temp / 10;
        }

        System.out.println(
            "Sum of Digits = " + sum
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
            "Enter Number: "
        );

        int n = sc.nextInt();

        NumberOperations obj =
            new NumberOperations(n);

        obj.isEven();

        obj.isPrime();

        obj.factorial();

        obj.sumOfDigits();
    }
}
```

---

# Sample Output

```text
Enter Number: 5

Odd Number

Prime Number

Factorial = 120

Sum of Digits = 5
```

---

# Concept 1 — Even Number

## Definition

A number is even if:

```java
num % 2 == 0
```

---

## Examples

```text
8 % 2 = 0

Even
```

```text
7 % 2 = 1

Odd
```

---

## Code

```java
if(num % 2 == 0)
```

---

# Viva Questions

### Q: What does % operator do?

Returns:

```text
Remainder
```

---

### Q: Why use num % 2 == 0?

Because:

```text
Even numbers leave
remainder 0
when divided by 2.
```

---

# Concept 2 — Prime Number

## Definition

Prime number:

```text
Exactly Two Factors

1 and itself
```

---

## Prime Numbers

```text
2

3

5

7

11

13
```

---

## Not Prime

```text
4

6

8

9

10
```

---

# Logic

Check divisibility from:

```text
2
```

to:

```text
num / 2
```

If divisor exists:

```text
Not Prime
```

Else:

```text
Prime
```

---

# Dry Run

Input:

```text
5
```

Check:

```text
5 % 2 ≠ 0
```

No divisor.

Output:

```text
Prime
```

---

# Viva Questions

### Q: Why use break?

```text
Stops loop immediately
when divisor is found.
```

---

### Q: Why is 1 not prime?

Prime numbers must have:

```text
Exactly 2 factors.
```

1 has only:

```text
1 factor
```

---

### Q: Is 2 prime?

```text
Yes

Smallest prime number.
```

---

# Concept 3 — Factorial

## Formula

```text
n!

=

n × (n-1) × (n-2) × ... × 1
```

---

## Example

```text
5!

=

5×4×3×2×1

=

120
```

---

# Dry Run

Input:

```text
4
```

---

Initial:

```text
fact = 1
```

---

Loop

```text
1 × 1 = 1

1 × 2 = 2

2 × 3 = 6

6 × 4 = 24
```

Output:

```text
24
```

---

# Viva Questions

### Q: Why initialize fact = 1?

Because:

```text
1 is multiplicative identity.
```

---

### Q: What is 0 factorial?

```text
0! = 1
```

Most asked viva question.

---

# Concept 4 — Sum of Digits

## Example

Input:

```text
1234
```

Output:

```text
1+2+3+4 = 10
```

---

# Logic

Get last digit:

```java
temp % 10
```

Remove last digit:

```java
temp / 10
```

Repeat.

---

# Dry Run

```text
1234 % 10 = 4

sum = 4
```

---

```text
1234 / 10 = 123
```

---

```text
123 % 10 = 3

sum = 7
```

---

```text
12 % 10 = 2

sum = 9
```

---

```text
1 % 10 = 1

sum = 10
```

Final:

```text
10
```

---

# Viva Questions

### Q: Why use temp variable?

```text
To preserve original number.
```

---

### Q: What does num % 10 return?

```text
Last digit
```

---

### Q: What does num / 10 do?

```text
Removes last digit
```

---

# OOP Concepts Used

## Class

```java
class NumberOperations
```

Blueprint.

---

## Object

```java
NumberOperations obj =
new NumberOperations(n);
```

Instance of class.

---

## Constructor

```java
NumberOperations(int num)
```

Used to initialize object.

---

## this Keyword

```java
this.num = num;
```

Current object's variable receives parameter value.

---

## Methods

```java
isEven()

isPrime()

factorial()

sumOfDigits()
```

Each performs a specific task.

---

# Theory Questions Examiner Can Ask

### What is a Method?

```text
A block of code
that performs a specific task.
```

---

### Why create separate methods?

```text
Code becomes modular,
organized and reusable.
```

---

### What is an Object?

```text
Instance of a class.
```

---

### Why use Constructor?

```text
To initialize object data.
```

---

### What is this.num = num?

```text
Instance variable receives
parameter value.
```

---

# Common Modifications

## 1. Reverse Number

Input:

```text
1234
```

Output:

```text
4321
```

Code:

```java
while(num > 0)
{
    rev = rev * 10 + num % 10;

    num = num / 10;
}
```

---

## 2. Palindrome Number

Input:

```text
121
```

Output:

```text
Palindrome
```

Logic:

```text
Reverse Number

Compare
```

---

## 3. Armstrong Number

Input:

```text
153
```

Calculation:

```text
1³ + 5³ + 3³

=

153
```

Output:

```text
Armstrong Number
```

---

# Must Memorize

| Expression | Purpose |
|------------|----------|
| num % 2 | Even/Odd |
| num % i | Prime Check |
| fact *= i | Factorial |
| sum += temp % 10 | Digit Sum |
| temp /= 10 | Remove Digit |
| rev = rev*10 + digit | Reverse Number |

---

# Viva Rapid Fire

### Smallest Prime Number?

```text
2
```

### 0! ?

```text
1
```

### % Operator?

```text
Returns remainder.
```

### num % 10 ?

```text
Last digit.
```

### num / 10 ?

```text
Removes last digit.
```

### Why use break?

```text
Stops loop when divisor is found.
```

### Why use constructor?

```text
Initialize object data.
```

---

# Golden Rule

```text
num % 2
    ↓
Even/Odd

num % i
    ↓
Prime

fact *= i
    ↓
Factorial

temp % 10
    ↓
Digit Extraction
```

This single program covers **loops, conditionals, methods, constructors, objects, operators, and basic number logic**, making it one of the most important OOP Java practical programs for viva exams.
