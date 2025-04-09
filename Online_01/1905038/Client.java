import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Client {

    public static void main(String[] args) throws IOException{

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter your prefered  company name");
        String s = br.readLine();
        Factory_Builder builder = new Factory_Builder();
        Abs_Factory plane = builder.getPlane(s);

        System.out.println("The company name is " + s);
        System.out.println("The engine of this plane is " + plane.getEngine().getName());
        System.out.println("The wing of this plane is "+plane.getWing().getName());
    }
}
