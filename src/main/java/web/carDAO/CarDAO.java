package web.carDAO;

import web.model.Car;

import java.util.List;

public interface CarDAO {
    public List<Car> selectCars(int num);
}
