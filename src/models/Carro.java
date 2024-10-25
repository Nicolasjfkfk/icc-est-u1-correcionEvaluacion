package models;

public class Carro {
    private String name;
    private String model;

    private int year;

    public Carro(String name, String model, int year) {
        this.name = name;
        this.model = model;
        this.year = year;
    }

    public String getPlaca() {
        return name;
    }

    public void setPlaca(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
    
}
