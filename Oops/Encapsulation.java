class Bank{
    private double balance; // encpasulate the variable
    //the variable is not accessed by the object directly 
    //it is modified by the method of the class (which has logic inside it) where it is present
    public Bank(double balance){
        this.balance = balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public void printBalance(){
        System.out.println(balance);
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        Bank bank = new Bank(100.00);
        bank.setBalance(69.99); // the balance is modified by the method (encapsulation)
        bank.printBalance();
        
    }
}
