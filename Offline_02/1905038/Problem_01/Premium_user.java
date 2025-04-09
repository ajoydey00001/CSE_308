import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Premium_user implements Observer{
    private int currentState ;
    private int nextState;

    private int choice;
    /*
        1 for taking service from ABC company
        2 for taking service from ABC & DEF company
        3 for taking service from DEF company

     */
    private ABC_Company server;

    public Premium_user(ABC_Company s){
        server = s;
        server.add(this);
        currentState = 1;
        choice = 1;

    }

    @Override
    public void modify(int n) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        nextState = n;
        System.out.println();
        System.out.println("---------------------------Premium user : --------------------------------------------");
        if(currentState == 1){
            System.out.println("Previous state of server is Operational state");
        }
        else if(currentState == 2){
            System.out.println("Previous state of server is Partially down state ");
        }
        else {
            System.out.println("Previous state of server is Fully down state");

        }
        if(nextState == 1){
            System.out.println("Current state of server is Operational state");
        }
        else if(nextState == 2){
            System.out.println("Current state of server is Partially Down state");
        }
        else{
            System.out.println("Current state of server is Fully Down state");
        }
        System.out.println();

        if(currentState != nextState){
            if((currentState == 1) && (nextState == 2)){

                System.out.println("ABC company asks you that :");
                System.out.println("Enter 1 for using service from two servers(ABC & DEF)");
                System.out.println("Enter 2 for using service from one server(DEF)");

                choice =Integer.parseInt(br.readLine());
                choice++;
                if(choice == 2){
                    System.out.println("Now, you are taking service from two servers(ABC & DEF)");

                }
                else{
                    System.out.println("Now, you are taking service from one server(DEF)");
                }


            }
            else if(currentState == 1 && (nextState == 3)){

                choice = 3;
                System.out.println("ABC company notifies you that the service is now provided by their partner DEF company");

            }
            else if((currentState == 2) && (nextState == 3)){

                if(choice == 2){

                    System.out.println("As you was taking service from two servers, ABC company shifts all the services to the server of DEF");
                    choice = 3;
                }
            }
        }

        if(nextState == 1) choice = 1;

        currentState = nextState;
        System.out.println("------------------------------------------------------------------------------------------------");
    }

}
