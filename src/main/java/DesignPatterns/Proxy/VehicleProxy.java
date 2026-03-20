package DesignPatterns.Proxy;

public class VehicleProxy implements Vehicle {

    private int count;
    private int threashold=3;
    private Car vehicle;

    public VehicleProxy(Car vehicle){
        this.vehicle = vehicle;
    }

    @Override
    public void drive(){

        if(count < threashold){
            System.out.println("Checking Tyre air pressue");
            vehicle.drive();
            System.out.println("Vehicle locked");
            count++;
        }else {
            System.out.println("Threshold reached for the day. come tomorrow to drive again");
        }

    }
}
