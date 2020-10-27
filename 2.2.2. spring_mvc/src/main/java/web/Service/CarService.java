package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "White", "Lexus"));
        cars.add(new Car(2, "Black", "Nissan"));
        cars.add(new Car(3, "Yellow", "AstonMartin"));
        cars.add(new Car(4, "Green", "Volkswagen"));
        cars.add(new Car(5, "Blue", "Volvo"));

    }

    public List<Car> getCar(Integer j) {
        return j == null || j >= 5 ? cars : cars.subList(0, j);
    }

    public int getNumberOfCars() {
        return cars.size();
    }
}
