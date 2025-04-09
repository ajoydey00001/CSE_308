public class AirBus implements Abs_Factory{

    public Engine getEngine(){
        return new AirBus_engine();
    }

    public Wing getWing(){
        return new AirBus_wing();
    }
}
