package org.example;
import org.json.*;
class Car {
    private String brand;
    private String model;
    private int price;
    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    public JSONObject toJson() {
        JSONObject carJson = new JSONObject();
        carJson.put("brand", this.brand);
        carJson.put("model", this.model);
        carJson.put("price", this.price);
        return carJson;
    }
}
public class P2_ConvertCarToJSON {
    public static void main(String[] args) {
        Car car = new Car("Tata Motors", "Tata", 1500000);
        System.out.println("here we converted the car object into json format....");
        System.out.println(car.toJson().toString());//foe converting the car into json....
    }
}