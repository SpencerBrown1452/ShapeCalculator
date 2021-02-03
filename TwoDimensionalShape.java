/*File: TwoDimensionalShape.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To act as a superclass for Two Dimensional Shapes
 */

/**
 * Two Dimensional Shape superclass, acts as the parent for all two dimensional shapes
 */
public class TwoDimensionalShape extends Shape{
    //Default variables for all two dimensional shapes
    private double area;
    private int numDimensions = 2;

    //Default method to return the area
    public double getArea(){
        return area;
    }//end get area method
}//end TwoDimensionalShape class
