/*File: Square.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a Square
 */

/**
 * This class creates a square with a user specified length, and then calculates the area of the square.
 */
public class Square extends TwoDimensionalShape{
    private double area = 0;
    private double length = 0;
    private double width = 0;

    /**
     * Default constructor, creates a square and sets all values to 0
     */
    public Square(){
    }//end default constructor

    /**
     * Constructs a square with a user specified length, then calculates the area
     * @param side Length of one side
     */
    public Square(double side) {
        this.length = side;
        this.width = side;
        this.area = length * width;
    }//end parameterized constructor

    /**
     * Returns the length of the square
     * @return length
     */
    public double getLength(){return this.length;}

    /**
     * Returns the width of the square
     * @return width
     */
    public double getWidth(){return this.width;}

    /**
     * Returns the area of the square
     * @return area
     */
    public double getArea(){
        return this.area;
    }//end getArea method
}//emd Square Class
