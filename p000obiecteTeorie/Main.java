package p000obiecteTeorie;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Vehicle();
        Vehicle bike = new Vehicle();
        Vehicle truck = new Vehicle();

        car.numberOfWheels = 4;
        car.brandName = "Volkswagen";
        car.color = "Yellow";
        car.price = 2200;

        bike.numberOfWheels = 2;
        bike.brandName = "Yamaha";
        bike.color = "Blue";
        bike.price = 1000;

        truck.numberOfWheels = 6;
        truck.brandName = "Maz";
        truck.color = "Red";
        truck.price = 15500;

        System.out.printf("My car is %s and it has %d wheels, and it is %s and it cost %.2f Euro!\n", car.brandName, car.numberOfWheels, car.color, car.price);
        System.out.printf("My bike is %s and it has %d wheels, and it is %s and it cost %.2f Euro!\n", bike.brandName, bike.numberOfWheels, bike.color, bike.price);
        System.out.printf("My car is %s and it has %d wheels, and it is %s and it cost %.2f Euro!\n", truck.brandName, truck.numberOfWheels, truck.color, truck.price);
    }
}
