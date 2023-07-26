public class PrecticTry {
    
    public static void main(String[] args){

        int temp = 135;
        int l = 0;
        while(temp > 0){
            temp /= 10;
            l++;
        }

        System.out.println(l);
    }
}
