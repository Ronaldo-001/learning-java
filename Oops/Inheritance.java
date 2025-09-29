//Base Class
class Vehicle{
    String vehicleNumber;
    public Vehicle(String vehicleNumber){
            this.vehicleNumber = vehicleNumber;
    }
    public void honk(){
        System.out.println("HONk!!!!!!!!!!!!");
    }
    public void printVehicleNumber(){
        System.out.println(vehicleNumber);
    }
}
class Car extends Vehicle{
    
    public Car(String s){
        // this.carNumber = s;
         //this.carNumber = carNumber - but here you must use this to distinguish between the parameter and the instance variable.
         //or only condition is the rhs should always a string no eror in changing name of variables
         super(s); // the base class constructor is called and the parameter is passed when the object is created for the Car class
    }

    @Override public void honk(){
        System.out.println("Leave me way - car");
    }
    
}

class Bus extends Vehicle{
    public Bus(String vehicleNumber){
         super(vehicleNumber);  // Call the constructor of the base class with parameter 'vehicleNumber'

    }
    @Override public void honk(){
        System.out.println("Leave me a large way - bus");
    }
}


public class Inheritance {
    public static void main(String[] args) {
      Car honda = new Car("TN3456");  //when the derived class object is declared automatically for base class Vehicle ,the constructor is implicitly created or with explicitly using super() 
      Bus obj = new Bus("TN014111");
      honda.printVehicleNumber(); //access the method of the base class using the derived class object
      obj.printVehicleNumber();//access the method of the base class using the derived class object
      honda.honk(); //call the overriden method
      obj.honk(); //call the overriden method
    }
    
}

/*
 if there is something like - Bus extends Vehicle through Car class then:
     -->
✅ Constructor Chain:

When a Bus object is created, its constructor calls the Car constructor using super(), and the Car constructor then calls the Vehicle constructor.
Each class only calls its immediate superclass's constructor — not the grandparent directly.
So, Bus → Car → Vehicle is the constructor call chain.

✅ Method Call (printVehicleNumber):

The method printVehicleNumber() is defined only in Vehicle, and since Car and Bus don’t override it, the version from Vehicle is used.
Java looks up the inheritance chain and runs the first matching method it finds.
So, calling it on a Car or Bus object runs the method from Vehicle. 
 */