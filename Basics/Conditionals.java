import java.util.Scanner;
public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //check age over 18
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your name ");
        String name = sc.nextLine();

        //IF ELSE condition:
        if(age>=18){
            System.out.println("You can vote with age "+age+" "+name);
        }
        
        else {
            System.out.println("You cannot vote with age "+age+" "+name);
        }

        //IF ELSE IF condition
        /*Given the marks of a student, tell us the grade he is getting followin
        Grade A (>=90)
        Grade B (>=70 and 90)
        Grade C (>= 50 and < 70)-
        Grade D (>=35 and < 50)
        Fail (< 35) */
        System.out.println("Enter your grade");
        int grade = sc.nextInt();

        if(grade >= 90){
            System.out.println("you got A grade");
        }
        else if(grade >=70 ){ //!!!  no need -- else if(grade >=70 || grade ==90) cause the above if has >= not > 
            System.out.println("you got B grade");
        }
        else if(grade >=50 ){
            System.out.println("you got C grade");
        }
        else if(grade >=35 ){
            System.out.println("you got D grade");
        }
        else{
            System.out.println("You Failed ");
        }
        

        sc.close();

      int a = 4;
      switch(a){
        case 2:
           System.out.println("num is 2");
           break;
        case 4:
           System.out.println("num is 4");
           break;
        default:
           System.out.println("no match");
      }
    }
}
