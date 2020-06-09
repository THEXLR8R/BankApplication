package com.company;

public abstract class Account implements IBaseRate {

    // list common props for savings and checkings acc
    String name;
    String sSN;
    double balance;
    static int index = 10000;
    String accountNumber;
    double rate;


    // constr for set base
    public Account(String name, String sSN, double initDeposit) {
        this.name = name;
        this.sSN = sSN;
        System.out.println("Name " + name + " SSN" + sSN + "Balance: $" + balance);

        // set acc number
        index++;
        this.accountNumber = setAccountNumber();

    }

    public abstract void setRate();

    private String setAccountNumber() {
        String lastTwoOfSSN = sSN.substring(sSN.length()-2, sSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10,3));
        return lastTwoOfSSN + uniqueID + randomNumber;
    }

    // list common methods
    public void showInfo() {
        System.out.println(
                "Name" + name +
                        "\nAccount Number: " + accountNumber +
                        "\nBalance " + balance +
                        "\nRate: " + rate + "%"
        );
    }
}
