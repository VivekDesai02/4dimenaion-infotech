package JavaModifers;

public class BankAccount {
    
    private double balence;

    public BankAccount(double balence){
        this.balence = balence;
    }

    public void deposit(double amount){
        this.balence += amount;
        System.out.println("Transecsion Successfuly!\n deposit amount: "+ amount + "\nAccount Balence: "+ this.balence); 
        
    }

    public void withDrow(double amount){
       if(this.balence >= amount){
         this.balence -= amount;
        System.out.println("Transecsion Successfuly!\n Withdrow amount: "+ amount + "\nAccount Balence: "+ this.balence); 
       }else{
        System.out.println("Check Account Balence!");
       }
        
    }
}
