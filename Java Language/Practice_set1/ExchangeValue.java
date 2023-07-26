public class ExchangeValue {
    
    public static void main(String[] args){

        int x = 5, y = 10, temp;

        temp = x;
        x = y;
        y = temp;

        System.out.println("Value of X: "+ x);
        System.out.println("Value of Y: "+ y);
    }
}
