import java.util.Scanner;
public class Armstrong {
    
    public static void main(String[] args){
        Scanner SC = new Scanner(System.in);

        int num, sizeOfNum = 0,sum = 0;
        System.out.println("Enetr the Number:");
        num = SC.nextInt();
        int temp = num , temp2 = num;
        while(temp != 0){
            temp /= 10;

            sizeOfNum++;
        }
        int x;
        int mult = 0;
        for(int i = 0; i < sizeOfNum;i++){
            x = num % 10;
            for(int j = 0; j < sizeOfNum - 1; j++){
              if(mult > 0){
                mult *= x;
              }
              else{
                mult += x*x;
              }
            }
            sum += mult;
            mult = 0;
            num /= 10;
        }
        if(temp2 == sum){
            System.out.println("It is Armstrong Number");
        }
        else{
            System.out.println("It is Not Armstrong Number");
        }
    }
}
