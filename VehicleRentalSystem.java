class Vehicle {  
    String brand;  
    int speed;  
    Vehicle(String brand, int speed) { 
        this.brand = brand;  
        this.speed = speed;  
    }  
    void displayDetails() {  
        System.out.println("Brand: " + brand);  
        System.out.println("Speed: " + speed + " km/h");  
    }  
    void startVehicle() {  
        System.out.println(brand + " is starting...");  
    }  
}  

// Car subclass  
class Car extends Vehicle {  
    int noOfDoors;  
    int seatingCapacity;  
    Car(String brand, int speed, int noOfDoors, int seatingCapacity) {  
        super(brand, speed);  
        this.noOfDoors = noOfDoors;  
        this.seatingCapacity = seatingCapacity;  
    }  
    @Override  
    void displayDetails() {  
        super.displayDetails();  
        System.out.println("Number of Doors: " + noOfDoors);  
        System.out.println("Seating Capacity: " + seatingCapacity); 
    }  
}  

// Bike subclass  
class Bike extends Vehicle {  
    boolean hasGears;  
    Bike(String brand, int speed, boolean hasGears) {  
        super(brand, speed);  
        this.hasGears = hasGears;  
    }  
    @Override  
    void displayDetails() {  
        super.displayDetails();  
        System.out.println("Has Gears: " + (hasGears ? "Yes" : "No"));  
    }  
}  

// Truck subclass  
class Truck extends Vehicle {  
    double capacity;  
    Truck(String brand, int speed, double capacity) {  
        super(brand, speed);  
        this.capacity = capacity;  
    }  
    void showTruckDetails() {  
        System.out.println("Truck Capacity: " + capacity + " tons"); 
    }  
    @Override  
    void displayDetails() {  
        super.displayDetails();  
        showTruckDetails();  
    }  
}  

// Main class  
public class VehicleRentalSystem {  
    public static void main(String[] args) {  
        Car car = new Car("Toyota", 180, 4, 5);  
        Bike bike = new Bike("Yamaha", 120, true);  
        Truck truck = new Truck("Volvo", 100, 10);  
        
        System.out.println("Car Details:");  
        car.displayDetails();  
        car.startVehicle();  
        System.out.println();  
        
        System.out.println("Bike Details:");  
        bike.displayDetails();  
        bike.startVehicle();  
        System.out.println();  
        
        System.out.println("Truck Details:");  
        truck.displayDetails();  
        truck.startVehicle();
    }
}