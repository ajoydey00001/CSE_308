import java.util.List;
import java.util.Random;


public class ExamController implements Mediator{

    private Student_01 student_01;
    private Student_02 student_02;
    private Student_03 student_03;
    private Student_04 student_04;
    private Student_05 student_05;

    private Examiner examiner;

    List<Integer> studentsMark;
    Random rand;

    public ExamController(Random r){
        rand = r;
    }


    public void registerExaminer(Examiner s){
        examiner = s;
    }
    public void registerStudent_01(Student_01 s){
        student_01 = s;
    }
    public void registerStudent_02(Student_02 s){
        student_02 = s;
    }
    public void registerStudent_03(Student_03 s){
        student_03 = s;
    }
    public void registerStudent_04(Student_04 s){
        student_04 = s;
    }
    public void registerStudent_05(Student_05 s){
        student_05 = s;
    }



    public void getStudentsMarks(List<Integer> l){
        studentsMark = l;

    }
    public void printStudentsMarks(){
        System.out.println();
        System.out.println("------------------------ExamController--------------------------------------------------------------------");
        if(studentsMark == null){

            System.out.println("I have not got any marksheet yet ");
        }
        else{
            System.out.println("Marks of Students :");
            System.out.println("    ID          Marks");

            for(int i=1;i<6;i++){
                System.out.println("    0"+i+"            "+studentsMark.get(i-1));
            }
            System.out.println("");
        }

        int p = rand.nextInt(2) + 3;

        System.out.println("There are "+p+" mistakes occurring in mark calculation ");
        System.out.println("    Student ID      Previous Mark       Corrected Mark");
        for(int j=0;j<p;j++){
            int t = rand.nextInt(5);
            int s = rand.nextInt(101);
            System.out.println("        "+(t+1) + "                "+studentsMark.get(t)+"                    "+s);
            studentsMark.remove(t);
            studentsMark.add(t,s);

        }




        student_01.getMarks(studentsMark.get(0));
        student_02.getMarks(studentsMark.get(1));
        student_03.getMarks(studentsMark.get(2));
        student_04.getMarks(studentsMark.get(3));
        student_05.getMarks(studentsMark.get(4));


        System.out.println("----------------------------------------------------------------------------------------------");
    }

    public void getRequest(Student s){
        System.out.println();
        System.out.println("--------------Exam Controller ---------------------------------------------------------------");
        System.out.println();
        if(student_01 == s){

            System.out.println("Re-examine request got from student id 01");
        }
        else if(student_02 == s){

            System.out.println("Re-examine request got from student id 02");
        }
        else if(student_03 == s){

            System.out.println("Re-examine request got from student id 03");
        }
        else if(student_04 == s){

            System.out.println("Re-examine request got from student id 04");
        }
        else{

            System.out.println("Re-examine request got from student id 05");
        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        examiner.doReExamine(s.getID());
    }

    public void getUpdate(int id,int mark){

        System.out.println("-------------Exam Controller ---------------------------------------------------------------");
        System.out.println();
        System.out.println("I got the final result of student id 0"+id +"'s script from the Examiner");
        System.out.println();
        if(studentsMark.get(id-1) == mark){
            System.out.println("NO mark is updated");
        }
        else{
            System.out.println("Here is a update :");
            System.out.println("The previous mark of the student id 0"+id +" is  :   "+studentsMark.get(id-1));
            System.out.println("The corrected mark of the student id 0"+id+" is  :   "+ mark);
            studentsMark.remove(id-1);
            studentsMark.add(id-1,mark);


        }
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
        if(id==1){
            student_01.getUpdate(mark);
        }
        else if(id == 2){
            student_02.getUpdate(mark);
        }
        else if(id == 3){
            student_03.getUpdate(mark);
        }
        else if(id == 4){
            student_04.getUpdate(mark);
        }
        else{
            student_05.getUpdate(mark);
        }

    }

}
