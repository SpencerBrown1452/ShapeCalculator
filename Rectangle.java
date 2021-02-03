/*File: Rectangle.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a rectangle
 */

/**
 * This class creates a rectangle with a user specified height and width, and calculates the area of the rectangle
 */
public class Rectangle extends TwoDimensionalShape{
    //Variable declaration
    private double area = 0;
    private double length = 0;
    private double width = 0;

    /**
     * Constructs a default rectangle with all values set to 0
     */
    public Rectangle(){
    }//end default constructor

    /**
     * Creates a parameterized Rectangle with user specified height and width,
     * then calculates the area of that rectangle
     * @param length Length of the rectangle
     * @param width Width of the rectangle
     */
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
        this.area = length * width;
    }//end parameterized constructor

    /**
     * Returns the length of the rectangle
     * @return length
     */
    public double getLength(){return this.length;}

    /**
     * Returns the width of the rectangle
     * @return width
     */
    public double getWidth(){return this.width;}

    /**
     * Returns the area of the rectangle
     * @return area
     */
    public double getArea(){return this.area;}
}//end Rectangle class

