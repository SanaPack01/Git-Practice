package toyota;

public class Toyota {
    private static final int WHEEL = 4;
    private double engine;
    private String color;
    private String model;
    private String year;
    private boolean isCoupe;
    private double price;
    private String transmission;

    public Toyota(double engine, String color, String model, String year, boolean isCoupe, double price, String transmission) {
        this.engine = engine;
        this.color = color;
        this.model = model;
        this.year = year;
        this.isCoupe = isCoupe;
        this.price = price;
        this.transmission = transmission;

        if (transmission.equalsIgnoreCase("avtomat") || transmission.equalsIgnoreCase("mehanika") || transmission.equalsIgnoreCase("robot"))
            ;
        {
            this.transmission = transmission;
        }
    }

    public static int getWHEEL() {
        return WHEEL;
    }

    public double getEngine() {
        return engine;
    }

    public void setEngine(double engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public boolean isCoupe() {
        return isCoupe;
    }

    public void setCoupe(boolean coupe) {
        isCoupe = coupe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void printCarInfo() {
        System.out.println("обьем ыашей машины " + engine + " " + "цвет" + color + "" + "модель" + model);
    }
}


