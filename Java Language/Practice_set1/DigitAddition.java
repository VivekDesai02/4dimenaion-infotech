public class DigitAddition {
    
    public static void main(String[] args){
        int digit = 542, sum = 0;
        while(digit > 0){
            sum += digit % 10;
            digit /= 10;
        }
        System.out.println(sum);
    }
}
