package Car;

public abstract class Car {
    private String carType;
    private String makeLocation;


    protected Car(String carType, String makeLocation)
    {
        this.carType = carType;
        this.makeLocation = makeLocation;
    }

    protected abstract void orderCar();

    @Override
    public String toString() {
        return "Your carType: "+carType+" is made from "+ makeLocation + " branch factory. \n";
    }
}
