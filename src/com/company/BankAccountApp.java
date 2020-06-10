package com.company;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

    public static void main(String[] args) {

        List<Account> accounts = new LinkedList<Account>();

        String file = "C:\\Users\\pc\\Desktop\\NewBankAccounts.csv";

        // read a CSV file then create new acc based on the data

        List<String[]> newAccountHolders = utilities.CSV.read(file);
        for (String[] accountHolders : newAccountHolders) {
            String name = accountHolders[0];
            String sSN = accountHolders[1];
            String accoutType = accountHolders[2];
            double initDeposit = Double.parseDouble(accountHolders[3]);
            System.out.println(name + " " + sSN + " " + accoutType + " $" + initDeposit);
            if (accoutType.equals("Savings")) {
                System.out.println("Open a saving account");
                accounts.add(new Savings(name,sSN,initDeposit));
            } else if (accoutType.equals("Checking")) {
                System.out.println("Open a checking account");
                accounts.add(new Checking(name,sSN,initDeposit));
            } else {
                System.out.println("Error reading account type");
            }

            }
       // accounts.get(1).showInfo();
        for (Account acc : accounts) {
            System.out.println("\n*****************");
            acc.showInfo();
        }

    }

}
