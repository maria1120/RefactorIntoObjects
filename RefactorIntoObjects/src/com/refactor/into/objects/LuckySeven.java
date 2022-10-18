package com.refactor.into.objects;

import java.util.Random;

public class LuckySeven {


   //get random number for dice
    private int getRandomNumber(){
        Random random = new Random();
        int min = 1;
        int max = 6;
        int range = (max-min) + min;
        return (int) ((Math.random() * range));

    }

    // check the sum of dices

    public int getSumOfDices (){
        int result1 = getRandomNumber();
        //display the result of the dice
        int result2 = getRandomNumber();


        return result1 + result2;
    }

    // check if the user wins
    public boolean userWin (){
        return getSumOfDices() == 7;
    }
}
