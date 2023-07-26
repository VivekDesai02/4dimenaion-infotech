import java.util.Scanner;

public class FunctionRectangle{

    static void rectangle(double l, double b){

        System.out.println("Area of Rectangle: "+ l*b);

        System.out.print("Perimeter of Rectangle: "+ 2*(l+b));
        
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length of Rectangle:");
        double length = sc.nextDouble();

        System.out.println("Enter the Width of Rectangle: ");
        double Width = sc.nextDouble();
        

        rectangle(length, Width);
    }
}