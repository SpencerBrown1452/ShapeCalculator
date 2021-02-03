/*File: ThreeDimensionalShape.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To act as a superclass for Three Dimensional Shapes
 */

/**
 * Three Dimensional Shape superclass, acts as the parent for all three dimensional shapes
 */
public class ThreeDimensionalShape extends Shape{
    //Variable Declarations
    private double volume;
    private int numDimensions = 3;

    //Default method to return volume
    public double getVolume(){
        return this.volume;
    }//end getVolume Method
}//end ThreeDimensionalShape class
