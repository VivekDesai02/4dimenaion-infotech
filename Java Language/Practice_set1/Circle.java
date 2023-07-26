import JavaModifers.*;
import JavaModifers.Login;

public class Circle{
    public static void main(String[] args){
        Login u1 = new Login();
        // myLogin v1 = new myLogin();
        Circle c1 = new Circle();

        Porson p1 = new Porson("Vivek", 22);
        // p1.displayinfo();

        // c1.getClass();
        // System.out.println(c1.getClass());

        // System.out.println(u1.age);


        int redius = 8;

        double areaOfCircle = 3.14*(redius*redius);
        double perimeterOfCircle = 2*(3.14*redius);

        System.out.println("Area of Circle: "+ areaOfCircle);
        System.out.println("Perimeter of Circle: "+ perimeterOfCircle);
    }
}