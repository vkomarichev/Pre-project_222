package web.carDAO;

import web.model.Car;

import java.util.List;

public interface DAOImp {
    public List<Car> selectCars(int num);
}
