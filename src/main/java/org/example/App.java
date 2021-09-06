/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Rima Saleh
 */

package org.example;

//import statement for scanner
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {

        //scanner used to read data inputted
        Scanner scanner = new Scanner(System.in);

        //print statement asking for length to be inputted
        System.out.println( "What is the length of the room in feet?" );
        //number will be inputted and stored as "length"
        int length = scanner.nextInt();

        //print statement asking width to be inputted
        System.out.println( "What is the width of the room in feet?" );
        //number will be inputted and stored as "width"
        int width = scanner.nextInt();

        //print length, width, square feet, and square meters
        System.out.format( "You entered dimensions of %d feet by %d feet\n", length, width);
        System.out.format( "The area is %d square feet\n", length * width);
        System.out.format( "%.3f square meters", (length * width) * 0.09290304);
    }
}
