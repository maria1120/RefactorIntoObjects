package com.refactor.into.objects;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Factorizer {

   ArrayList<Integer> myList = new ArrayList<>();
    int count = 0;

    // check the factors
    public void checkForFactors(int num) {

        for (int i = num-1; i > 0; i--) {

            if (num % i == 0) {
                myList.add(i);
            }
        }
       displayFactors(myList);

    }


    //print factors
    public void displayFactors(ArrayList myList){
        System.out.println("The factor/s :");
        for (int i=0; i< myList.size(); i++) {

            System.out.print(myList.get(i) + " ");
        }
    }

    // check if the number is perfect
    public boolean isPerfectNumber(int num){
        int sum = 0;

        for (Integer integer : myList) {

            sum = sum + integer;
        }
        return sum==num;
    }


    // check if the number is prime
    public boolean isPrimeNumber(int num){
        count = myList.size();
        for(int i= myList.size(); i<=0; i--){
            if(myList.get(i) % myList.get(i-1)==0){
                count--;
            }

        }
        return (count <=2);
    }



}
