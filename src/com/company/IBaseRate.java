package com.company;

public interface IBaseRate {

    // method for return base rate
    default double getBaseRate() {
        return 2.5;
    }
}
