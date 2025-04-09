import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class machine_demo {



    public static void main(String args[]) throws IOException {
        vending_machine machine = new vending_machine(2);
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


        while (true){

            System.out.println("The price of the product is 10 BDT");

            System.out.println("Enter 1 for pay");
            System.out.println("Enter 2 for refill");
            System.out.println("Enter 3 for exit");
            int n=Integer.parseInt(br.readLine());
            System.out.println();
            if(n==1){
                machine.pay();
            }
            else if(n==2){
                machine.refill();
            }
            else{
                break;
            }
            System.out.println();

        }


    }
}
