/*File: Sphere.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a sphere
 */

import java.lang.Math.*;

/**
 * This class creates a sphere with a user specified radius and calculates the volume and circumference of the sphere
 */
public class Sphere extends ThreeDimensionalShape{
    //Variable declaration
    private double volume = 0;
    private double radius = 0;
    private double circumference = 0;

    /**
     * Default constructor, creates a sphere with all values set to 0
     */
    public Sphere(){
    }//end default constructor

    /**
     * Creates a sphere with a user specified radius, then calculates the volume and circumference
     * @param radius
     */
    public Sphere(double radius){
        this.radius = radius;
        this.volume = 4.0/3.0 * Math.PI * (radius * radius * radius);
        this.circumference = 2 * Math.PI * radius;
    }//end parameterized constructor

    /**
     * Returns the radius of the sphere
     * @return radius
     */
    public double getRadius(){
        return this.radius;
    }//end getRadius method

    /**
     * Returns the volume of the sphere
     * @return volume
     */
    public double getVolume(){
        return this.volume;
    }//end getVolume method

    /**
     * Returns the circumference of the sphere
     * @return circumference
     */
    public double getCircumference() {
        return this.circumference;
    }//end getCircumference method
}//end Sphere class
