package JavaModifers;

public class Circle {
    private double radius;

    public Circle(double redius){
        this.radius = redius;
    }

    public double getArea() {

        return 3.14*(radius*radius);
        
    }

    public double getPerimeter(){

        return 2*(3.14*radius);
    }
}
