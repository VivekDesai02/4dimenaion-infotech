package JavaModifers;

public class Porson {
    
    private String name;
    private int age;

    public Porson(String Name, int age){
        this.name = Name;
        this.age = age;
    }

    protected void displayinfo(){
        System.out.println("Name: "+ name);
        System.out.println("Age: "+ age);
    }
}
