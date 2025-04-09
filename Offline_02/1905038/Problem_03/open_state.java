import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class open_state implements State{


    vending_machine machine;

    public open_state(vending_machine m){
        machine = m;

    }

    public void pay(int p) throws IOException {
        int k = p;
        k--;
        machine.setAmount(k);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        System.out.println("Please enter money");
        while (true){
            int l = Integer.parseInt(br.readLine());
            System.out.println();
            n +=l;
            if(n==10){
                System.out.println("Here is your product");
                System.out.println("     **********");
                System.out.println("     *  Cake  *");
                System.out.println("     **********");
                break;
            }
            else if(n>10){
                l = n - 10;
                System.out.println("Here is your extra amount : "+l + " BDT");
                System.out.println("Here is your product");
                System.out.println("     **********");
                System.out.println("     *  Cake  *");
                System.out.println("     **********");
                break;
            }
            else{
                System.out.println("The provided amount is less than the price of the product");
                System.out.println("Please enter "+ (10-n) +" BDT that is more needed");

            }
        }


        if(k==0){
            machine.setState(machine.getCloseState());
        }
    }
    public void refill() throws IOException{

        System.out.println("Refill is forbidden in open state");

    }
}
