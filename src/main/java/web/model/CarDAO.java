package web.model;


import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarDAO {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1,"BMW 5", "white"));
        cars.add(new Car(2,"Audi 100", "red"));
        cars.add(new Car(3,"Skoda Octavia", "yelow"));
        cars.add(new Car(4,"BMW 5", "blue"));
        cars.add(new Car(5,"Mercedes E-class", "black"));

    }

    public List<Car> selectCars(int num){
        if(num < 0 || num > cars.size()) {
            return cars;
        }else{
            return cars.subList(0, num);
        }
    }

}
