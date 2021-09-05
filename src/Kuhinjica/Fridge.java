package Kuhinjica;

import java.util.List;

public class Fridge {
    private List<Nutriment> nutriments;

    public Fridge(List<Nutriment> nutriments) {
        this.nutriments = nutriments;
    }

    public List<Nutriment> getNutriments() {
        return nutriments;
    }

    //Add
    public void add(Nutriment n) {
        for (int i = 0; i < nutriments.size(); i++) {
            if (!nutriments.contains(n)) {
                nutriments.add(n);
            } else {
                nutriments.get(i).setWeight(nutriments.get(i).getWeight() + n.getWeight());
            }
        }
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
}
