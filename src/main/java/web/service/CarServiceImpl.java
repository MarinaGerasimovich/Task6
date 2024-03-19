package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCars(Integer count) {

        List <Car> listCar = new ArrayList<>();

        listCar.add(new Car("Audi", "White", 2014));
        listCar.add(new Car("BMW", "Black", 2021));
        listCar.add(new Car("Ford", "Grey", 2018));
        listCar.add(new Car("Kia", "Red", 2023));
        listCar.add(new Car("Geely", "Blue", 2020));


        if (count!= null && count >=1 && count <5) {
            return listCar.subList(0, count);
        }
        return listCar;
    }
}
