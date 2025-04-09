import java.io.IOException;

public class vending_machine {
    private State open;
    private State close;

    private State state;

    private int amount;


    public vending_machine(int n){
        amount = n;
        open = new open_state(this);
        close = new close_state(this);

        state = open;


    }

    public void pay() throws IOException{
        state.pay(amount);
    }
    public void refill() throws IOException {
        state.refill();
    }

    public void setState(State s){
        state = s;
    }
    public State getOpenState(){
        return open;
    }
    public State getCloseState(){
        return close;
    }
    public void setAmount(int i){
        amount = i;
    }
    public int getAmount(){
        return amount;
    }

}
