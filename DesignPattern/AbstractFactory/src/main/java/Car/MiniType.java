package Car;

public class MiniType extends Car{


    public MiniType(String makeLocation)
    {
        super("Mini", makeLocation);
        orderCar();
    }

    @Override
    protected void orderCar() {
        System.out.println("\n Order your new Mini Car");
        specification();
    }

    private void specification() {
        System.out.println("A Mini Car is a compact vehicle designed for efficient city driving, typically featuring a small footprint with a length of about 3.0 to 4.0 meters, seating for up to four passengers, and economical engine options ranging from 1.0L to 1.5L, emphasizing fuel efficiency and ease of maneuverability.");
    }
}
