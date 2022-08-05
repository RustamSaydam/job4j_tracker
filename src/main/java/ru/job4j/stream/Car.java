package ru.job4j.stream;

import java.time.LocalDate;

public class Car {
    private String brand;
    private LocalDate created;
    private String model;
    private double volume;
    private String color;

    @Override
    public String toString() {
        return "Car{"
                +
                "brand='" + brand + '\''
                +
                ", created=" + created
                +
                ", model='" + model + '\''
                +
                ", volume=" + volume
                +
                ", color='" + color + '\''
                +
                '}';
    }

    static class Builder {
        private String brand;
        private LocalDate created;
        private String model;
        private double volume;
        private String color;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildCreated(LocalDate created) {
            this.created = created;
            return this;
        }

        Builder buildModel(String model) {
            this.model = model;
            return this;
        }

        Builder buildVolume(double volume) {
            this.volume = volume;
            return this;
        }

        Builder buildColor(String color) {
            this.color = color;
            return this;
        }

        Car build() {
         Car car = new Car();
         car.brand = brand;
         car.color = color;
         car.created = created;
         car.model = model;
         car.volume = volume;
         return car;
        }
    }

    public static void main(String[] args) {
      Car car = new Builder()
              .buildBrand("Toyota")
              .buildModel("Camry")
              .buildColor("Red")
              .buildCreated(LocalDate.of(2021, 6, 13))
              .buildVolume(2.5)
              .build();
        System.out.println(car);
    }
}
