public class Safran implements Abs_Factory{

    public Engine getEngine(){
        return new Safran_engine();
    }

    public Wing getWing(){
        return new Safran_wing();
    }
}
