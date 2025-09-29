class Helloworld   //class name same as file anme (Case sensitive)
{
    public static void main(String []args)  // public - access specifier , static- helps to call the function without creating an object ,
    {                                     // void - no return , main -- entrypoint function of java code  , direct call is like  (helloworld.main),
                                           //String []args -- > used to store command line argument when compiling the program on need ( String datatype)
        System.out.println("My First Java Program."); 
        //System.out is a prebuilt io library in java inside that we are calling println fn inside "System" library to print the output argument
    }            //Helloworld.main --> like this to refernce entry point (object) without static   
};