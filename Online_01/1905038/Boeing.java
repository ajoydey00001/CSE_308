public class Boeing implements Abs_Factory{

    public Engine getEngine(){
        return new Boeing_engine();
    }

    public Wing getWing(){
        return new Boeing_wing();
    }
}
