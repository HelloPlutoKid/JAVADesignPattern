import food.Food;
import food.FoodBuilder;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
    	// 모든 변수를 초기화 하는 경우 
        Food food1 = new FoodBuilder()
        		.start()
        		.setSource("라면스프")
        		.setNoodle("라면사리")
        		.setMeat("소고기")
        		.build();
        
        // meat를 제외한 변수를 초기화 하는 경우 
        Food food2 = new FoodBuilder()
        		.start()
        		.setSource("쌀스프")
        		.setNoodle("국수")
        		.build();

        System.out.println(food1.toString());
        System.out.println(food2.toString());

    }
}