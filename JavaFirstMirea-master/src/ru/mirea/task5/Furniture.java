package ru.mirea.task5;

public abstract class Furniture {
    protected String material;
    protected double weight;

    protected double cost;

    Furniture(String material, double weight, double cost) {
        this.material = material;
        this.weight = weight;
        this.cost = cost;
    }

    public abstract String breakIt();
}

class Chair extends Furniture {
    private Boolean soft;

    Chair(String material, double weight, Boolean soft, double cost) {
        super(material, weight, cost);
        this.soft = soft;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getSoft() {
        return soft;
    }

    public double getCost() {
        return cost;
    }

    public String breakIt() {
        return "Ooops, you broke it...";
    }

    @Override
    public String toString() {
        return "Chair{material=" + material + ", weight=" + weight +
                ", soft=" + soft + ", cost=" + cost +
                '}';
    }
}

class Sofa extends Furniture {
    private Boolean soft;

    Sofa(String material, double weight, Boolean soft, double cost) {
        super(material, weight, cost);
        this.soft = soft;
    }

    public String getMaterial() {
        return material;
    }

    public double getWeight() {
        return weight;
    }

    public Boolean getSoft() {
        return soft;
    }

    public double getCost() {
        return cost;
    }
    public String breakIt() {
        return "Ooops, you broke it...";
    }

    @Override
    public String toString() {
        return "Sofa{material=" + material + ", weight=" + weight +
                ", soft=" + soft + ", cost=" + cost +
                '}';
    }
}