import java.util.Scanner;

public class EvenOddRecursion{

    static int evenNumber(int start , int end){
        if(start <= end){
            if(start % 2 == 0){
                // System.out.println(start);
                return start + evenNumber(start + 2, end);
                // evenNumber(start + 2, end);
            }
            else{
                // evenNumber(start + 1, end);
                return evenNumber(start + 1, end);
            }
        }
        else{
            return 0;
        }
    }

    static int oddNumber(int start , int end){
        if(start <= end){
            if(start % 2 != 0){
               System.out.println(start);
                return start + oddNumber(start + 1, end);
            //    oddNumber(start+2, end);
            }
            else{
                return oddNumber(start + 1, end);
                // oddNumber(start +1, end);
                
            }
        }
        else{
            return 0;
        }
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        

        System.out.println("Enetr the Start of range number: ");
        int startNumber = sc.nextInt();

        System.out.println("Enetr the end of range number: ");
        int endNumber = sc.nextInt();
       
        System.out.println("Event Number:" + evenNumber(startNumber, endNumber));
        // evenNumber(startNumber, endNumber);

        System.out.println("Odd Number:" + oddNumber(startNumber, endNumber));
        // oddNumber(startNumber, endNumber);
    }
}
