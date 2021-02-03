/*File: Cone.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a cone
 */

import java.lang.Math.*;

/**
 * This class creates a cone with a user specified radius and height, and calculates the volume of the cone
 */
public class Cone extends ThreeDimensionalShape{
    //Variable declaration
    private double volume = 0;
    private double radius = 0;
    private double base = 0;
    private double height = 0;

    /**
     * Default constructor, constructs a cone and sets all values to 0
     */
    public Cone(){
    }//end default constructor

    /**
     * Creates a cone with user define height and radius, then calculates its base size and volume
     * @param height
     * @param radius
     */
    public Cone(double height, double radius){
        this.height = height;
        this.radius = radius;
        this.base = 2 * radius;
        this.volume = Math.PI * (radius * radius) * (1.0/3.0 * height);
    }//end parameterized constructor

    /**
     * Returns the height of the cone
     * @return height
     */
    public double getHeight(){
        return this.height;
    }//end get height method

    /**
     * Returns the radius of the cone
     * @return radius
     */
    public double getRadius(){
        return this.radius;
    }//end getRadius method

    /**
     * Returns the base size of the cone
     * @return base
     */
    public double getBase(){
        return this.base;
    }//end getBase method

    /**
     * Returns the volume of the cone
     * @return volume
     */
    public double getVolume(){
        return this.volume;
    }//end getVolume method
}//end Cone class
