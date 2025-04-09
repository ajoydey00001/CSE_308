import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Student_01 implements Student{
    int mark,id;

    ExamController examController;

    public Student_01(ExamController s){
        examController = s;
        mark = -1;
        id = 1;
    }
    public int getID(){
        return id;
    }
    public void getMarks(int i){
        mark = i;
    }

    @Override
    public void printMarks() {
        System.out.println();
        System.out.println("------------Student_01-----------------------------------------------------------------------");
        if(mark != -1){
            System.out.println("I get "+mark +" marks in the Examination");
            System.out.println("I will do better in my future exams");

        }
        else{
            System.out.println("Your result is pending");
        }

        System.out.println("---------------------------------------------------------------------------------------------");

    }

    public void applyForReExamination() throws IOException{

        System.out.println("-------------------Student 01-----------------------------------------------------------------");
        System.out.println("Do you want to apply for re-examine");
        System.out.println("Enter 1 for Yes");
        System.out.println("Enter 2 for NO");

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int p = Integer.parseInt(br.readLine());
        if(p==1){

            System.out.println("Re-examination request sent from student id 1");
            System.out.println("-----------------------------------------------------------------------------------------------");
            examController.getRequest(this);

        }

    }
    public void getUpdate(int m){
        System.out.println("--------------Student 01-----------------------------------------------------------------------");
        System.out.println();
        System.out.println("I got my final result");
        System.out.println();
        if(m==mark){
            System.out.println("My result remains same as before");
        }
        else{
            mark = m;
            System.out.println("My result is updated and I got "+mark +" marks in Examination");
        }

        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------");
    }
}
