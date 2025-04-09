import java.io.IOException;

public interface Subject {

    public  void  add(Observer p);
    public  void  remove(Observer p);
    public void notifyAll(int n) throws IOException;
}
