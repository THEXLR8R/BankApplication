package com.company;

public class Checking  extends Account {

    // list props  specific to a checking acc
    int debitCardNumber;
    int debitCardPin;


    // constructor to initialize checking acc  properties
    public Checking(String name, String sSN, double initDeposit) {
        super(name, sSN, initDeposit);
        accountNumber = "2" + accountNumber;
        setDebitCard();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() * .15;
    }
    // list any methonds specific to the checking acc

    private void setDebitCard(){
        debitCardNumber = (int) (Math.random() * Math.pow(10,12));
        debitCardPin = (int) (Math.random() * Math.pow(10,4));

    }

    public void showInfo() {
        super.showInfo();
        System.out.println("Your Checking Account Features " +
                "\nDebit Card Number: " + debitCardNumber +
                "\nDebit Card PIN: " + debitCardPin
        );
    }
}
