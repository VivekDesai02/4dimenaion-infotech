/*Create a class Shape with a method getArea(). Create a class Rectangle that extends Shape and has its own method getPerimeter().
Create an instance of Rectangle and call both methods. */

package Inheritance;

class Shape{
    public double getArea(){
        return 0.0;

    }

    public double getPerimeter(){
        return 0.0;
    }
}

class Calculation extends Shape{
   double length;
   double width;

   public Calculation(double l , double w){
        this.length = l;
        this.width = w;
   }

   public double getArea(){
        return length * width;
   }

   public double getPerimeter(){
        return 2*(length+width);
   }

    
}

public class Rectangle{
    public static void main(String[] args) {
        Calculation c1 = new Calculation(5, 7);

        double area = c1.getArea();
        double parimeter = c1.getPerimeter();

        System.out.println("Area of Rectangle: "+ area);
        System.out.println("Perimeter of Rectangle: "+ parimeter);

    }
}
