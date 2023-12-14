package bg.smg;
import bg.smg.Car;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;



public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("BMW", "M5", 2021));
        cars.add(new Car("Audi", "A3", 2008));
        cars.add(new Car("Renault", "Clio", 2020));
        cars.add(new Car("Ford", "Focus", 2010));

        Collections.sort(cars);
        for(Car car: cars) {
            System.out.println(car);
        }
    }
}
