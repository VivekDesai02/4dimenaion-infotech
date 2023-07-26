import java.util.Scanner;
public class HCFRecursion {

    static int hcfNumber(int num1 , int num2){
        if(num2 != 0){
            return hcfNumber(num2 , num1 % num2);
        }
        else{
            return num1;
        }
    }
    static int lcmnumber(int num1 , int num2, int hcf){
        int ans = (num1 * num2)/hcf;

        return ans;


    }

    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enetr the First Number: ");
        int num1 = sc.nextInt();

        System.out.println("Enter the Second Number is: ");
        int num2 = sc.nextInt();

        int result = lcmnumber(num1, num2, hcfNumber(num1, num2));

        // System.out.println("HCF Number of given two number is: " +hcfNumber(num1, num2));
        System.out.println(null);
    }
}
