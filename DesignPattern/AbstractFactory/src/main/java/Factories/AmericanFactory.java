package Factories;

import Car.Car;
import Car.LuxuryType;
import Car.MiniType;
import Car.SedanType;

public class AmericanFactory {

    public Car orderNewCar(String carType)
    {
        Car car = null;
        if(carType.equalsIgnoreCase("luxury"))
        {
            car = new LuxuryType("America");
        }
        else if(carType.equalsIgnoreCase("mini"))
        {
            car = new MiniType("America");
        }
        else if(carType.equalsIgnoreCase("sedan"))
        {
            car = new SedanType("America");
        }
        else
        {
            throw new IllegalArgumentException("Unknown type !");
        }
        return car;
    }

}
