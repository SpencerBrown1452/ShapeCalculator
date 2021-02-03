/*File: Cylinder.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a cylinder
 */

import java.lang.Math.*;

/**
 * This class creates a cylinder with a user specified radius and height, and calculates the volume of the cylinder
 */
public class Cylinder extends ThreeDimensionalShape{
    //Variable declaration
    private double volume = 0;
    private double radius = 0;
    private double base = 0;
    private double height = 0;


    /**
     * Default constructor sets all values to 0
     */
    public Cylinder(){
    }//end default constructor

    /**
     * Parameterized constructor for cylinder that allows a user to specify the height and radius, then calculates
     * the volume of the cylinder
     * @param height Height of the cylinder
     * @param radius Radius of the cylinder
     */
    public Cylinder(double height, double radius){
        this.height = height;
        this.radius = radius;
        this.base = 2 * radius;
        this.volume = Math.PI * (radius * radius) * height;
    }//end parameterized constructor

    /**
     * Returns the height of the cylinder
     */
    public double getHeight(){
        return this.height;
    }//end get height method

    /**
     * Returns the radius of the cylinder
     * @return
     */
    public double getRadius(){
        return this.radius;
    }//end getRadius method

    /**
     * Returns the base length of the cylinder, calculated from the radius
     * @return base The base of the cylinder
     */
    public double getBase(){
        return this.base;
    }//end getBase method

    /**
     * Returns the volume of the cylinder
     * @return volume The volume of the cylinder
     */
    public double getVolume(){
        return this.volume;
    }//end getVolume method
}//end Cylinder class
