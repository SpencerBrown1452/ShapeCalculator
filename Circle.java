/*File: Circle.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a circle
 */

import java.lang.Math.*;

/**
 * This class creates a circle with a user specified radius and calculates the area and circumference of the circle
 */
public class Circle extends TwoDimensionalShape{
    //Variable initialization
    private double area = 0;
    private double radius = 0;
    private double circumference = 0;

    /**
     * Default constructor, creates a circle with all values set to 0
     */
    public Circle(){
    }//end default constructor

    /**
     * Creates a circle with a user specified radius, then calculates the area and circumference
     * @param radius user input radius
     */
    public Circle(double radius){
        this.radius = radius;
        this.area = Math.PI * radius * radius;
        this.circumference = 2 * Math.PI * radius;
    }//end parameterized constructor

    /**
     * Returns the radius of the user's circle
     * @return radius
     */
    public double getRadius(){
        return this.radius;
    }//end getRadius method

    /**
     * Returns the area of the user's circle
     * @return area
     */
    public double getArea(){
        return this.area;
    }//end getArea method

    /**
     * Returns the circumference of the user's circle
     * @return circumference
     */
    public double getCircumference() {
        return this.circumference;
    }//end getCircumference method
}//end Circle class