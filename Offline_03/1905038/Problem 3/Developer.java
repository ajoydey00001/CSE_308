public class Developer extends Component{

    String name;
    String role;
    String currentProject;

    public Developer(String s, String p , String q){
        name = s;
        role = p;
        currentProject = q;
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

    }
    public void hierarchy(){
        System.out.println("    --"+getName());
    }

    public void  deleteAll(){
        return;
    }

}
