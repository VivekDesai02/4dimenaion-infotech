/*Create a class Vehicle with a method start(). Create a class Car that extends Vehicle and has its own method drive().
 Create a class ElectricCar that extends Car and overrides start() to print "Starting electric car...". 
 Create an instance of ElectricCar and call both start() and drive(). */

package Inheritance;

import javax.swing.event.SwingPropertyChangeSupport;

class Vehical{
    public void start(){
        System.out.println("Starting Vehicals....");
    }
}

class Car extends Vehical{
    public void drive(){
        System.out.println("Driving Car....");
    }
}

class ElectricCar extends Car{
    public void start(){
        System.out.println("Starting electric car.......");
    }
}

public class VehicalCar {

    public static void main(String[] args) {
        ElectricCar ec = new ElectricCar();
        ec.start();

        ec.drive();
    }
    
}
