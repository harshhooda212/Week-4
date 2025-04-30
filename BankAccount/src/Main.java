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

public class Main{
    public static void main(String[] args){

        BankAccount acc1 = new BankAccount("1769583420","Naman",600000);
        acc1.displayBankAccount();
        acc1.setbalance(50000);
        acc1.displayBankAccount();

        System.out.println("-------------------------");

        SavingsAccount savAcc1 = new SavingsAccount("1752364821","Rupesh",1000000,"8282728296");
        savAcc1.displaySavingsAccount();

    }
}