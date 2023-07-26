
package JavaModifers;

public class Register{

    public static void main(String[] args) {
        Login u1 = new Login();
        myLogin u2 = new myLogin();

        Circle c1 = new Circle(7);

        BankAccount b1 = new BankAccount(0);
        // b1.deposit(2500);
        // b1.withDrow(2000);

        Calculater c2 = new Calculater();
        
        // System.out.println(c2.AreaofCircle(7.0));

        Porson p1 = new Porson("vivek", 22);

        p1.displayinfo();

        Counter co1 = new Counter();

        co1.incrementCount();
        co1.incrementCount();
        co1.incrementCount();
        // System.out.println(co1.incrementCount());

        // System.out.println(c1.getArea());
        // System.out.println(c1.getPerimeter());

        // System.out.println(u1.age);
        // System.out.println("my login: "+ u2.myage);


    }
}