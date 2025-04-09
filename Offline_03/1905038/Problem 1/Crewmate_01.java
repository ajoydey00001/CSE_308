public class Crewmate_01 implements Passenger{

    @Override
    public void actualIdentity(){
        System.out.println("I am a crewmate.");
    }

    @Override
    public void doTask(){
        System.out.println("I am studying the interstellar objects and sometimes, doing basic maintenance tasks of the spaceship");
    }
}
