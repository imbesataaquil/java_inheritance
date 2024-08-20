package Vehicle;

public class Vehicle {
    String make;
    String model;
    int year;
    int maximumSpeed;

  Vehicle(String make,String model,int year,int maximumSpeed) {
      this.make=make;
      this.model=model;
      this.year=year;
      this.maximumSpeed=maximumSpeed;
    }

    void drive(){
        System.out.println("vehicle is driving");
    }
}
class Car extends Vehicle{
    Car(String make,String model,int year,int maximumSpeed) {
        super(make, model, year, maximumSpeed);
    }
        void drive(){
            System.out.println(make + " " + model + " Car is driving");
        }

}
class Bike extends Vehicle{
    Bike(String make,String model,int year,int maximumSpeed){
        super(make, model, year, maximumSpeed);
    }
    void drive(){
        System.out.println(make + " " + model + " Bike is driving");
    }
}
class Main{
    public static void main(String[] args) {
        Car c = new Car("BMW","TH345",2022,150);
        Bike b = new Bike("TVS","AC34B",2024,100);
        System.out.println("Detail of car : make "+c.make+" ,model "+c.model+ " ,year "+c.year+" ,maximumspeed "+c.maximumSpeed);
        System.out.println("Detail of bike : make "+b.make+" ,model "+b.model+" ,year "+b.year+" ,maximumspeed "+b.maximumSpeed);
        c.drive();
        b.drive();
    }
}
