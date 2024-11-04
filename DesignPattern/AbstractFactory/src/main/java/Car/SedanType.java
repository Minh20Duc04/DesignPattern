package Car;

public class SedanType extends Car{

    public SedanType(String makeLocation)
    {
        super("Sedan", makeLocation);
        orderCar();
    }

    @Override
    protected void orderCar() {
        System.out.println("\n Order your new Sedan Car");
        specification();
    }

    private void specification() {
        System.out.println("A Sedan typically features a compact body design with four doors, a seating capacity of up to five passengers, a trunk for cargo, and engine options ranging from 1.5L to 3.5L, offering a blend of comfort, efficiency, and advanced safety features.");
    }


}
