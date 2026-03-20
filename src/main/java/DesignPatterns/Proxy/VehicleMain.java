package DesignPatterns.Proxy;

public class VehicleMain {

    public static void main(String[] args) {
         Vehicle vehicle= new VehicleProxy(new Car());
         vehicle.drive();
         vehicle.drive();
         vehicle.drive();
         vehicle.drive();


    }
}
