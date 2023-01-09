package ICE2;

public class BankApplication {
    public static void main(String[] args) {
        BankAccount accountOne = new BankAccount(500.00);
        BankAccount accountTwo = new BankAccount(1200.00);

        System.out.println("After depositing $200 in accountOne");
        accountOne.deposit(200.00);
        System.out.println("Balance in accountOne: $" + accountOne.getBalance());

        System.out.println("After withdrawing of $250 from accountTwo");
        accountTwo.withdraw(250.00);
        System.out.println("Balance in accountTwo: $" + accountTwo.getBalance());

        System.out.println("After transferring $120 from accountOne into accountTwo");
        accountOne.transfer(120.00, accountTwo);
        System.out.println("Balance in accountOne: $" + accountOne.getBalance());
        System.out.println("Balance in accountTwo: $" + accountTwo.getBalance());

        System.out.println("Withdrawing $600 from accountOne, successful? " + accountOne.withdraw(600.00));



    }
}
