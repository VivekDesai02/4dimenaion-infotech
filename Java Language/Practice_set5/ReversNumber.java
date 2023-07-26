import java.util.Scanner;
public class ReversNumber{

    static int reversNumber(int num , int power){
        if(num > 0){
            int lastdigit = num % 10;
            return lastdigit * power + reversNumber( num /10, power / 10);
        }
        else{
            return 0;
        }


        // return 0;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int num = 153;
        // int rev = reversNumber(num);

        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num , count = 0;

        while(temp > 0){
            temp /= 10;
            count++;
        }

        int power = 1;
        for(int i = 1; i < count; i++){
            power *= 10;
        }
        int rev = reversNumber(num, power);
        // System.out.println(rev);

        if(num == rev){
            System.out.println("It is Palidrom Number: " + num);

        }
        else{
            System.out.println("It is Not Palibrom Number: "+ num);
        }
        

        // System.out.println(power);

    }
}