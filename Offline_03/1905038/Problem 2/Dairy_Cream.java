public class Dairy_Cream extends OptionalWrapper{

    public Dairy_Cream(Coffee c){
        this.coffee = c;
    }
    public String getIngredient(){
        return coffee.getIngredient() + ", Dairy Cream";
    }
    public int getCost(){
        return coffee.getCost() + 40;
    }
}
