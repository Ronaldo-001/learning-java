class Basics
{
    public static void main(String []args)
    {

        // single line comment
      //  System.out.println("My First Java Program.");
        /*
         This is a 
         multiline comment
         */


//Data Types:
         // byte -128 to 127 (8 bits in memory space)
         //int/byte/char variable;
         byte a = 100;
         System.out.println(a);
         //short 16bits -32,768 to 32767
         short b = 100;
         System.out.println(b);
         //int -2^31 to 2^31 - 1 (32 bits)
         int c = 100;
         System.out.println(c);
         //long -2^63 to 2^63 - 1 (64 bits)
         long d = 1000;
         System.out.println(d);
         //float 6-7 deciaml places (32 bits)
         float e = 5.64f;
         System.out.println(e);
         //double (64 bits)
         double f = 5.64332;
         System.out.println(f);

         //char -- single quote important
         char alphabet = 'a';
         System.out.println(alphabet);
         // creating Java string using new keyword
        String str = new String("String Class!");

        System.out.println(str);
         
         //boolean -- true or false
         boolean fl = true;
         System.out.println(fl);

//Arithmetic Operators: +,-,*,%

          int num1 = 10;
          int num2 = 3;
          int sum = num1 + num2;
          int sub = num1 - num2;
          int mul = num1 * num2;
          int remainder = num1 % num2;
          double div = num1/num2; //(typecast)
          System.out.println(sum);
          System.out.println(sub);
          System.out.println(mul);
          System.out.println(div);
          System.out.println(remainder);

          //not operator !
          boolean stat1 = true;
          boolean stat2 = !stat1; //change !
          System.out.println(stat2);

//Unary operators 
          //++, -- 
          //++num(preincrement) num++(postincrement)

          int digit1 = 6;
          int digit2 = digit1++; //digit 2 is 6 ,but increment digit 1 post this operation - assign
          int digit3 = ++digit1; //increment and assign
          System.out.println("digit 1 is "+ digit1); //here 8 cause increment by both digit 2 and 3
          System.out.println("digit 2 is "+ digit2); //still 6 cause after this its incremented
          System.out.println("digit 3 is "+ digit3); 

//Relational Operators
            // == , >= , <= , < , > , !=
            int number1 = 6;
            int number2 = 10;
            boolean result = number1 == number2; //< or > check
            System.out.println(result);

//Logical Operators (&&, || )
            boolean first = true;
            boolean second = false;
            boolean answer1 = first && second; //both should be true --> true
            boolean answer2 = first || second; //anyone truw --> true
            System.out.println("answer of and is " +answer1);
            System.out.println("answer of or is " +answer2);

//Assignment Operators (+= , -=, *= , %= , /=)
            int sample = 1;
            sample += 1; //can be any operator
            System.out.println(sample);

//Ternary Operator
          // condition ? first :second
           int t1 = 6;
           int t2 = 9;
           int t3 =  t1>t2 ? t1 : t2; // 6 >9 ??
            System.out.println("Greater num is " +t3);

// --Strings ( in java string are immutable) cannot change them = if change then it is at new memory
 
      String my_name = "ronaldo";
      System.out.print(my_name);
      // string length
      System.out.println(my_name + " has length: " + my_name.length());
      // get specific element
      System.out.println(my_name.charAt(0));
      // get sub string first: last or first to all or all to last
      System.out.println(my_name.substring(2, 4));
      //concat 
      String last_name = "P";
      System.out.println(my_name +" "+ last_name);
      // string check -- boolean output 
      System.out.println(my_name.equals(last_name));
      // result = my_name == last_name
      
    

//typecast - implicit (internal)
   byte x = 10;
   int y = x;
   System.out.println(y);

   //Explicit (external)
   double dx= 10.3232;
   int i = (int) dx;
   System.out.println(i);




//constants - final

   final int target = 10;
   //num = 15 !! not works
   System.out.println(target);
   
   

    }


};