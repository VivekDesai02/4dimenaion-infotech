/*Create a class Animal with a method makeSound(). Create a class Dog that extends Animal and overrides makeSound()
 to print "Woof!". Create an instance of Dog and call makeSound(). */

package Inheritance;

class Animal{
    public void makeSound(){
        System.out.println("Animal Sound!");
    }
}

class Dog extends Animal{
    public void makeSound(){
        System.out.println("Woof!");
    }
}

public class AnimalSound {
    public static void main(String[] args) {
        Dog d1 = new Dog();

        d1.makeSound();
    }
}
