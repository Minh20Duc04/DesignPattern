import Factories.GlobalFactory;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello Customer !!!\nEnter your Car Type : ");
        String carType = scanner.next();
        System.out.println("Enter your model make location : ");
        String makeLocation = scanner.next();

        GlobalFactory globalCarFactory = new GlobalFactory();
        System.out.println(globalCarFactory.decideMakeLocation(makeLocation, carType));

        scanner.close();
    }
}
