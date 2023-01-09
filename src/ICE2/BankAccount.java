package ICE2;

public class BankAccount {
    private double balance = 500;

    public BankAccount(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if (this.balance - amount < 0){
            return false;
        }
        this.balance -= amount;
        return true;
    }

    public boolean transfer(double amount, BankAccount otherAccount){
        if (withdraw(amount)){
            otherAccount.deposit(amount);
            return true;
        }
        return false;
    }
}
