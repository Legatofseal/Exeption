package com.company;

/**
 * Created by Legat on 5/29/2016.
 */
public class Range {

    private int MAX_RANGE;
    private int MIN_RANGE;

    public Range(int MIN_RANGE, int MAX_RANGE) {
        this.MAX_RANGE = MAX_RANGE;
        this.MIN_RANGE = MIN_RANGE;
    }

    public  void checkInRange(int number) throws MoreThanMaxEx, LessThanMinEx {
        if (number>MAX_RANGE){
            throw new MoreThanMaxEx();
        }
        if (number<MIN_RANGE){
            throw new LessThanMinEx();
        }

   }
}
