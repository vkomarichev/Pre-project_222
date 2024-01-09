package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.carDAO.CarDAO;
import web.model.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService{


    @Autowired
    private CarDAO carDAO;

    @Override
    public List<Car> selectCars(int num) {
        return carDAO.selectCars(num);
    }
}
