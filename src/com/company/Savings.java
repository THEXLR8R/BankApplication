package com.company;

public class Savings extends Account {


    // list properties specific  for  saving acc
    int safetyDepositBoxID;
    int safetyDepositBoxKey;

    // constr to initialize saving acc properties
    public Savings(String name, String sSN, double initDeposit){
        super(name, sSN, initDeposit);
        accountNumber = "1" + accountNumber;
        System.out.println("Account Number " + this.accountNumber);
        System.out.println("New Saving Account");
        setSafetyDepositBox();
    }
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }

    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10,3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10,4));
    }


    // list any methonds specific to the saving acc
    public void showInfo() {
        System.out.println("Account type: Saving");
        super.showInfo();
        System.out.println("Your Saving Account Features" +
                "\n Safety Deposite Box ID:" + safetyDepositBoxID +
                "\n Safety Deposite Box Key: " + safetyDepositBoxKey
        );
    }

}
