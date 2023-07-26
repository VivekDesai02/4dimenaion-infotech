public class Bonus {
    
    public static void main(String[] args){

        int salary = 80500, year = 6;
        double bonus;

        if(year > 5){
            bonus = salary*0.05;
            System.out.println("Amount of Bonus is: "+ bonus);
        }
        else{
            System.out.println("Employee servis is less than 5 year");
        }
    }
}
