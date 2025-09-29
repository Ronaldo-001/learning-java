class Sample{
      //default constructor
      public Sample(){
        System.out.println("I am a default constructor !! of test class");
      }
      //parameterised constructor
      public Sample(String s){
          System.out.println("I am a parameterised constructor " + s);
      }
      //multiple paramter constructor
      public Sample(String s, int b){
          System.out.println("I am a multiple parameterised constructor " + s + "with " + b + " parameters");
      }

      public void printStatement(){
        System.out.println("Hello from printStatement method!!");
      }
}


public class Constructor {
    public static void main(String[] args) {
        Sample sm = new Sample(); // default constructor is called here when the object is created for the class Test
        Sample sm2 = new Sample("from obj 2"); // paramterised constructor is called for another object sm2
        Sample sm3 = new Sample("from obj 3 ",2);//multiple parameter constructor is called as obj3 sm3
        sm.printStatement(); // access the normal method using the class object
    }
}
