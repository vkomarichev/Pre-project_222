package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.carDAO.CarDAO;
import web.carDAO.DAOImp;
import web.model.Car;

import java.util.List;


@Controller
@RequestMapping("/cars")
public class CarController implements DAOImp {

    DAOImp daoImp = new CarDAO();

    @GetMapping("")
    public String select(@RequestParam(value = "count", defaultValue = "5") int count, Model model) {
        model.addAttribute("cars", selectCars(count));
        return "cars/cars";
    }

    @Override
    public List<Car> selectCars(int num) {
        return daoImp.selectCars(num);
    }
}
