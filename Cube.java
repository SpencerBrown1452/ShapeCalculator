/*File: Cube.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: To construct a cube
 */

/**
 * This class creates a cube with a user specified side length, the it calculates the volume of the cube
 */
public class Cube extends ThreeDimensionalShape{
    //Variable Declaration
    private double volume = 0;
    private double length = 0;
    private double width = 0;
    private double depth = 0;

    /**
     * Default Constructor, creates a cube and sets all of the values to 0
     */
    public Cube(){
    }//end default constructor

    /**
     * Creates a cube with a user defined side length, then calculates the volume of the cube
     * @param side
     */
    public Cube (double side) {
        this.length = side;
        this.width = side;
        this.depth = side;
        this.volume = length * width * depth;
    }//end parameterized constructor

    /**
     * Returns the length of the cube
     * @return length
     */
    public double getLength(){
        return this.length;
    }//end getArea method

    /**
     * Returns the width of the cube
     * @return width
     */
    public double getWidth(){
        return this.width;
    }//end getArea method

    /**
     * Returns the depth of the cube
     * @return depth
     */
    public double getDepth(){
        return this.depth;
    }//end getArea method

    /**
     * Returns the volume of the cube
     * @return volume
     */
    public double getVolume(){
        return this.volume;
    }//end getArea method
}//end Cube class
