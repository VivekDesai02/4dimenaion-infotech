/*Create a class Animal with a method eat(). Create a class Bird that extends Animal and has its own method fly().
 Create a class Penguin that extends Bird and overrides fly() to print "Sorry, I can't fly."
  Create an instance of Penguin and call both eat() and fly().
 */

package Inheritance;


class Animal{
    public void eatt(){
        System.out.println("Animal eat to grass and meat");
    }
}

class Bird extends Animal{
    public void fly(){
        System.out.println("Bird is fly!");
    }
}

class Penguin extends Bird{
    public void fly(){
        System.out.println("Sorry, I can't fly.");
    }
}
public class Forest {

    public static void main(String[] args) {
        Penguin p = new Penguin();

        p.fly();
        p.eatt();
    }
    
}
