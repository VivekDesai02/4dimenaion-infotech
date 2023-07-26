/*Create a class Person with a method sayHello(). Create a class Student that extends Person and overrides sayHello() 
to print "Hi, I'm a student!". Create an instance of Student and call sayHello().*/

package Inheritance;

class Person{
    public void sayHello(){
        System.out.println("Hello!");
    }

}

class Student extends Person{
    public void sayHello(){
        System.out.println("Hi, I'm a Student!");
    }
}

public class PersonInfo {

    public static void main(String[] args) {
        Student s1 = new Student();

        s1.sayHello();
    }

    
}
