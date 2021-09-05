package Kuhinjica;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Meal {
    private final UUID id;
    private String name;
    private List<Nutriment> nutriments;

    //Constructor
    public Meal(String name, List<Nutriment> nutriments) {
        this.id = UUID.randomUUID();
        if (this.name.isEmpty() || this.name.isBlank()) {
            for (int i = 0; i < 2; i++) {
                this.name = "".concat(nutriments.get(i).getName().concat(" "));
            }
        } else {
            this.name = name;
        }
        this.nutriments = nutriments;
    }

    //Alternative Kuhinjica.Meal Constructor
    public Meal(String name) {
        this.id = UUID.randomUUID();
        if (this.name.isEmpty() || this.name.isBlank()) {
            for (int i = 0; i < 2; i++) {
                this.name = "".concat(nutriments.get(i).getName().concat(" "));
            }
        } else {
            this.name = name;
        }
        this.nutriments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    //Name randomizer
    public void randomizer(Meal n) {
        if (this.name.isEmpty() || this.name.isBlank()) {
            for (int i = 0; i < 2; i++) {
                this.name = "".concat(nutriments.get(i).getName().concat(" "));
            }
        }
    }

    //Add
    public void add(Nutriment n) {
        for (int i = 0; i < nutriments.size(); i++) {
            if (nutriments.contains(n)) {
                double increasedWeight = nutriments.get(i).getWeight() + n.getWeight();
                nutriments.get(i).setWeight(increasedWeight);
                return;
            }
        }
        nutriments.add(n);
    }

    //Remove
    public void remove(Nutriment n) {
        nutriments.remove(n);
    }

    public void remove(Nutriment n, double weight) {
        for (int i = 0; i < nutriments.size(); i++) {
            if (nutriments.contains(n)) {
                nutriments.get(i).setWeight(nutriments.get(i).getWeight() - n.getWeight());
                if (nutriments.get(i).getWeight() <= 0) {
                    remove(nutriments.get(i));
                    return;
                }
            }
        }
    }

    //Totals for meals
    public double getKcal() {
        double totalMealKcal = 0;
        for (Nutriment nutriment : nutriments) {
            totalMealKcal += nutriment.getTotalKcal();
        }
        return totalMealKcal;
    }

    public double getProteins() {
        double totalMealProteins = 0;
        for (Nutriment nutriment : nutriments) {
            totalMealProteins += nutriment.getTotalProteins();
        }
        return totalMealProteins;
    }

    public double getCarbohydrates() {
        double totalMealCarbohydrates = 0;
        for (Nutriment nutriment : nutriments) {
            totalMealCarbohydrates += nutriment.getTotalCarbohydrates();
        }
        return totalMealCarbohydrates;
    }

    public double getFats() {
        double totalMealFats = 0;
        for (Nutriment nutriment : nutriments) {
            totalMealFats += nutriment.getTotalFats();
        }
        return totalMealFats;
    }

    public double getFiber() {
        double totalMealFiber = 0;
        for (Nutriment nutriment : nutriments) {
            totalMealFiber += nutriment.getTotalFiber();
        }
        return totalMealFiber;
    }

    public double getWeight() {
        double totalMealWeight = 0;
        for (Nutriment nutriment : nutriments) {
            totalMealWeight += nutriment.getWeight();
        }
        return totalMealWeight;
    }

    // id getter
    public UUID getId() {
        return id;
    }

    //meals equal by id
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Meal meal = (Meal) o;
        return id.equals(meal.id);
    }

    @Override
    public String toString() {
        return "[" + id + "] | Name: " + name + "\n";
    }
}
