public class TwoVariableCondition {

    public static void main(String[] args){
        int a = 34, b = 45;

        // if(a<50 && a<b){
        //     System.out.println("True");
        // }
        // else{
        //     System.out.println("False");
        // }
        if(a<50 || a<b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}
