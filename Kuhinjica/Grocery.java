package Kuhinjica;

import java.util.Objects;

public abstract class Grocery implements Energy {
    private String company;
    private String name;

    //Constructor of Kuhinjica.Grocery
    public Grocery(String company, String name) {
        this.company = company;
        this.name = name;
    }

    public Grocery(String name) {
        this.name = name;
        this.company = "Unknown value";
    }

    //Getters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getName() {
        return name;
    }

    //Setters
    public void setName(String name) {
        this.name = name;
    }

    //Overrides
    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Grocery grocery = (Grocery) o;
        return Objects.equals(company, grocery.company) && Objects.equals(name, grocery.name);
    }

    @Override
    public String toString() {
        return "Company: " + company + "\n"
                + "Name: " + name;
    }
}
