import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Regular_user implements Observer{
    private int currentState ;
    private int nextState;

    private int choice;
    /*
        1 for taking service from ABC company
        2 for taking service from ABC & DEF company
        3 for taking service from DEF company

     */

    private int cost;

    private ABC_Company server;

    public Regular_user(ABC_Company s){
        server = s;
        server.add(this);
        currentState = 1;
        choice =1;
        cost = 0;
    }

    @Override
    public void modify(int n) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        nextState = n;
        System.out.println();
        System.out.println("----------------------Regular user: --------------------------------------------------------");
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
                System.out.println("Enter 1 to continue using the limited functionality ");
                System.out.println("Enter 2 for paying $20 per hour to enjoy the full functionality taking service from server of DEF ");

                choice =Integer.parseInt(br.readLine());
                choice++;
                if(choice == 2){
                    cost = 0;
                    System.out.println("Now, you use the limited functionality of ABC company");

                }
                else{
                    cost = 100000;
                    System.out.println("Now, you are paying $20 per hour to enjoy the full functionality taking service from server of DEF");
                }


            }
            else if(currentState == 1 && (nextState == 3)){

                System.out.println("ABC company asks you whether you want to pay $20 per hour to take service from DEF company or not");
                System.out.println("Enter 1 for Yes");
                System.out.println("Enter 2 for No");
                int i =Integer.parseInt(br.readLine());
                if(i==1){
                    cost = 100000;
                    System.out.println("Now, you are paying $20 per hour to enjoy the full functionality taking service from server of DEF");
                }
                else{
                    cost = 0;

                }



            }
            else if((currentState == 2) && (nextState == 1)){
                    if(cost != 0){
                        System.out.println("As you take service from DEF company, the total bill is : "+cost +" BDT");
                    }
                    cost = 0;
            }
            else if((currentState == 3) && (nextState == 1)){
                if(cost != 0){
                    System.out.println("As you take service from DEF company, the total bill is : "+cost +" BDT");
                }
                cost = 0;
            }
        }



        currentState = nextState;
        System.out.println("--------------------------------------------------------------------------------------------");
    }

}
