import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Examiner implements Teacher{

    private List<Integer> studentsMark;
    private ExamController examController;
    Random rand;

    public Examiner(ExamController s, Random r){
        examController = s;
        rand = r;

        //Generate Student Marks
        studentsMark = new ArrayList<>(5);
        studentsMark.add(0,90);
        studentsMark.add(1,91);
        studentsMark.add(2,94);
        studentsMark.add(3,95);
        studentsMark.add(4,100);

    }

    public void sendMarkSheet(){

        System.out.println();
        System.out.println("------------------Examiner-------------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Scripts and Marks of student id 1,2,3,4,5 sent to exam controller office");
        System.out.println();
        examController.getStudentsMarks(studentsMark);

        System.out.println("--------------------------------------------------------------------------------------------------------");


    }

    public void doReExamine(int id){
        System.out.println("---------------Examiner ----------------------------------------------------------------------");
        System.out.println();
        System.out.println("I re-examine the script of student id 0"+id+" and send the update to ExamController");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");

        int p = rand.nextInt(2);
        if(p==1){

            p = rand.nextInt(101);

            examController.getUpdate(id,p);
            studentsMark.remove(id-1);
            studentsMark.add(id-1,p);

        }
        else{
            examController.getUpdate(id,studentsMark.get(id-1));
        }

    }


}
