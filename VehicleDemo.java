
 class Vehicle {
 String name;
 public Vehicle(String name)
 {
     this.name = name;
 }
 public void displayInfo()
 { 
    System.out.println("Vehicle: " + name); 
}
 }
 
 class Car extends Vehicle {
 int wheels = 4;
 String fuel;
 public Car(String name, String fuel){
    super(name); this.fuel = fuel;
 }
 @Override
 public void displayInfo(){
 System.out.println("Car: " + name + ", Wheels: " + wheels + ", Fuel: " + fuel);
 }
 }
 class Bike extends Vehicle {
 int wheels = 2;
 String fuel;
 public Bike(String name, String fuel)
 { 
    super(name); this.fuel = fuel; 
}
 @Override
 public void displayInfo(){
 System.out.println("Bike: " + name + ", Wheels: " + wheels + ", Fuel: " + fuel);
 }
}
 public class VehicleDemo {
 public static void main(String[] args){
 Vehicle[] arr = { new Car("Honda City","Petrol"), new Bike("Royal Enfield","Diesel") };
 for(Vehicle v: arr) v.displayInfo();
 }
 }
