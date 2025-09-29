import java.util.*;

public class Loops {
    public static void main(String[] args) {
        //for loop
       // for(initialisation;condition;increment/decrement){}
       for(int i=1;i<=10;i++){
        System.out.println("hi" + i);
       }
       //multiple of 2
       for(int i =2;i<=12;i+=2){
          System.out.println((i));
       }
        //array input
        Scanner sc = new Scanner(System.in);
        System.out.println("enter array count");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
       }
       //for each loop
       for(int i : arr){
        System.out.println(i);
       }
       
       //while loop while(true) -- runs until true
       int num = 0;
       while(num<=10){
        System.out.println(num);
        num+=2;
       }

       //do while - run loop once w/o condition check at first
       //example - keep taking input till the user enters positive number
       System.out.println("enter a positive number");
       int number;
       do{
         number = sc.nextInt();
         if(number == 10){
            break;
         }
       }while(true);
       System.out.println(number);
       sc.close();
       
    }
}
