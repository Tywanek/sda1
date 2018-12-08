import builder.Meal;
import builder.MealBuilder;
import fabryka.Shape;
import fabryka.ShapeFactory;
import obiekty.MyUser;
import obiekty.SomeAnimal;

public abstract class Main {

    public static void main(String[] args) {
    System.out.println("Hello World!");

        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItems();
        System.out.println("Total Cost: " + vegMeal.getCost());

        Meal nonVegMeal = mealBuilder.prepareNonVegMeal();
        System.out.println("\n\nNon-Veg Meal");
        nonVegMeal.showItems();
        System.out.println("Total Cost: " + nonVegMeal.getCost());




    }

    private static void printAllNames(){
        System.out.println("Wendy es bonita");
    }

}
