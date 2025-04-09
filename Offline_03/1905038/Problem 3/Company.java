import java.util.ArrayList;
import java.util.Iterator;

public class Company extends Component{
    ArrayList<Component> components = new ArrayList<>();
    String name;

    public Company(String n){
        name = n;

    }
    public void add(Component c){
        components.add(c);
    }
    public void remove(String s){
        System.out.println();
        System.out.println(s+"'s hierarchy is shown here : ");

        for(int i=0;i<components.size();i++){
            if(components.get(i).getName().equalsIgnoreCase(s)){
                components.get(i).hierarchy();
                System.out.println();
                components.get(i).deleteAll();
                components.remove(i);
                System.out.println(s+ " is removed");

                System.out.println();
                return;
            }
        }

        for(int i=0;i<components.size();i++){
            Component temp = components.get(i).searchByName(s);
            if(temp!= null) {
                temp.hierarchy();
                System.out.println();
                temp.deleteAll();
                components.get(i).deleteFromList(s);

                System.out.println();
                return;
            }
        }




    }

    public void remove(Component c){
        components.remove(c);
    }

    public boolean deleteFromList(String s){
        for(int i=0;i<components.size();i++){
            if(components.get(i).getName().equalsIgnoreCase(s)){
                System.out.println(s+" is removed");
                components.remove(i);

                return true;
            }
        }
        for(int i=0;i<components.size();i++){
            if(components.get(i).deleteFromList(s)){
                return true;
            }
        }
        return false;
    }
    public void deleteAll(){
            int n = components.size();
            for(int i=0;i<n;i++){
                components.get(i).deleteAll();
            }
            for(int i=0;i<n;i++){
                System.out.println(components.get(0).getName()+" is removed");
                components.remove(0);
            }
            components.clear();
    }

    public Component getChild(int i){
        return (Component) components.get(i);
    }
    public String getName(){
        return name;
    }
    public void hierarchy(){

        if(!name.equalsIgnoreCase("NONE")){
            System.out.println("--"+getName());

        }
        Iterator<Component> iterator = components.iterator();
        while (iterator.hasNext()){
            Component k = (Component) iterator.next();
            k.hierarchy();
        }


    }
    @Override
    public Component searchByName(String s){
        for(int i=0;i<components.size();i++){
            if(components.get(i).getName().equalsIgnoreCase(s)){
                return components.get(i);
            }
        }

        for(int i=0;i<components.size();i++){
            Component temp = components.get(i).searchByName(s);
            if(temp!= null) return temp;
        }

        return null;

    }
    public void getDetails(){
        System.out.println("Name : "+name);
        System.out.println("Number of project managers : "+components.size());
    }

}
