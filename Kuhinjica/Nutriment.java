package Kuhinjica;

public abstract class Nutriment extends Grocery {
    //Fields
    private double weight;
    private double kcal;
    private double proteins;
    private double carbohydrates;
    private double fats;
    private double fiber;

    //Constructors
    public Nutriment(String company, String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(company, name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    public Nutriment(String name, double weight, double kcal, double proteins, double carbohydrates, double fats, double fiber) {
        super(name);
        this.weight = weight;
        this.kcal = kcal;
        this.proteins = proteins;
        this.carbohydrates = carbohydrates;
        this.fats = fats;
        this.fiber = fiber;
    }

    //Value Per 100g
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getKcal() {
        return kcal;
    }

    public double getProteins() {
        return proteins;
    }

    public double getCarbohydrates() {
        return carbohydrates;
    }

    public double getFats() {
        return fats;
    }

    public double getFiber() {
        return fiber;
    }

    //Total value
    public double getTotalKcal() {
        return (weight * kcal) / 100;
    }

    public double getTotalProteins() {
        return (weight * proteins) / 100;
    }

    public double getTotalCarbohydrates() {
        return (weight * carbohydrates) / 100;
    }

    public double getTotalFats() {
        return (weight * fats) / 100;
    }

    public double getTotalFiber() {
        return (weight * fiber) / 100;
    }

    //Update when value is not null
    public void update(Double weight, Double kcal, Double proteins, Double carbohydrates, Double fats, Double fiber) {
        if (weight != null) {
            this.weight = weight;
        }
        if (kcal != null) {
            this.kcal = kcal;
        }
        if (proteins != null) {
            this.proteins = proteins;
        }
        if (carbohydrates != null) {
            this.carbohydrates = carbohydrates;
        }
        if (fats != null) {
            this.fats = fats;
        }
        if (fiber != null) {
            this.fiber = fiber;
        }
    }

    //String representation
    @Override
    public String toString() {
        return "Company: " + getCompany() + "\n" +
                "Name: " + getName() + "\n" +
                "Weight: " + weight + "g" + "\n" +
                "Kcal: " + kcal + "\n" +
                "Proteins: " + proteins + "%" + "\n" +
                "Carbohydrates: " + carbohydrates + "%" + "\n" +
                "Fats: " + fats + "%" + "\n" +
                "Fiber" + fiber + "%";
    }

    //Total value String representation
    public String packageValue() {
        return super.toString() + "\n"
                + "Weight: " + weight + "\n"
                + "Kcal: " + getTotalKcal() + "\n"
                + "Proteins: " + getTotalProteins() + "\n"
                + "Carbohydrates: " + getTotalCarbohydrates() + "\n"
                + "Fats: " + getTotalFats() + "\n"
                + "Fiber: " + getTotalFiber();
    }
}
