import java.util.Scanner;

public class FactorialRecursion {

    static void factorOfNumber(int num, int i){
        if(num/2 >= i){
            if(num % i == 0){
                System.out.println(i);
                factorOfNumber(num, i + 1);
            }
            else{
                factorOfNumber(num, i + 1);
            }
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the number: ");
        int num = sc.nextInt();

        int i = 1;

        System.out.println("Factore of a number: " + num);
        factorOfNumber(num, i);



    }
}
