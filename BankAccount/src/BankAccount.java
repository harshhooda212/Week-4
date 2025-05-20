class BankAccount{
    public String accountNumber;
    protected String accountHolderName;
    private double balance;

    BankAccount(String accountNumber,String accountHolderName,double balance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public double getbalance(){
        return balance;
    }

    public void setbalance(double newBalance){
        this.balance = newBalance;

        if(newBalance<=0){
            System.out.println("Insufficient Balance");
        }
        else{
            System.out.println("Sufficient Balance");
        }
    }
    void displayBankAccount(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Account holder name : "+accountHolderName);
        System.out.println("Available balance : "+balance);
    }
}
