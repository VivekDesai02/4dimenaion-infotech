import java.util.Scanner;


public class NumberOfCube {

    static int numberOfCube(int num){
        return num*num*num;
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        System.out.println("Cube Of this Number: "+ numberOfCube(num));


    }
}
