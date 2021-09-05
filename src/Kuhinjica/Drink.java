package Kuhinjica;

public class Drink extends Nutriment {

    //Kuhinjica.Drink constructor
    public Drink(String company, String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(company, name, weight, kcal, proteins, carbohydrates, fats, fiber);
    }

    //Kuhinjica.Drink alternative constructor.
    public Drink(String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name, weight, kcal, proteins, carbohydrates, fats, fiber);
    }
}
