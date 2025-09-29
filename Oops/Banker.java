abstract class StateBankAccount{  // cannot create object for a abstract class
    double balance=1000.888;
    abstract void addMoney(double money);  // methods are written w/o definition or logic
    abstract void withdrawMoney(double money);
    //even if i initialise a method i cannot use it cause i cannot create object for the abstract class
    void updateBalance(double balance){  // but we can define inner methods for the logic in abstract class
        this.balance = balance;
    }
    double getBalance(){
        return balance;
    }
}

//to extend or inherit the abstract class
//the child class should also should be a abstract class
// or the methods in the abstract class should be redefined 
class SavingsAccount extends StateBankAccount{
    public void addMoney(double money){
          super.updateBalance(super.getBalance()+money);
    }
    public void withdrawMoney(double money){
            if(money <= super.getBalance()){
                System.out.println("You can Withdraw your savings account");
            }
            else{
                System.out.println("Insufficient Balance in savings account !!");
            }
    }
}

class CurrentAccount extends StateBankAccount{
     double minimumLimit = 1000.00;
    public void addMoney(double money){
          super.updateBalance(super.getBalance()+money);
    }
    public void withdrawMoney(double money){
            if(super.getBalance() - money >= minimumLimit){
                System.out.println("You can Withdraw your current account");
            }
            else{
                System.out.println("Insufficient Balance in current account!!");
            }
    }
}

public class Banker {
    public static void main(String[] args) {
        SavingsAccount demo = new SavingsAccount();
        demo.addMoney(100.000);
        demo.withdrawMoney(20);
        System.out.println(demo.getBalance()); //access the abstract class method using derived class

        CurrentAccount gbu = new CurrentAccount(); //new obj instance so balanbce is set to 1000.888
        gbu.addMoney(1000);
        gbu.withdrawMoney(30.00);
    }
}

/*
 *so here on abstract class i declared the function with 0 parameters 
  and in the derived classes i redefined the function of abt class based on the requirements
 */