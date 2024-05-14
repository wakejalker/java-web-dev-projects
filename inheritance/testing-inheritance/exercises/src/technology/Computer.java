package technology;

public class Computer {
    protected String brand;
    protected String model;
    protected double price;

    public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public void turnOn() {
        System.out.println("Computer is turning on...");
    }
}
