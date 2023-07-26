public class ReversNumber {
    
    public static void main(String[] args){

        int num = 4563;

        while(num > 0){
            System.out.print(num%10);
            num /=10;
        }
    }
}
