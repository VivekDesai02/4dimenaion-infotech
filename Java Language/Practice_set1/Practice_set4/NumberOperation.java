import java.util.Scanner;

public class NumberOperation {
    
    static int primeNumber(int n) {
        int isPrime = 1;
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0) {
                isPrime = 0;
                break;
            }
        }
        // System.out.println(isPrime);
        return isPrime;
    }

    static int perfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum;
    }

    static int armstrongNumber(int num) {
        int sum = 0;
        int temp = num;
        int digit = 0;

        while (temp > 0) {
            temp /= 10;
            digit++;
        }

        int x = 0;
        int mult = 0;
        for (int i = 0; i < digit; i++) {
            x = num % 10;
            for (int j = 0; j < digit - 1; j++) {
                if (mult > 0) {
                    mult *= x;
                } else {
                    mult += x * x;
                }
            }
            sum += mult;
            num /= 10;
            mult = 0;

        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the Number");
        int num = sc.nextInt();

        // int prime = primeNumber(num);

        // int perfect = perfectNumber(num);

        // int arm = armstrongNumber(num);

        if (1 == primeNumber(num)) {
            System.out.println("This is Prime Number: " + num);
        }

        if (num == perfectNumber(num)) {
            System.out.println("This is Perfect Number: " + num);
        }

        if (num == armstrongNumber(num)) {
            System.out.println("This is Armstrong Number: " + num);
        }
    }
}