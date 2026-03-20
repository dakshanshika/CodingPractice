package DesignPatterns.StratergyDP;

public class Vehicle {

    private DriveStratergy obj;
    public Vehicle(){
        System.out.println("from Vehicle default constructor");
    }

    public Vehicle(DriveStratergy driveStratergy){
        this.obj = driveStratergy;
    }

    public void drive(){
       obj.drive();
    }
}
