public class SumOfFirstLast {
    
    public static void main(String[] args){

        int num = 76594;

        int five = num % 10;
        num /= 10;

        int four = num % 10;
        num /= 10;

        int three = num % 10;
        num /= 10;

        int second = num % 10;
        int first = num / 10;

        

        System.out.println(first + four);
        // System.out.println(second);
        // System.out.println(three);
        // System.out.println(four);
        // System.out.println(five);
    }
}
