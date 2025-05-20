class SavingsAccount extends BankAccount{
    String customerContact;

    SavingsAccount(String accountNumber ,String accountHolderName , double balance , String customerContact){
        super(accountNumber,accountHolderName,balance);
        this.customerContact = customerContact;
    }

    public void displaySavingsAccount(){
        System.out.println("Account number : "+accountNumber);
        System.out.println("Account holder name : "+accountHolderName);
        System.out.println("Available balance : "+getbalance());
        System.out.println("Customer Contact number : "+customerContact);
    }
}

