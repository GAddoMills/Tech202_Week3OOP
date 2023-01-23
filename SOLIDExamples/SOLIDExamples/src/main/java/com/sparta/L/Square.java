package com.sparta.L;

import com.sparta.O.Rectangle;

public class Square extends Rectangle {
    private double length;

    public Square(double length){
        this.length = length;
//        setLengthAndWidth(length);
    }

    /**
     * Currently we could not run a areaCalculate method on a Square object
     * We should be able to substitute a Square (sub class) for a Rectangle (base class)
     * Below is the code we add to fix this and hence abide by the L of SOLID.
     * Also uncomment line 10:         setLengthAndWidth(length);
     *
     * run the starter
     */

    public void setLengthAndWidth(double length){
        super.setLength(length);
        super.setWidth(length);
    }
}
