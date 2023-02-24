class BankAccount{
    private int accountNumber, balance;

    public BankAccount(int accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void withdraw(int amount){
        balance-=amount;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "accountNumber=№" + accountNumber + ", balance=" + balance+"$";
    }
}

class CheckingAccount extends BankAccount{
    private int overdraftLimit;

    public CheckingAccount(int accountNumber, int balance,int overdraftLimit) {
        super(accountNumber, balance);
        this.overdraftLimit = overdraftLimit;
    }


    @Override
    public void withdraw(int amount) {
        if(getBalance() < amount){
            if(overdraft(amount)){
                System.out.println("OVERDRAFT BY "+(amount-getBalance()));
                super.withdraw(amount);
            }else {
                System.out.println("Declined");
            }
        }
    }

    public boolean overdraft(int amount){
        if(getBalance()-amount >= -overdraftLimit){
            return true;
        }
        return false;
    }


    @Override
    public String toString() {
        return super.toString()+", overdraftLimit: "+overdraftLimit+"$";
    }
    public String superToString(){
        return super.toString();
    }
}
public class Main {
    public static void main(String[] args) {
        CheckingAccount checkingAccount = new CheckingAccount(10021,100000,150000);
        System.out.println(checkingAccount);
        checkingAccount.withdraw(260000);
        System.out.println(checkingAccount);
        checkingAccount.withdraw(240000);
        System.out.println(checkingAccount);
        System.out.println(checkingAccount.superToString());
    }
}