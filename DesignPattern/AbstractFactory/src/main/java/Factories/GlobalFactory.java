package Factories;

import Car.Car;

public class GlobalFactory {

    public Car decideMakeLocation(String location, String carType)
    {
        Car car = null;
        if(location.equalsIgnoreCase("asian"))
        {
            AsianCarFactory asianCarFactory = new AsianCarFactory();
            car = asianCarFactory.orderNewCar(carType);
        }
        else if(location.equalsIgnoreCase("american"))
        {
            AmericanFactory americanFactory = new AmericanFactory();
            car = americanFactory.orderNewCar(carType);
        }
        else if (location.equalsIgnoreCase("european"))
        {
            EuropeanCarFactory europeanCarFactory = new EuropeanCarFactory();
            car = europeanCarFactory.orderNewCar(carType);
        }
        return car;
    }







}
