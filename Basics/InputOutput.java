
import java.util.Scanner; //class import 

public class InputOutput {
    public static void main(String[] args){
        //create a object of class scanner to access its functions
        Scanner sc = new Scanner(System.in) ;
        //gets int input using inbuilt functions
        int num = sc.nextInt();
        System.out.println(num);
        sc.nextLine(); // Consume the leftover newline
        String name = sc.nextLine();
        System.out.println(name);

        String firstname = sc.next();
        String lastname = sc.next(); // gets input between spaces
        // input = ronaldo p --> firstname = ronaldo , lastname = p
        System.out.println(firstname + " " + lastname);
        // free out memeory of class --> scanner close
        sc.close();

    }
}
