/*File: ShapeInterface.java
 *Author: Spencer A Brown
 *Date: 28 May 2020
 *Purpose: Contains the main method, and creates the user interface
 */

import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.time.*;

/**
 * This class houses the main method, creates the interface, and loops until the user decides to terminate
 */
public class ShapeInterface {
    /* Class variable to hold the user's selection,
    * even if they supply an incorrect input after selecting their operation
    *the program will still loop the shape they wanted to create
    */
    private static int option;

    /**
     * Menu class, offers an interface, which lists the shape options available to the user
     */
    public static void menu(){
        //Scanner for user input
        Scanner scan = new Scanner(System.in);
        try{
            //The interface
            System.out.println("*******************************************************");
            System.out.println("\nSelect from the menu below:\n");
            System.out.println("1.  Construct a Circle");
            System.out.println("2.  Construct a Rectangle");
            System.out.println("3.  Construct a Square");
            System.out.println("4.  Construct a Triangle");
            System.out.println("5.  Construct a Sphere");
            System.out.println("6.  Construct a Cube");
            System.out.println("7.  Construct a Cone");
            System.out.println("8.  Construct a Cylinder");
            System.out.println("9.  Construct a Torus");
            System.out.println("10. Exit the program\n");

            //Shows the user where to input choice
            System.out.print("Input: ");
            //Scans in and saves the user's choice to a static variable
            option = scan.nextInt();
        }catch (InputMismatchException|NumberFormatException e) { //Catches incorrect selections
            System.out.println("Please enter a selection between 1 and 10");
            //Relaunches the menu
            menu();
        }//end try/catch statement
    }//end project method

    /**
     * Options class, constructs the object and prints its area/volume,
     * based off of which object and dimensions the user selects
     */
    public static void options(){
        //Scanner for user input
        Scanner scan = new Scanner(System.in);
        //Variables to store the object data
        double len, width, height, base, radius, minorRadius, majorRadius;

        try {
            //Uses the option static variable to select the object the user specifies
            //The user will then specify the object dimensions necessary to calculate the area/volume
            //Then the object will be created and the area/volume printed for the user to see
            switch (option) {
                case 1:
                    System.out.println("\nWhat is the radius of the circle?");
                    radius = scan.nextDouble();
                    Circle circle = new Circle(radius);
                    System.out.println("\nThe area of your circle is " + circle.getArea());
                    break;
                case 2:
                    System.out.println("\nWhat is the length of your rectangle?");
                    len = scan.nextDouble();
                    System.out.println("\nWhat is the width of your rectangle?");
                    width = scan.nextDouble();
                    Rectangle rect = new Rectangle(len, width);
                    System.out.println("\nThe area of your rectangle is " + rect.getArea());
                    break;
                case 3:
                    System.out.println("\nWhat is the length of your square?");
                    len = scan.nextDouble();
                    Square square = new Square(len);
                    System.out.println("\nThe area of your square is " + square.getArea());
                    break;
                case 4:
                    System.out.println("\nWhat is the height of your equilateral triangle?");
                    height = scan.nextDouble();
                    System.out.println("\nWhat is the base length of your equilateral triangle?");
                    base = scan.nextDouble();
                    Triangle triangle = new Triangle(height, base);
                    System.out.println("\nThe area of your equilateral triangle is " + triangle.getArea());
                    break;
                case 5:
                    System.out.println("\nWhat is the radius of your sphere?");
                    radius = scan.nextDouble();
                    Sphere sphere = new Sphere(radius);
                    System.out.println("\nThe volume of your sphere is " + sphere.getVolume());
                    break;
                case 6:
                    System.out.println("\nWhat is the length of one of the sides of your cube?");
                    len = scan.nextDouble();
                    Cube cube = new Cube(len);
                    System.out.println("\nThe volume of your cube is " + cube.getVolume());
                    break;
                case 7:
                    System.out.println("\nWhat is the height of your cone?");
                    height = scan.nextDouble();
                    System.out.println("\nWhat is the radius of the base of your cone?");
                    radius = scan.nextDouble();
                    Cone cone = new Cone(height, radius);
                    System.out.println("\nThe volume of your cone is " + cone.getVolume());
                    break;
                case 8:
                    System.out.println("\nWhat is the height of your cylinder?");
                    height = scan.nextDouble();
                    System.out.println("\nWhat is the radius of the base of your cylinder?");
                    radius = scan.nextDouble();
                    Cylinder cylinder = new Cylinder(height, radius);
                    System.out.println("\nThe volume of your cylinder is " + cylinder.getVolume());
                    break;
                case 9:
                    System.out.println("\nWhat is the minor radius of your torus?");
                    minorRadius = scan.nextDouble();
                    System.out.println("\nWhat is the major radius of your torus?");
                    majorRadius = scan.nextDouble();
                    Torus torus = new Torus(minorRadius, majorRadius);
                    System.out.println("\nThe volume of your torus is " + torus.getVolume());
                    break;
                case 10:
                    printTimeAndExit();
            }//end switch statement
        }catch (InputMismatchException|NumberFormatException e){ //Catches incorrect selections
            System.out.println("You must enter a valid measurement.");
            //Relaunches the options class, and sends the user back to the shape that they initially selected
            options();
        }//end try/catch statement
    }//end options method

    /**
     * continuationPrompt method, prompt the user whether they would like to continue
     */
    public static void continuationPrompt(){
        //Scanner for user input
        Scanner scan = new Scanner(System.in);
        System.out.println("\nWould you like to continue? Enter Y or N\n");
        System.out.print("Input: ");
        String answer = scan.next().toUpperCase();

        //if the user enters y or Y, the method finishes, allowing the loop in the main class
       //to loop back to the selection interface
        if (answer.equals("Y")){
            ;
        }else if (answer.equals("N")){
            //If user enters n or N, the thank you, date, and time is printed, and the application exits
            printTimeAndExit();
        }else{ //If the user inputs an invalid choice, the application informs the user and
               // the continuation method re-executes
            System.out.println("\nPlease enter either Y or N");
            continuationPrompt();
        }//end else statement
    }//end continuationPrompt method

    /**
     * Prints the thank you message, followed by the date and time, and then exits the application
     */
    private static void printTimeAndExit(){
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();
        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("E, MMM dd yyyy");
        DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println("\nThank you for using the program. Today is " + date.format(dateFormat) +
                ". The current time is " + time.format(timeFormat) + ".");
        System.exit(0);
    }

    /**
     * Main method will run until option 10 is selected, which terminates the program
     * @param args allows command line arguments
     */
    public static void main(String args[]){
        System.out.println("********** Welcome to Java OO Shapes Program **********");
        while(true){
            menu();
            options();
            continuationPrompt();
        }//end while statement
    }//end main method
}//end ShapeInterface class