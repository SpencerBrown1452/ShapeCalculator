/*File: Torus.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a torus (donut)
 */

import java.lang.Math.*;

/**
 *This class creates a torus with a user specified minor and major radius, then calculates the volume of the torus
 */
public class Torus extends ThreeDimensionalShape{
    //Variable Declaration
    private double volume = 0;
    private double minorRadius = 0;
    private double majorRadius = 0;

    /**
     * Default constructor, creates a torus with all values set to 0
     */
    public Torus(){
    }//end default constructor

    /**
     * Creates a torus with a user defines minor and major radius, then calculates the volume
     * @param minorRadius
     * @param majorRadius
     */
    public Torus(double minorRadius, double majorRadius){
        this.minorRadius = minorRadius;
        this.majorRadius = majorRadius;
        this.volume = (Math.PI * (minorRadius * minorRadius)) * (2 * Math.PI * majorRadius);
    }//end parameterized constructor

    /**
     * Returns the minor radius
     * @return minorRadius
     */
    public double getMinorRadius(){
        return this.minorRadius;
    }//end getMinRadius method

    /**
     * Returns the major radius
     * @return majorRadius
     */
    public double getMajorRadius(){
        return this.majorRadius;
    }//end getMajorRadius method

    /**
     * Returns the volume of the torus
     * @return volume
     */
    public double getVolume(){
        return this.volume;
    }//end getVolume method
}//end Torus class
