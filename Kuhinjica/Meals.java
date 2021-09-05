package Kuhinjica;

import java.util.ArrayList;
import java.util.List;

public class Meals {
    private List<Meal> meals;

    public Meals(List<Meal> meals) {
        this.meals = meals;
    }

    public List<Meal> getMeals() {
        return meals;
    }

    public boolean add(Meal m) {
        if (!meals.contains(m)) {
            meals.add(m);
        }
        return true;
    }

    public void remove(Meal m) {
        meals.remove(m);
    }

    //Searching via string
    public List<Meal> search(String s) {
        List<Meal> searchMeals = new ArrayList<>();
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getClass().getName().contains(s)) {
                searchMeals.add(meals.get(i));
            }
        }
        return searchMeals;
    }

    //Searching via a list
    public List<Meal> search(List<Nutriment> fridgeList) {
        List<Meal> searchResult = new ArrayList<>();
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getNutriments().containsAll(fridgeList)) {
                searchResult.add(meals.get(i));
            }
        }

        return searchResult;
    }

    //Searching via calories
    public List<Meal> search(double kcal) {
        List<Meal> caloriesSearch = new ArrayList<>();
        for (int i = 0; i < meals.size(); i++) {
            if (meals.get(i).getKcal() < kcal) {
                caloriesSearch.add(meals.get(i));
            }
        }
        return caloriesSearch;
    }

    //Searching via any category
    public List<Meal> search(String mealName, Double weight, Double calories, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        List<Meal> searchResult = new ArrayList<>();
        if (mealName == null && weight == null && calories == null && proteins == null && carbohydrates == null && fats == null && fiber == null) {
            return searchResult;
        }

        for (int i = 0; i < meals.size(); i++) {
            if ((mealName == null || meals.get(i).getName().contains(mealName))
                    && (weight == null || meals.get(i).getWeight() <= weight)
                    && (calories == null || meals.get(i).getKcal() <= calories)
                    && (proteins == null || meals.get(i).getProteins() <= proteins)
                    && (carbohydrates == null || meals.get(i).getCarbohydrates() <= carbohydrates)
                    && (fats == null || meals.get(i).getFats() <= fats)
                    && (fiber == null || meals.get(i).getFiber() <= fiber)) {
                searchResult.add(meals.get(i));
            }
        }
        return searchResult;
    }

    //Menu
    @Override
    public String toString() {
        String menu = "";
        for (int i = 0; i < meals.size(); i++) {
            menu = menu.concat(meals.get(i).toString());
        }
        return "<Jelovnik>" + "\n" + "-".repeat(10) + "\n" + menu;
    }

}
