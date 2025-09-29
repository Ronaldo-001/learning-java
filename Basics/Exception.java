public class Exception {
    public static void main(String[] args) {
        try{
            int num = 10;
            int a =0;
            int ans = num/a; //10/0 - arithmetic exception error
            System.out.println(ans);
        }
        catch(ArithmeticException ex){
            System.out.println(ex);
         }
         //catch(Exception e){
         //   System.out.println(e);
        // }
        finally{
            System.out.println("I am always executed!!");
        }
    }
}
