package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Range range = new Range(-10000, 10000);

        int MIN_RAND_VALUE = -20000;
        int MAX_RAND_VALUE = 20000;
        int countLess=0;
        int countMore=0;
        int countInRange=0;
        int sumLess=0;
        int sumMore=0;
        int sumInRange=0;

        int [] array = new int[6000];
        for (int i=0; i<array.length; i++){
            array[i]=(int)(Math.random()*40000)-20000;
            try {
                range.checkInRange(array[i]);
                countInRange++;
                sumInRange+=array[i];
            }
            catch (LessThanMinEx ex){
                countLess++;
                sumLess+=array[i];

            }
            catch (MoreThanMaxEx ex1){
                countMore++;
                sumMore+=array[i];
            }
        }
        try {
            System.out.println("AvInRange="+sumInRange/countInRange+" AvMore="+sumMore/countMore+" AvLess="+sumLess/countLess);
        }
        catch (Exception ex2)
        {
            System.out.print("NullPointEx???? RLY??");
        }



    }
}
