public class Milk extends OptionalWrapper{


    public Milk(Coffee c){
        this.coffee = c;
    }
    public String getIngredient(){
        return coffee.getIngredient() + ", milk";
    }
    public int getCost(){
        return coffee.getCost() + 50;
    }
}
