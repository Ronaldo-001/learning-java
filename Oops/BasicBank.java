//Example of constructors

class BankAccount {
    double balance;
    String accountType;

    public BankAccount(double balance) {
        /*
         * balance on the right-hand side is the constructor parameter.
           this.balance on the left-hand side is the instance variable (also called a field or member variable) of the object.
           This line assigns the value of the constructor parameter balance to the instance variable balance
         */
    this.balance = balance; //assigning the parameter of the method to the instance's variable "balance: 
    this.accountType = "Savings";
  }

    public BankAccount (double _balance, String _accountType) {
        balance = _balance;
        accountType = _accountType;
   }
        public void printBalance() {
            System.out.println(balance);
    }

    public void printAccountType() {
        System.out.println(accountType);
    }
}

class BasicBank {
        public static void main(String[] args) {
        BankAccount accountPerson1 = new BankAccount(200.0);
        accountPerson1.printBalance();
        accountPerson1.printAccountType();
        BankAccount accountPerson2 = new BankAccount(10000.0, "Current");
        accountPerson2.printBalance();
        accountPerson2.printAccountType();
}
}   