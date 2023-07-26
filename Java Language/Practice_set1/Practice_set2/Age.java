public class Age {

    public static void main(String[] args){

        int peopelFirst = 25 , peopelSecond = 56, peopelTherd = 45;

        if(peopelFirst > peopelSecond && peopelFirst > peopelTherd){
            System.out.println("First Peopel is oldest");
        }

        else if(peopelFirst < peopelSecond && peopelSecond > peopelTherd){
            System.out.println("Second Peopel is oldest");
        }

        else if(peopelTherd > peopelSecond && peopelFirst < peopelTherd){
            System.out.println("Therd Peopel is oldest");
        }



        if(peopelFirst < peopelSecond && peopelFirst < peopelTherd){
            System.out.println("First Peopel is youngest");
        }

        else if(peopelFirst > peopelSecond && peopelSecond < peopelTherd){
            System.out.println("Second Peopel is Youngest");
        }

        else if(peopelTherd < peopelSecond && peopelFirst > peopelTherd){
            System.out.println("Therd Peopel is Youngest");
        }

    }
    
}
