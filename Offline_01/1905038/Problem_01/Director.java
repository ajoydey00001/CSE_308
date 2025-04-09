import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Director {

    public void getOrders() throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Do you want to give an order");
        System.out.println("O : To open an order");
        System.out.println("E : To Exit");
        int y = 0;
        boolean flag3 = true;
        List<Maker> listpc = null;
        String s = br.readLine();
        if(s.equalsIgnoreCase("O")){
            boolean flag1 = true;

            while (true){
                if(!flag1) {
                    break;
                }
                y++;

                 listpc = new ArrayList<>();
                System.out.println();
                while (true){
                    flag3 =true;
                    System.out.println("Which kind of PC do you want");
                    System.out.println("1 : Gaming PC");
                    System.out.println("2 : PC type 1");
                    System.out.println("3 : PC type 2");
                    System.out.println("4 : PC type 3");
                    System.out.println("if you press O , you will get an error message ");

                    String whatpc = br.readLine();
                    if(whatpc.equalsIgnoreCase("O")){
                        System.out.println("You cannot open another order while a current order is ongoing");
                        System.out.println("Do you want to include something else in the previous order");
                        System.out.println("1 : Yes");
                        System.out.println("2 : No");
                        String err = br.readLine();
                        if(err.equalsIgnoreCase("1")){
                            continue;
                        }
                        if(listpc.size()==0){
                            System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                            continue;
                        }
                        break;
                    }
                    else{

                        if(whatpc.equalsIgnoreCase("1")){

                            Maker newpc = new Gaming_PC();
                            newpc.addBase();
                            newpc.addCooler();
                            newpc.addDVD_Drive();
                            newpc.addProcessor();

                            while (true){
                                System.out.println("Do you want to add 8 GB DDR4 RAM");
                                System.out.println("1 : for 2666 MHz");
                                System.out.println("2 : for 3200 MHz");
                                System.out.println("3 : Not interest");
                                System.out.println("if you press O , you will get an error message ");

                                String buyram = br.readLine();
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addRAM("2666 MHz");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addRAM("3200 MHz");
                                    }
                                    else {
                                        break;
                                    }
                                    System.out.println("Do you want to buy more RAM ");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }

                            if(!flag3){
                                break;
                            }
                            while (true){
                                System.out.println("Do you want to add Graphic Card");
                                System.out.println("1 : for 2GB");
                                System.out.println("2 : for 4GB");
                                System.out.println("3 : Not interest");
                                System.out.println("if you press O , you will get an error message ");

                                String buyram = br.readLine();
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addGraphicCard("2 GB");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addGraphicCard("4 GB");
                                    }
                                    else {
                                        break;
                                    }
                                    System.out.println("Do you want to buy more Graphic Card");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            listpc.add(newpc);

                        }
                        else if(whatpc.equalsIgnoreCase("2")){

                            Maker newpc = new PC_type_1();
                            newpc.addBase();
                            newpc.addCooler();
                            newpc.addDVD_Drive();
                            newpc.addProcessor();

                            while (true){
                                System.out.println("Do you want to add 8 GB DDR4 RAM");
                                System.out.println("1 : for 2666 MHz");
                                System.out.println("2 : for 3200 MHz");
                                System.out.println("3 : Not interest");
                                System.out.println("if you press O , you will get an error message ");
                                String buyram = br.readLine();
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addRAM("2666 MHz");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addRAM("3200 MHz");
                                    }
                                    else {
                                        break;
                                    }
                                    System.out.println("Do you want to buy more RAM");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            while (true){
                                System.out.println("Do you want to add Graphic Card");
                                System.out.println("1 : for 2GB");
                                System.out.println("2 : for 4GB");
                                System.out.println("3 : Not interest");
                                String buyram = br.readLine();
                                System.out.println("if you press O , you will get an error message ");
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addGraphicCard("2 GB");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addGraphicCard("4 GB");
                                    }
                                    else {
                                        break;
                                    }
                                    System.out.println("Do you want to buy more Graphic Card");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            listpc.add(newpc);
                        }
                        else if(whatpc.equalsIgnoreCase("3")){

                            Maker newpc = new PC_type_2();
                            newpc.addBase();
                            newpc.addCooler();
                            newpc.addDVD_Drive();
                            newpc.addProcessor();

                            while (true){
                                System.out.println("Do you want to add 8 GB DDR4 RAM");
                                System.out.println("1 : for 2666 MHz");
                                System.out.println("2 : for 3200 MHz");
                                System.out.println("3 : Not interest");
                                String buyram = br.readLine();
                                System.out.println("if you press O , you will get an error message ");
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addRAM("2666 MHz");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addRAM("3200 MHz");
                                    }
                                    else {
                                        break;
                                    }
                                    System.out.println("Do you want to buy more RAM");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            while (true){
                                System.out.println("Do you want to add Graphic Card");
                                System.out.println("1 : for 2GB");
                                System.out.println("2 : for 4GB");
                                System.out.println("3 : Not interest");
                                System.out.println("if you press O , you will get an error message ");
                                String buyram = br.readLine();
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addGraphicCard("2 GB");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addGraphicCard("4 GB");
                                    }
                                    else {
                                        break;
                                    }
                                    System.out.println("Do you want to buy more Graphic Card");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            listpc.add(newpc);
                        }
                        else{

                            Maker newpc = new PC_type_3();
                            newpc.addBase();
                            newpc.addCooler();
                            newpc.addDVD_Drive();
                            newpc.addProcessor();

                            while (true){
                                System.out.println("Do you want to add 8 GB DDR4 RAM");
                                System.out.println("1 : for 2666 MHz");
                                System.out.println("2 : for 3200 MHz");
                                System.out.println("3 : Not interest");
                                System.out.println("if you press O , you will get an error message ");
                                String buyram = br.readLine();
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addRAM("2666 MHz");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addRAM("3200 MHz");
                                    }

                                    System.out.println("Do you want to buy more RAM");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            while (true){
                                System.out.println("Do you want to add Graphic Card");
                                System.out.println("1 : for 2GB");
                                System.out.println("2 : for 4GB");
                                System.out.println("3 : Not interest");
                                System.out.println("if you press O , you will get an error message ");
                                String buyram = br.readLine();
                                if(buyram.equalsIgnoreCase("O")){
                                    System.out.println("You cannot open another order while a current order is ongoing");
                                    System.out.println("Do you want to include something else in the previous order");
                                    System.out.println("1 : Yes");
                                    System.out.println("2 : No");
                                    String err = br.readLine();
                                    if(err.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    if(listpc.size()==0){
                                        System.out.println("There should be at least one item in an order before closing it. So you need to continue");
                                        continue;
                                    }
                                    flag3 = false;
                                    break;
                                }
                                else{
                                    if(buyram.equalsIgnoreCase("1")){
                                        newpc.addGraphicCard("2 GB");
                                    }
                                    else if(buyram.equalsIgnoreCase("2")){
                                        newpc.addGraphicCard("4 GB");
                                    }

                                    System.out.println("Do you want to buy more Graphic Card");
                                    System.out.println("1 : YES");
                                    System.out.println("2 : NO");
                                    String st = br.readLine();
                                    if(st.equalsIgnoreCase("1")){
                                        continue;
                                    }
                                    else {
                                        break;
                                    }
                                }
                            }
                            if(!flag3) break;
                            listpc.add(newpc);
                        }


                        System.out.println("Do you want to add more PC");
                        System.out.println("1 : for YES");
                        System.out.println("2 : for NO");
                        String op = br.readLine();
                        if(op.equalsIgnoreCase("1")){
                            continue;
                        }
                        else{

                            break;
                        }

                    }
                }

                System.out.println();
                System.out.println("Order number : "+ y);
                for(Maker item :listpc){
                    item.printPC();
                }
                System.out.println("Do you want to add another order");
                System.out.println("O : for order");
                System.out.println("E : for exit");
                String or = br.readLine();
                if(or.equalsIgnoreCase("E")) {
                    flag1 = false;
                }
                else {
                    continue;
                }

            }





        }
        else{
            return;
        }

    }






}
