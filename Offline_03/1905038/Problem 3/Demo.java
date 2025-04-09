import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.io.IOException;
import java.util.ArrayList;

public class Demo {

    public static void main(String[] args)throws IOException{
        Component allCompany = new Company("NONE");


        while (true){

            System.out.println("What do you want ?");
            System.out.println("Enter 1 to create");
            System.out.println("Enter 2 to remove");
            System.out.println("Enter 3 to find hierarchy");
            System.out.println("Enter 4 to find details");
            System.out.println("Enter 5 to quit");

            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            int t = Integer.parseInt(br.readLine());
            if(t==5) {
                break;
            }
            else if(t==1){

                System.out.println("What do you want : ");
                System.out.println("Enter 1 to create Company");
                System.out.println("Enter 2 to create Project Manager");
                System.out.println("Enter 3 to create Developer");
                t = Integer.parseInt(br.readLine());
                if(t==1){
                    System.out.println("Enter Company's Name");
                    String s = br.readLine();
                    Component e = allCompany.searchByName(s);
                    if(e!=null) {
                        System.out.println("There already exist a component who's name is "+s);
                        System.out.println("As all component's name should be unique, we can't add this");
                        System.out.println();
                        continue;
                    }
                    Component newCompany = new Company(s);
                    allCompany.add(newCompany);
                    System.out.println("Successfully added new company to company list");

                }
                else if(t==2){
                    System.out.println("Enter Project Manager's name");
                    String n = br.readLine();
                    Component e = allCompany.searchByName(n);
                    if(e!=null) {
                        System.out.println("There already exist a component who's name is "+n);
                        System.out.println("As all component's name should be unique, we can't add this");
                        System.out.println();
                        continue;
                    }
                    System.out.println("Enter the company name where this manager works");
                    String c = br.readLine();
                    System.out.println("Enter the current project's name");
                    String p = br.readLine();
                    Component newProjectManager = new Manager(n,"Project Manager",p);

                    Component y = allCompany.searchByName(c);
                    y.add(newProjectManager);
                    System.out.println("Successfully added new project manager");

                }
                else{
                    System.out.println("Enter Developer's name");
                    String d = br.readLine();
                    Component e = allCompany.searchByName(d);
                    if(e!=null) {
                        System.out.println("There already exist a component who's name is "+d);
                        System.out.println("As all component's name should be unique, we can't add this");
                        System.out.println();
                        continue;
                    }
                    System.out.println("Enter the current project's name");
                    String p = br.readLine();
                    Component newDeveloper = new Developer(d,"Developer",p);
                    System.out.println("Enter the company name where this Developer works");
                    String c = br.readLine();
                    System.out.println("Enter the project manager's name");
                    String pm = br.readLine();
                    Component y = allCompany.searchByName(c);
                    Component y2 = y.searchByName(pm);
                    y2.add(newDeveloper);
                    System.out.println("Successfully added new developer");
                }

            }
            else if(t==2){
                System.out.println("What do you want :");
                System.out.println("Enter 1 to remove a company");
                System.out.println("Enter 2 to remove a project manager");
                System.out.println("Enter 3 to remove a developer");
                t = Integer.parseInt(br.readLine());
                if(t==3){
                    System.out.println("Enter the name of a developer");
                    String d = br.readLine();
                    Component p = allCompany.searchByName(d);
                   if(p==null){
                       System.out.println();
                       System.out.println("There is no Component who's name is "+d);
                       System.out.println("So we can't remove this");
                       System.out.println();
                       continue;
                   }
                   else {
                       allCompany.remove(d);
                       System.out.println("Successfully remove this component");
                   }

                }
                else if(t==2){
                    System.out.println("Enter the name of a project manager");
                    String d = br.readLine();
                    Component p = allCompany.searchByName(d);
                    if(p==null){
                        System.out.println();
                        System.out.println("There is no Component who's name is "+d);
                        System.out.println("So we can't remove this");
                        System.out.println();
                        continue;
                    }
                    else {
                        allCompany.remove(d);
                        System.out.println("Successfully remove this component");
                    }
                }
                else{
                    System.out.println("Enter the name of a Company");
                    String d = br.readLine();
                    Component p = allCompany.searchByName(d);
                    if(p==null){
                        System.out.println();
                        System.out.println("There is no Component who's name is "+d);
                        System.out.println("So we can't remove this");
                        System.out.println();
                        continue;
                    }
                    else {
                        allCompany.remove(d);
                        System.out.println("Successfully remove this component");
                    }
                }


            }
            else if(t==3){
                System.out.println("Enter the name of the component");
                String temp = br.readLine();
                Component p = allCompany.searchByName(temp);
                if(p==null){
                    System.out.println();
                    System.out.println("There is no component who's name is "+ temp);
                    System.out.println();
                    continue;
                }
                else {
                    System.out.println();
                    p.hierarchy();
                    System.out.println();
                }
            }
            else{
                System.out.println("Enter the name of the component");
                String temp = br.readLine();
                Component p = allCompany.searchByName(temp);

                if(p==null){
                    System.out.println();
                    System.out.println("There is no component who's name is "+ temp);
                    System.out.println();
                    continue;
                }
                else {
                    System.out.println("------------------------------ Details  ---------------------------------------");
                    System.out.println();
                    p.getDetails();
                    System.out.println();
                }
                System.out.println("--------------------------------------------------------------------------");
            }
            System.out.println();
            System.out.println("---------------------- Hierarchy -----------------------------");
            System.out.println();
            allCompany.hierarchy();
            System.out.println();
            System.out.println("---------------------------------------------------------------");
            System.out.println();
        }
    }
}
