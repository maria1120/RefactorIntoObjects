package com.refactor.into.objects;

import java.util.Scanner;

public class App {

    static int number =25;
   static Scanner input = new Scanner(System.in);


    public static void main(String[] args) {
    System.out.println("How many games you would like ti play?");
    int numberOfGames = input.nextInt();
    System.out.println("How much money you will start with?");
    int money = input.nextInt();

    playLuckySeven(numberOfGames, money);

    }

    // play Lucky Seven
    public static void playLuckySeven(int numberOfGames, int money){{

        while(numberOfGames>0 ) {
            LuckySeven game = new LuckySeven();

                int sum = game.getSumOfDices();
                System.out.println("The sum of dices: " + sum);

                if (game.userWin()) {
                    money += 7;
                    System.out.println("The sum is 7! You won £7");
                } else {
                    money--;
                    if(money ==0){
                        numberOfGames=0;
                    }

                }
                numberOfGames--;
            }

        }

    }



//calculate interest
    public void calculateInterest(){
        System.out.println("Please enter the principal");
        double amount = input.nextDouble();

        System.out.println("Please enter the number of years");
        int numberOfYears = input.nextInt();

        System.out.println("Please enter interest rate");
        double interestRate = input.nextDouble();

        InterestCalculator calculator = new InterestCalculator();
        calculator.calculateInterest(amount, interestRate, numberOfYears);
    }


    // calling Factorize class and use its methods
    public static void factorize(int num){
        Factorizer factorizer = new Factorizer();

        System.out.println("The number: " + number);
        factorizer.checkForFactors(number);
        System.out.println();
        System.out.println("Is it perfect number: " + factorizer.isPerfectNumber(number));
        System.out.println("Is it prime number: " + factorizer.isPrimeNumber(number));
    }






    }


