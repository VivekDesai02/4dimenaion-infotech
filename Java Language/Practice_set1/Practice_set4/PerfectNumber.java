import java.util.Scanner;

public class PerfectNumber{

    static int PerfectNumber(int facter){
        int sum = 0;

        sum += facter;

        // if(sum == num){
        //     System.out.println("It iS Perfect Number");
        // }

        return sum;
    }

    static int facterOfNumber(int num){
        // int sum = 0;
        // int j = 0;
        int sum=0;
        for(int i = 1; i < num; i++){
            if(num % i == 0){
                sum = sum+PerfectNumber(i);
            }
        }
        // if(sum == num){
        //     System.out.println("It is Perfect Number:" + num);
        // }

        return sum;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the number: ");
        int num = sc.nextInt();
        // for(int i = 1; i <= 1000; i++){
        //      facterOfNumber(i);
        // }
        int sum=facterOfNumber(num);
        if(sum == num){
            System.out.println("It is Perfect Number:" + num);
        }

    }
}