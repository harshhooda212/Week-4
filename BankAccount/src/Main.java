
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