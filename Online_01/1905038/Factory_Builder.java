public class Factory_Builder {

    public Abs_Factory getPlane(String s){
        if(s==null) return null;
        else if(s.equalsIgnoreCase("AirBus")){
            return new AirBus();
        }
        else if(s.equalsIgnoreCase("Boeing")){
            return new Boeing();
        }
        else if(s.equalsIgnoreCase("Safran")){
            return new Safran();
        }
        return null;
    }
}
