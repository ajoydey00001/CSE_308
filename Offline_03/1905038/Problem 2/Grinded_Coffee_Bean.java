public class Grinded_Coffee_Bean extends OptionalWrapper{


    public Grinded_Coffee_Bean(Coffee c){
        this.coffee = c;
    }

    public String getIngredient(){
        return coffee.getIngredient() + ", grinded Coffee Bean";
    }

    public int getCost(){
        return coffee.getCost() + 30;
    }
}
