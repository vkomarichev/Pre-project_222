package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.carDAO.CarDAO;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService{
    private final CarDAO carDAO;

    @Autowired
    public CarServiceImpl(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @Override
    public List<Car> selectCars(int num) {
        return carDAO.selectCars(num);
    }
}
