package Factories;

import Car.Car;
import Car.MiniType;
import Car.SedanType;
import Car.LuxuryType;

public class EuropeanCarFactory {
    public Car orderNewCar(String carType)
    {
        Car car = null;
        if(carType.equalsIgnoreCase("luxury"))
        {
            car = new LuxuryType("Europe");
        }
        else if(carType.equalsIgnoreCase("mini"))
        {
            car = new MiniType("Europe");
        }
        else if(carType.equalsIgnoreCase("sedan"))
        {
            car = new SedanType("Europe");
        }
        else
        {
            throw new IllegalArgumentException("Unknown type !");
        }
        return car;
    }
}
