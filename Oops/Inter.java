//Interface class with parameter example
interface Animal{
    void bark();
    /*
     Before Java 8, interfaces could only have abstract methods—no code allowed. This meant that if you added a new method to an interface, all implementing classes would break unless they implemented the new method.
      So, Java 8 introduced default methods to:
     Allow interfaces to evolve without breaking existing implementations.
      Provide default behavior that implementing classes can override if they want.
     */
    //default means it is the default value of the method when it is called
    default void sleep(){ // if its static i can access it directly --> Animal.sleep()
        System.out.println("Sleeping----");
    }
    //Abstract methods vs default
    //Abstract = must implement; default = optional to override
}

interface Pet{
    void ownerName(String name);
}

class Dog implements Animal,Pet{
    public void bark(){
        System.out.println("Dog is barking!!");
    }
    public void ownerName(String name){
        System.out.println(name);
    }
    
    @Override
    public void sleep(){
         System.out.println("Dog is sleeping!!!");
         //super.sleep() --only possible in abs class not interface
         //if i need to call the default method of interface it has to be static or its possible by object like Dog.sleep or i should override it to use it
      }
}

class Cat implements Animal{
    public void bark(){
        System.out.println("Cat is meowing!!");
    }

}
public class Inter {
    public static void main(String[] args) {
        // Animal.sleep() -- i cannot access it unless it is static
        Dog dog = new Dog();
        dog.bark();
        dog.sleep();
        dog.ownerName("TYson");
        
        Cat cat = new Cat();
        cat.bark();
        cat.sleep(); // calling the default method of the interface through the instance of class cat (implicit)
    }
}
