package food;

public class FoodBuilder {
    private Food food;

    public FoodBuilder(){
        food = new Food("","","");
    }

    public FoodBuilder start(){
        return this;
    }
    public FoodBuilder setSource(String source){
        this.food.setSource(source);
        return this;
    }

    public FoodBuilder setMeat(String meat){
        this.food.setMeat(meat);
        return this;
    }

    public FoodBuilder setNoodle(String noodle){
        this.food.setNoodle(noodle);
        return this;
    }

    public Food build(){
        return this.food;
    }
}
