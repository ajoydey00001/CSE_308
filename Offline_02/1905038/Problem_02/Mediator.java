import java.util.List;

public interface Mediator {

    public void printStudentsMarks();

    public void getStudentsMarks(List<Integer> l);

    public void getRequest(Student s);

    public void getUpdate(int id,int mark);

}
