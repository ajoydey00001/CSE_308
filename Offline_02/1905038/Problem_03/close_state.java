import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class close_state implements State{



    vending_machine machine;

    public close_state(vending_machine m){
        machine = m;

    }

    public void pay(int k) throws IOException{
        System.out.println("Pay is forbidden in close state");

    }
    public void refill() throws IOException {
        System.out.println("Please enter your prefer amount");
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        machine.setAmount(n);
        machine.setState(machine.getOpenState());
    }
}
