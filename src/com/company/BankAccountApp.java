package com.company;

public class BankAccountApp {

    public static void main(String[] args) {
	    Checking chkacc1 = new Checking("Tom Willson" , "213412345", 1500);

	    Savings saveacc1 = new Savings("Rich More", "133145971", 3000);

	    chkacc1.showInfo();
        System.out.println("*****************");
	    saveacc1.showInfo();

        // read a CSV file then create new acc based on the data
    }
}
