package com.company;

public abstract class Account implements IBaseRate {

    // list common props for savings and checkings acc
    private String name;
    private String sSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;


    // constr for set base
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        System.out.println("Name " + name + " SSN" + sSN + "Balance: $" + balance);

        // set acc number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    public void compound() {
        double accruedInterest = balance * (rate/100);
        System.out.println("Accrued Interest : " + accruedInterest);
    }

    // list common methods

    public void deposit (double amount) {
        balance = balance + amount;
        System.out.println("Depositing $" + amount);
        printBalance();
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        System.out.println("Withdrawing $ " + amount);
        printBalance();
    }

    public void transfer(String toWhere, double amount ) {
        balance = balance - amount;
        System.out.println("Transfering $" + amount + " to " + toWhere);
        printBalance();
    }

    public void printBalance() {
        System.out.println("Your balance is $ : " + balance);
    }

    public void showInfo() {
        System.out.println(
                "Name " + name +
                        "\nAccount Number: " + accountNumber +
                        "\nBalance " + balance +
                        "\nRate: " + rate + "%"
        );
    }
}
