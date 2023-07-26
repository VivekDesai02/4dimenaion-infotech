import java.util.Scanner;
public class NaturalRecursion{

    static int naturalNumber(int start , int end){
        if(start <= end){
            // System.out.println(start);

            // naturalNumber(start + 1, end);
            return start + naturalNumber(start + 1 , end);
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // int startNumber , endNumber;

        System.out.println("Enetr the Start of range number: ");
        int startNumber = sc.nextInt();

        System.out.println("Enetr the end of range number: ");
        int endNumber = sc.nextInt();

        System.out.println(naturalNumber(startNumber, endNumber));
        // naturalNumber(startNumber, endNumber);






    }
}