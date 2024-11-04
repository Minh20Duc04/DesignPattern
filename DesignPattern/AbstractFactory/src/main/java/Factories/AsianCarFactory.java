package Factories;

import Car.Car;
import Car.MiniType;
import Car.SedanType;
import Car.LuxuryType;

public class AsianCarFactory {

    public Car orderNewCar(String carType)
    {
        Car car = null;
        if(carType.equalsIgnoreCase("luxury"))
        {
            car = new LuxuryType("Asia");
        }
        else if(carType.equalsIgnoreCase("mini"))
        {
            car = new MiniType("Asia");
        }
        else if(carType.equalsIgnoreCase("sedan"))
        {
            car = new SedanType("Asia");
        }
        else
        {
            throw new IllegalArgumentException("Unknown type !");
        }
        return car;
    }
}
