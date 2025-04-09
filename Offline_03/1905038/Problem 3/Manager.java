import java.util.ArrayList;
import java.util.Iterator;
public class Manager extends Component{
    ArrayList<Component> supervisees = new ArrayList<>();
    String name;
    String role;
    String currentProject;

    public Manager(String n, String d,String s){
        name = n;
        role = d;
        currentProject = s;
    }

    public void add(Component c){
        supervisees.add(c);
    }
    public void remove(Component c){
        supervisees.remove(c);
    }
    public Component getChild(int i){
        return (Component) supervisees.get(i);
    }
    public int getNumberOfSupervisees(){
        return supervisees.size();
    }
    public String getName(){
        return name;
    }
    public String getRole(){
        return role;
    }
    public String getCurrentProject(){
        return  currentProject;
    }
    public void getDetails(){
        System.out.println("Name : "+getName());
        System.out.println("Role : "+getRole());
        System.out.println("Current Project : "+getCurrentProject());
        System.out.println("Number of Supervisees : "+supervisees.size());
    }

    public void hierarchy(){
        System.out.println("  --"+getName());
        Iterator<Component> iterator = supervisees.iterator();
        while (iterator.hasNext()){
            Component k = (Component) iterator.next();
            k.hierarchy();
        }
    }

    public Component searchByName(String s){
        for(int i=0;i<supervisees.size();i++){
            if(supervisees.get(i).getName().equalsIgnoreCase(s)){
                return supervisees.get(i);
            }
        }
        return null;

    }


    public void deleteAll(){
        int n = supervisees.size();
        for(int i=0;i<n;i++){
            System.out.println(supervisees.get(0).getName()+" is removed");
           supervisees.remove(0);

        }
        supervisees.clear();

    }

    public boolean deleteFromList(String s){
        for(int i=0;i<supervisees.size();i++){
            if(supervisees.get(i).getName().equalsIgnoreCase(s)){
                System.out.println(s+ " is removed ");
                supervisees.remove(i);
                return true;
            }
        }
        return false;
    }



}
