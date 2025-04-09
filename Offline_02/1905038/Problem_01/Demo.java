import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {



    public static void main(String args[]) throws IOException{

            ABC_Company server = new ABC_Company();
            Premium_user premium_user = new Premium_user(server);
            Regular_user regular_user = new Regular_user(server);
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));


            while (true){
                System.out.println();
                System.out.println("Do you want to change the state of server");
                System.out.println("Enter 1 for Yes");
                System.out.println("Enter 2 for No");
                int p = Integer.parseInt(br.readLine());
                if(p==2){
                    break;
                }
                else{

                    System.out.println("Please enter the corresponding number of state what the current state will be changed to : ");
                    System.out.println("Enter 1 for Operational state");
                    System.out.println("Enter 2 for Partially down state");
                    System.out.println("Enter 3 for Fully down state");

                    p = Integer.parseInt(br.readLine());
                    server.notifyAll(p);



                }
            }


    }
}
