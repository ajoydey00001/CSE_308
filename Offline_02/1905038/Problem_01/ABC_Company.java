
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ABC_Company implements Subject{

    private int state;
    private List<Observer> clients;


    public ABC_Company(){
        clients = new ArrayList<Observer>();
        state = 1;
        /*
            1 for Operational
            2 for Partially down
            3 for fully down

         */
    }
    public void add(Observer p){
        clients.add(p);

    }
    public void remove(Observer p){
        clients.remove(p);

    }
    public void notifyAll(int n) throws IOException {

        for(Observer p : clients){
            p.modify(n);
        }
    }
}
