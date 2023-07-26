import java.util.Arrays;

public class DuplicateArray1{

    static int[] duplicateArray(int[] num){
        int [] array = new int[5];
        int k = 0;

        for(int i = 0;i<(num.length-1);i++){
            
            for(int j = 1; j < num.length; j++){

                    if(num[i] == num[j] ){
                        array[k]=num[i];
                        System.out.println(num[i]);
                        k++;
                    }
                
            }
            
        }


    return array;
    }

    public static int[] Duplicates(int[] numbers) {
        int[] duplicatesArray = new int[numbers.length];
        int duplicatesCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    boolean isDuplicate = false;
                    for (int k = 0; k < duplicatesCount; k++) {
                        if (numbers[i] == duplicatesArray[k]) {
                            isDuplicate = true;
                            break;
                        }
                    }
                    if (!isDuplicate) {
                        duplicatesArray[duplicatesCount] = numbers[i];
                        duplicatesCount++;
                    }
                }
            }
        }

        return Arrays.copyOf(duplicatesArray, duplicatesCount);
    }


    public static void main(String [] args){
        int[] arr = {2,5,4,7,2,5,4,1,2};
        
        int[] duplicat =  Duplicates(arr);

        for(int i = 0; i < duplicat.length; i++){
            System.out.println(duplicat[i]);
            
        }

        

    }
}