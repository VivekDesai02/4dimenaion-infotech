public class SchoolGrad {
    
    public static void main(String[] args){

        int marks = 80;

        if(marks >= 80){
            System.out.println("Grad is 'A'");
        }
        else if(marks >= 60 && marks < 80){
            System.out.println("Grad is 'B'");
        }
        else if(marks >= 50 && marks < 60){
            System.out.println("Grad is 'C'");
        }
        else if(marks >= 45 && marks < 50){
            System.out.println("Grad is 'D'");
        }
        else if(marks >= 25 && marks < 45){
            System.out.println("Grad is 'E'");
        }
        else{
            System.out.println("Drad is 'F'");
        }
    }
    
}
