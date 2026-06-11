import java.util.Scanner;

class NumberOperations{
    int num;
    NumberOperations(int num) {
        this.num = num;
    }
    void isEven() {
        if (num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }
    }
    void isPrime() {
        if (num <= 1) {
            System.out.println(num + "  is not a prime number");
            return;
        }
        boolean prime = true;
        for(int i=2; i<num/2; i++) {
            if(num % i == 0) {
                prime = false;
                break;
            }
        }
        if(prime) {
            System.out.println(num + " is a Prime number");
        } else {
            System.out.println(num + " is not a Prime number");
        }
    }
    void fact() {
        long fact = 1;
        for(int i=1; i<=num; i++) {
            fact = fact * i;
        }
        System.out.println("factorial of " + num + " is " + fact);
    }
    void numOfDigits() {
        int temp = num;
        int sum = 0;
        while(temp > 0) {
            sum += temp % 10;
            temp = temp / 10;
        }
        System.out.println("Sum of digits of " + num + " is " + sum);
    }
}

public class NumOperations{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        NumberOperations obj = new NumberOperations(n);
        obj.isEven();
        obj.isPrime();
        obj.fact();
        obj.numOfDigits();
    }
}
