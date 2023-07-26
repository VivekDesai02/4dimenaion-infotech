public class StarPattern{

    static void upToDoun(int n){
        for(int i = 0; i < n; i++){
            for(int j = i; j < n - 1; j++){
                System.out.print(" ");
            }
            for(int k = 0; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
           
    }

    static void dounToUp(int n){
        for(int i = 0; i < n; i++){
            for(int k = 0; k < i; k++){
                System.out.print(" ");
            }
            for(int j = i; j < n; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args){
        int num = 5;

        upToDoun(num);
        dounToUp(num);

    }
}