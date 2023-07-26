import java.util.Scanner;

public class PrimeFacter{

    static void primeFacter(int facter){
        int isPrime = 1;

        for(int i = 2; i < facter/2; i++){
            if(facter % i == 0){
                isPrime = 0;
            }
        }
        if(isPrime == 1){
            System.out.println("It is Prime Facter:" + facter);
        }

    }

    static int numberFacter(int num ){

        for(int i = 2; i < num; i++){
            if(num % i == 0){
                primeFacter(i);
            }
        }

        return 0;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the Number: ");

        int num = sc.nextInt();

        numberFacter(num);



    }
}