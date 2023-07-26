import java.util.Scanner;
public class FibonacisNumber {

    static void fibonacciNumbers(int n , int i ,int k , int j){
        if(n > i){
            System.out.print(k + " ");
            int x = k + j;
            fibonacciNumbers(n, i + 1, j, x);
        }
    }
    
    public static void main(String[] args){
        // int num = 10;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the term: ");
        int num = sc.nextInt();

        int i = 0;
        int j = 1;
        int k = 0;

        System.out.println("Fibonacci Numbers: ");
        fibonacciNumbers(num, i, k, j);
      

    }
}
