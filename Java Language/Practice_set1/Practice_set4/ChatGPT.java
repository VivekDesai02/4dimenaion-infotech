import java.util.Scanner;

public class ChatGPT {
    static int primeNumber(int n) {
        int isPrime = 1;
        for (int i = 2; i <= n / 2; i++) {
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
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        // System.out.println(sum);
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
        // System.out.println(sum);

        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();
        int prime = primeNumber(num);
        int perfect = perfectNumber(num);
        int arm = armstrongNumber(num);
        if (1 == prime) {
            System.out.println("This is a Prime Number: " + num);
        }
        if (num == perfect) {
            System.out.println("This is a Perfect Number: " + num);
        }
        if (num == arm) {
            System.out.println("This is an Armstrong Number: " + num);
        }
    }
}
