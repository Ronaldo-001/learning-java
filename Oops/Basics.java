

//access specifiers -- available everywhere
// private -- only accessible to current class
//protected -- only accessible in current package/subpackages
//default in java -- package private -- only access within package

//Basics.main -- > direct access like this due to word static
//main fn -- the entry point of the program

class Test{
    public static void printTest(){
        System.out.println("Hello by other test class!!");
    }
    public void printHi(){
        System.out.println("Hi from non static member function!!");
    }

    int age; 
    public void assignAge(int num){
         age = num;
    }
}

class Basics{
    public static void main(String[] args) {
       Test.printTest(); // direct access of Test class fn due to static

       //then how to access non static members??
       //by creating objects
       Test obj1 = new Test();
       obj1.printTest();
       obj1.printHi();
       //same goes or Scanner class -- we create object for the public class Scanner
        Test obj2 = new Test();
        obj1.assignAge(10);
        obj2.assignAge(20);

        //access the data member of the class using objects
        //multiple instances of the class can be formed using objects -- isolated from each other
        System.out.println(obj1.age); // 10 - instance 1 of class
        System.out.println(obj2.age); //20 - instance 2 of the class

        // If you make numReturn() non-static, you must first create an object: or  
        // If you want to call it directly inside main without creating an object, then it must be static

        //so all the non static methods belong to the object of the class
        // all the static methods belong to the class itself
        System.out.println(numReturn());

        //call the stringReturn parameterised method
        System.out.println(stringReturn("Wassup!!!  from stringReturn Method", 3));
    }

    public static int numReturn(){
        return 110;
    }

    public static String stringReturn(String s , int n){
        return s;
    }
       
    
}