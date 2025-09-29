public class Arrays {
    public static void main(String args[]){

//array - single datatype collection of elements

    //type 1
    int[] numbers = new int[10]; // starts from 0 
    // 5 objects created for array
    numbers[0] = 1;
    numbers[1] = 2;

    // !! RUNTIME error - out of index
    
    //print specific element of array
    System.out.println("Array element is " + numbers[1]);
    System.out.println(numbers[0]);

    //length of array
    System.out.println("Array length is" + numbers.length);
    
    //for loop - iterate array

    //2D array
    int [][] arr = {{6,5},{2,3,4},{1,6,4},{2,3,4}};
     int[] ZeroIndex = arr[0];// {6,5}
     System.out.println(ZeroIndex[1]);//5
     //or easy - straight
     System.out.println(arr[0][1]);//5

     



    }
}
