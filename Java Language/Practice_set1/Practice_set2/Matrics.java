import java.util.Scanner;

public class Matrics{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[][] matrics = {{5,8,6},{4,8,7} ,{4,7,3}};
        int[][] number =  {{4,8,2},{1,5,8},{4,2,3}};
        int[][] mult = {{0,0,0},{0,0,0},{0,0,0 }};

        System.out.println("Addition of two matrics");
        for(int i = 0; i < matrics.length;i++){
            for(int j = 0; j < matrics[i].length;j++){
                System.out.print(matrics[i][j]+number[i][j]+" ");
                
        }
        System.out.print("\n");
        }


        System.out.println("Multipication of two matrics");
        for(int i = 0; i < matrics.length;i++){
            for(int j = 0; j < matrics[i].length;j++){
                for(int k = 0; k < matrics.length; k++){
                    mult[i][j] += matrics[i][k] * number[k][j];
                }
                // System.out.print(mult[i][j] + " ");
                
        }
        // System.out.print("\n");
        }

        for(int i = 0; i < matrics.length;i++){
            for(int j = 0; j < matrics[i].length;j++){
                System.out.print(mult[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
