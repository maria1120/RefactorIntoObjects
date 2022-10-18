package com.refactor.into.objects;

public class InterestCalculator {



    //to calculate interest rate and final amount
    public void calculateInterest(double currentAmount, double interestRate, int numberOfYears) {

        double newAmount;

        for (int i = 1; i <= numberOfYears; i++) {
            newAmount = currentAmount * (interestRate / 100);
            currentAmount = currentAmount + newAmount;

            System.out.println("John's interest after " + i + " year: " + newAmount);
            System.out.println("Total for the year: " + currentAmount);


        }
    }
}




