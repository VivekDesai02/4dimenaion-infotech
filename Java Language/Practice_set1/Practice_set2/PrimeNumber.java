import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num, isPrime = 1;
        System.out.println("Enetr the Number:");
        num = sc.nextInt();

        for(int i = 2; i < num/2;i++){
            if(num % i == 0){
                isPrime = 0;
            }
        }
        if(isPrime == 1){
            System.out.println("It is Prime Number:"+ num);
        }
        else{
            System.out.println("It is not Prime Number:"+ num);

        }
    }
    
}
