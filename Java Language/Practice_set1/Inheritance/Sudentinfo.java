/*Create a class Person with a method eat(). Create a class Student that extends Person and has its own method study().
Create a class UndergradStudent that extends Student and overrides eat() to print "I'm eating ramen." 
Create an instance of UndergradStudent and call both eat() and study(). */

package Inheritance;


class Person{
    public void eat(){
        System.out.println("eat Person...");
    }
}

class Student extends Person{
    public void Study(){
        System.out.println("Student....");
    }

}

class UndergradStudent extends Student{
    public void eat(){
        System.out.println("I'm eating remen");
    } 
}
public class Sudentinfo {

    public static void main(String[] args) {
        UndergradStudent us = new UndergradStudent();

        us.eat();
        us.Study();

        

    }
    
}
