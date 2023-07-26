public class ExamAllocatoin{

    public static void main(String[] args){

        int totalAttendes = 85, studendAttendes = 70;

        totalAttendes *= 0.75;

        if(totalAttendes <= studendAttendes){
            System.out.println("Allow to Exam");
        }
        else{
            System.out.println("Not Allow to Exam");
        }
    }

}
