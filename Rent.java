class Vehicle {
    private String brand;
    private int speed;
    Vehicle(String brand, int speed) {
        this.brand = brand;
        this.speed = speed;
    }
    void details() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }	}
class Car extends Vehicle {
    private int doors;
    private int capacity;
    public Car(String brand, int speed, int doors, int capacity) {
        super(brand, speed);
        this.doors = doors;
        this.capacity = capacity;
    }
    void carDetails() {
        System.out.println("Number of doors: " + doors);
        System.out.println("Capacity: " + capacity);
    }
    @Override
    void details() {
        super.details();
        carDetails();
    }	}
class Bike extends Vehicle {
    private boolean gears;
    Bike(String brand, int speed, boolean gears) {
        super(brand, speed);
        this.gears = gears;
    }
    void bikeDetails() {
   System.out.println(gears ? "This bike has gears." : "This bike does not have gear system.");
    }
   
    void details() {
        super.details();
        bikeDetails();
    }	}
class Truck extends Vehicle {
    private int tons;
    Truck(String brand, int speed, int tons) {
        super(brand, speed);
        this.tons = tons;
    }
    void truckDetails() {
        System.out.println("The capacity of truck is: " + tons + " tons.");
    }
   
    void details() {
        super.details();
        truckDetails();
    }	}
public class Rent {
    public static void main(String[] args) {
        Car c = new Car("Toyota", 120, 5, 5);
        c.details();
        Bike b = new Bike("KTM", 80, true);
        b.details();
        Truck t = new Truck("TATA", 100, 1);
        t.details();
    }	}