import java.io.BufferedReader;
import java.io.InputStreamReader;

interface car{
    void brand();
    void colour();
    void manufacturer();
    void engine();
    void drive_train_system();

}

class Toyota implements car{

    @Override
    public void brand(){
        System.out.println("The brand of the car is  Toyota");
        System.out.println();
    }


    @Override
    public void colour(){
        System.out.println("The colour of Toyota is Red");
        System.out.println();
    }

    @Override
    public void manufacturer() {
        System.out.println("Toyota is dominated by Japan");
        System.out.println();
    }

    @Override
    public void engine() {
        System.out.println("Toyota uses hydrogen fuel cells for its engine");
        System.out.println();
    }

    @Override
    public void drive_train_system() {
        System.out.println("Toyota use rear-wheel drive trains ");
        System.out.println();
    }


}

class BMW implements car{

    @Override
    public void brand(){
        System.out.println("The brand of the car is BMW");
        System.out.println();
    }


    @Override
    public void colour(){
        System.out.println("The colour of BMW is Black");
        System.out.println();
    }

    @Override
    public void manufacturer() {
        System.out.println("BMW is dominated by Germany");
        System.out.println();
    }

    @Override
    public void engine() {
        System.out.println("BMW uses electric engine");
        System.out.println();
    }

    @Override
    public void drive_train_system() {
        System.out.println("BMW use all-wheel drive trains ");
        System.out.println();
    }
}


class Tesla implements car{

    @Override
    public void brand(){
        System.out.println("The brand of the car is Tesla");
        System.out.println();
    }


    @Override
    public void colour(){
        System.out.println("The colour of Tesla is White");
        System.out.println();
    }

    @Override
    public void manufacturer() {
        System.out.println("Tesla is dominated by US");
        System.out.println();
    }

    @Override
    public void engine() {
        System.out.println("Tesla uses electric engine");
        System.out.println();
    }

    @Override
    public void drive_train_system() {
        System.out.println("Tesla use all-wheel drive trains ");
        System.out.println();
    }
}

 class carFactory{
    //use this method to select suitable car for this location
        public car selectCar(String location){
            if(location == null) {
                return null;
            } else if (location.equalsIgnoreCase("Asia")) {
                return new Toyota();
            } else if (location.equalsIgnoreCase("Europe")) {
                return new BMW();
            } else if (location.equalsIgnoreCase("United States")) {
                return new Tesla();
            }
            else {
                return null;
            }
        }
}







public class Problem_2 {

    public static void main(String[] args) throws java.io.IOException{
        carFactory CarFactory = new carFactory();

        System.out.print("Please enter the name of your location : ");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String location = br.readLine();

        System.out.println();

        car Car = CarFactory.selectCar(location);

        if(Car == null){
            System.out.println("There is no suitable car for this location");
            return;
        }

        Car.brand();
        Car.colour();
        Car.manufacturer();
        Car.engine();
        Car.drive_train_system();


    }

}
