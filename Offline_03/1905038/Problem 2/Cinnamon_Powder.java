public class Cinnamon_Powder extends OptionalWrapper{

    public Cinnamon_Powder(Coffee c){
        this.coffee = c;
    }
    public String getIngredient(){
        return  coffee.getIngredient() + ", cinnamon powder";
    }
    public int getCost(){
        return coffee.getCost() + 50;
    }
}
