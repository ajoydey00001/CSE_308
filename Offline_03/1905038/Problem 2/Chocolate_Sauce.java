public class Chocolate_Sauce extends OptionalWrapper{

    public Chocolate_Sauce(Coffee c){
        this.coffee = c;
    }
    public String getIngredient(){
        return coffee.getIngredient() + ", chocolate sauce";
    }
    public int getCost(){
        return coffee.getCost() + 60;
    }
}
