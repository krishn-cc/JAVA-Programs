abstract class Vehicle {
    abstract void start();
    void stop() {
        System.out.println("Vehicle stopped.");
    }
}
 class Car extends Vehicle{
    void start(){
        System.out.println("Car started.");
    }
}

class Bus{
    void start(){
        System.out.println("Bus started.");
    }
}
public class Abstraction1{
    public static void main(String[] args) {
Car c = new Car( );
Bus b = new Bus();
        c.start();
        c.stop();
        b.start();
        //b.stop();        
        
        
    }
}


