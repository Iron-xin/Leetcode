package _2002建造者模式;

public class DemoMain {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("素材套餐");
        vegMeal.showItems();
        System.out.println("总价格: " +vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("荤菜套餐");
        nonVegMeal.showItems();
        System.out.println("总价格: " +nonVegMeal.getCost());
    }
}