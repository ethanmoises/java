public class Car {

    private String brand;
    private String model;
    private int year;
    private String color;
    private EngineType engineType;

    Car(String brand, String model, int year, String color, EngineType engineType) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.engineType = engineType;
    }

    public void displayCar(){

        System.out.println(brand);
        System.out.println(model);
        System.out.println(year);
        System.out.println(color);
        System.out.println(engineType);
    }

    @Override
    public String toString() {
        return "Brand: " + brand +
                ", Model: " + model +
                ", Year: " + year +
                ", Color: " + color +
                ", Engine: " + engineType;
    }


}
