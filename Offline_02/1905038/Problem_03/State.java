import java.io.IOException;

public interface State {


    public void pay( int k) throws IOException;
    public void refill() throws IOException;

}
