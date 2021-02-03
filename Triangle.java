/*File: Triangle.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a triangle
 */

/**
 * This class creates a triangle with a user specified base and height, and calculates the area of the triangle
 */
public class Triangle extends TwoDimensionalShape{
    //Variable Declaration
    private double area = 0;
    private double height = 0;
    private double base = 0;

    /**
     * Default constructor, creates a triangle and sets all values to 0
     */
    public Triangle(){
    }//end default constructor

    /**
     * Creates a triangle with user defined height and base sizes, then calculates the area of the triangle
     * @param height
     * @param base
     */
    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
        this.area = 1.0/2.0  * height * base;
    }//end parameterized constructor

    /**
     * Returns the height of the triangle
     * @return height
     */
    public double getHeight(){return this.height;}

    /**
     * Returns the base size of the triangle
     * @return base
     */
    public double getBase(){return this.base;}

    /**
     * Returns the area of the triangle
     * @return area
     */
    public double getArea(){return this.area;}//end getArea method
}//end Triangle class
