import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] arg) throws IOException{

        while (true){

            System.out.println("Do you want to ask for an order");
            System.out.println("Enter 1 for yes");
            System.out.println("Enter 2 for no");
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            if(t == 2){
                break;
            }
            int totalCost = 0;

            while (true){
                System.out.println();
                System.out.println("Do you want to add a cup of coffee in your order");
                System.out.println("Enter 1 for yes");
                System.out.println("Enter 2 for no");
                int choice = Integer.parseInt(br.readLine());
                if(choice ==2){
                    System.out.println();
                    System.out.println("The total price for the order is :  "+totalCost);
                    System.out.println();
                    break;
                }
                System.out.println("Which kind of coffee do you want");
                System.out.println("Enter 1 for Americano");
                System.out.println("Enter 2 for Espresso");
                System.out.println("Enter 3 for Cappuccino");
                System.out.println("Enter 4 for Mocha");
                choice = Integer.parseInt(br.readLine());
                if(choice == 1){
                    Coffee cupOfCoffee = new Americano();

                    while (true){
                        System.out.println("Do you want to add some additional ingredient");
                        System.out.println("Enter 1 for yes");
                        System.out.println("Enter 2 for no");
                        choice = Integer.parseInt(br.readLine());
                        if(choice == 1){

                            System.out.println("Choose an ingredient from list below");
                            System.out.println("Enter 1 to add Grinded coffee bean");
                            System.out.println("Enter 2 to add milk");
                            System.out.println("Enter 3 to add dairy cream");
                            System.out.println("Enter 4 to add cinnamon powder");
                            System.out.println("Enter 5 to add chocolate sauce");
                            choice = Integer.parseInt(br.readLine());
                            if(choice == 1){
                                cupOfCoffee = new Grinded_Coffee_Bean(cupOfCoffee);

                            }
                            else if(choice == 2){
                                cupOfCoffee = new Milk(cupOfCoffee);
                            }
                            else if(choice == 3){
                                cupOfCoffee = new Dairy_Cream(cupOfCoffee);
                            }
                            else if(choice == 4){
                                cupOfCoffee = new Cinnamon_Powder(cupOfCoffee);

                            }
                            else{
                                cupOfCoffee = new Chocolate_Sauce(cupOfCoffee);
                            }

                        }
                        else{
                            //print
                            System.out.println();
                            System.out.println("The ingredients used in this cup of coffee are :  "+cupOfCoffee.getIngredient());
                            System.out.println("The price of individual coffee is :  "+cupOfCoffee.getCost());

                            totalCost +=cupOfCoffee.getCost();
                            break;
                        }
                    }
                }
                else if(choice == 2){
                    Coffee cupOfCoffee = new Espresso();

                    while (true){
                        System.out.println("Do you want to add some additional ingredient");
                        System.out.println("Enter 1 for yes");
                        System.out.println("Enter 2 for no");
                        choice = Integer.parseInt(br.readLine());
                        if(choice == 1){

                            System.out.println("Choose an ingredient from list below");
                            System.out.println("Enter 1 to add Grinded coffee bean");
                            System.out.println("Enter 2 to add milk");
                            System.out.println("Enter 3 to add dairy cream");
                            System.out.println("Enter 4 to add cinnamon powder");
                            System.out.println("Enter 5 to add chocolate sauce");
                            choice = Integer.parseInt(br.readLine());
                            if(choice == 1){
                                cupOfCoffee = new Grinded_Coffee_Bean(cupOfCoffee);

                            }
                            else if(choice == 2){
                                cupOfCoffee = new Milk(cupOfCoffee);
                            }
                            else if(choice == 3){
                                cupOfCoffee = new Dairy_Cream(cupOfCoffee);
                            }
                            else if(choice == 4){
                                cupOfCoffee = new Cinnamon_Powder(cupOfCoffee);

                            }
                            else{
                                cupOfCoffee = new Chocolate_Sauce(cupOfCoffee);
                            }

                        }
                        else{
                            //print
                            System.out.println();
                            System.out.println("The ingredients used in this cup of coffee are :  "+cupOfCoffee.getIngredient());
                            System.out.println("The price of individual coffee is :  "+cupOfCoffee.getCost());

                            totalCost +=cupOfCoffee.getCost();
                            break;
                        }
                    }
                }
                else if(choice == 3){
                    Coffee cupOfCoffee = new Cappuccino();

                    while (true){
                        System.out.println("Do you want to add some additional ingredient");
                        System.out.println("Enter 1 for yes");
                        System.out.println("Enter 2 for no");
                        choice = Integer.parseInt(br.readLine());
                        if(choice == 1){

                            System.out.println("Choose an ingredient from list below");
                            System.out.println("Enter 1 to add Grinded coffee bean");
                            System.out.println("Enter 2 to add milk");
                            System.out.println("Enter 3 to add dairy cream");
                            System.out.println("Enter 4 to add cinnamon powder");
                            System.out.println("Enter 5 to add chocolate sauce");
                            choice = Integer.parseInt(br.readLine());
                            if(choice == 1){
                                cupOfCoffee = new Grinded_Coffee_Bean(cupOfCoffee);

                            }
                            else if(choice == 2){
                                cupOfCoffee = new Milk(cupOfCoffee);
                            }
                            else if(choice == 3){
                                cupOfCoffee = new Dairy_Cream(cupOfCoffee);
                            }
                            else if(choice == 4){
                                cupOfCoffee = new Cinnamon_Powder(cupOfCoffee);

                            }
                            else{
                                cupOfCoffee = new Chocolate_Sauce(cupOfCoffee);
                            }

                        }
                        else{
                            //print
                            System.out.println();
                            System.out.println("The ingredients used in this cup of coffee are :  "+cupOfCoffee.getIngredient());
                            System.out.println("The price of individual coffee is :  "+cupOfCoffee.getCost());

                            totalCost +=cupOfCoffee.getCost();
                            break;
                        }
                    }

                }
                else{
                    Coffee cupOfCoffee = new Mocha();

                    while (true){
                        System.out.println("Do you want to add some additional ingredient");
                        System.out.println("Enter 1 for yes");
                        System.out.println("Enter 2 for no");
                        choice = Integer.parseInt(br.readLine());
                        if(choice == 1){

                            System.out.println("Choose an ingredient from list below");
                            System.out.println("Enter 1 to add Grinded coffee bean");
                            System.out.println("Enter 2 to add milk");
                            System.out.println("Enter 3 to add dairy cream");
                            System.out.println("Enter 4 to add cinnamon powder");
                            System.out.println("Enter 5 to add chocolate sauce");
                            choice = Integer.parseInt(br.readLine());
                            if(choice == 1){
                                cupOfCoffee = new Grinded_Coffee_Bean(cupOfCoffee);

                            }
                            else if(choice == 2){
                                cupOfCoffee = new Milk(cupOfCoffee);
                            }
                            else if(choice == 3){
                                cupOfCoffee = new Dairy_Cream(cupOfCoffee);
                            }
                            else if(choice == 4){
                                cupOfCoffee = new Cinnamon_Powder(cupOfCoffee);

                            }
                            else{
                                cupOfCoffee = new Chocolate_Sauce(cupOfCoffee);
                            }

                        }
                        else{
                            //print
                            System.out.println();
                            System.out.println("The ingredients used in this cup of coffee are :  "+cupOfCoffee.getIngredient());
                            System.out.println("The price of individual coffee is :  "+cupOfCoffee.getCost());

                            totalCost +=cupOfCoffee.getCost();
                            break;
                        }
                    }

                }

            }
        }


    }


}
