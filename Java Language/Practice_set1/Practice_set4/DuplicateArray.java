public class DuplicateArray{

    static int[] duplicateArray(int[] num){
        int [] array = new int[5]; 
        int k = 0;
        
        for(int i = 0;i<(num.length-1);i++){
            int temp = 1;

            for(int j = 0; j < num.length; j++){

                if(i != j){

                    if(num[i] == num[j]){
                        for(int x = 0; x < array.length; x++){
                            if(num[i] == array[x] && temp == 1){
                                array[x] = num[i];
                                temp = 0;
                            }
                            else if(temp == 1){
                                array[k] = num[i];
                                // temp = 0;
                                
                            }

                        }
                        // array[k]=num[i];
                        // k++;
                        if(temp == 1){
                            k +=1;
                        }
                    }
                }
            }
            // temp = 1;
        }


       return array;
    }

    public static void main(String [] args){
        int[] arr = {2,5,4,7,2,5,1,1};
        
        int[] duplicat =  duplicateArray(arr);

        for(int i = 0; i < duplicat.length; i++){
           
            System.out.println(duplicat[i]);
            
        }

        

    } 
}