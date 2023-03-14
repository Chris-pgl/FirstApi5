package com.example.demo.DTO;

import lombok.ToString;

public class CarDTO {

    String id = "mandatory";
    String modelName = "mandatory";
    double price;

    public CarDTO(String id, String modelName, double v) {
        this.id = id;
        this.modelName = modelName;
        this.price = price;
    }

    public CarDTO() {
    }

    @Override
    public String toString() {
        return "CarDTO{" +
                "id='" + id + '\'' +
                ", modelName='" + modelName + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
