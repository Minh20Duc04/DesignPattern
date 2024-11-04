package Car;

public class LuxuryType extends Car{

    public LuxuryType (String makeLocation) {
        super("Luxury", makeLocation);
        orderCar();
    }

    @Override
    protected void orderCar() {
        System.out.println("\n Order your new Luxury Car");
        specification();
    }

    private void specification() {
        System.out.println("A Luxury Car is designed for premium comfort and high performance, typically featuring a sleek body style, advanced technology, and high-quality materials, with specifications including powerful engines ranging from 3.0L to 6.0L, spacious interiors with leather seating for five or more passengers, cutting-edge infotainment systems, and a host of safety features such as adaptive cruise control and lane-keeping assist.");
    }

}
