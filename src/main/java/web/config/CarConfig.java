package web.config;

import org.springframework.context.annotation.Bean;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;


public class CarConfig {
    @Bean

    public List<Car> carList() {
        return new ArrayList<>(List.of(
                new Car("BMW", 3, "3.0", "RWD", "auto"),
                new Car("LADA", 21106, "2.0", "FWD", "auto"),
                new Car("VolksWagen", 3, "UZ", "RWD", "auto"),
                new Car("BMW", 3, "UZ", "RWD", "auto"),
                new Car("BMW", 3, "UZ", "RWD", "auto")));
    }
}
