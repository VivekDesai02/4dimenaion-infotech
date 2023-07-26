public class MultipicationTable {
    
    public static void main(String[] args){
        int[] arr = {24,50,29};

        for(int i = 0; i< 3; i++){
            System.out.println("Table of "+ arr[i]);
            for(int j = 1; j <=10; j++){
                System.out.println(arr[i]*j);
            }
        }
    }
}
