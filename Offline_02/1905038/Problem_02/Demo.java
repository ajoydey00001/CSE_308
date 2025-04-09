import java.io.IOException;
import java.util.Random;

public class Demo {

    public static void main(String args[]) throws IOException {

        Random rand = new Random();
        ExamController examController = new ExamController(rand);
        Examiner examiner = new Examiner(examController,rand);
        Student_01 student_01 = new Student_01(examController);
        Student_02 student_02 = new Student_02(examController);
        Student_03 student_03 = new Student_03(examController);
        Student_04 student_04 = new Student_04(examController);
        Student_05 student_05 = new Student_05(examController);
        examController.registerStudent_01(student_01);
        examController.registerStudent_02(student_02);
        examController.registerStudent_03(student_03);
        examController.registerStudent_04(student_04);
        examController.registerStudent_05(student_05);
        examController.registerExaminer(examiner);

        examiner.sendMarkSheet();
        examController.printStudentsMarks();


        student_01.printMarks();
        student_02.printMarks();
        student_03.printMarks();
        student_04.printMarks();
        student_05.printMarks();

        student_01.applyForReExamination();


        student_02.applyForReExamination();



        student_03.applyForReExamination();



        student_04.applyForReExamination();




        student_05.applyForReExamination();






    }
}
