package Kuhinjica;

public class Food extends Nutriment {

    //Kuhinjica.Food constructor
    public Food(String company, String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(company, name, weight, kcal, proteins, carbohydrates, fats, fiber);
    }

    //Kuhinjica.Food alternative constructor
    public Food(String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name, weight, kcal, proteins, carbohydrates, fats, fiber);
    }
}
