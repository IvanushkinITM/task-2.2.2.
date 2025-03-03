package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final List<Car> carList;

    @Autowired
    public CarServiceImpl(List<Car> cars){
    this.carList = cars;
    }


    public List<Car> getCars(Integer count) {

        if (count == null || count >= carList.size()) {
            return carList;
        }
        return carList.subList(0, count);
    }

}
