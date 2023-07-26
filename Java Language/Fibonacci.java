public class Fibonacci{

    public static void main(String[] args){

        int num = 20;

        int first = 0, second = 1;
        
        for(int i = 0 ; i < num;i++){
            System.out.print(first + ", ");
            int x = first + second;
            first = second;
            second = x;
        }

    }
}