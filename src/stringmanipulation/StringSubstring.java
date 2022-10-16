package stringmanipulation;

import java.util.Scanner;

/**
 * A Java Program that lets a user enter two strings and compare them,
 * checks if the strings are equal or not then
 * print the results.
 *
 * @author Kgotso Matjato
 */

public class StringSubstring
{
    public static void main(String[] args) {

        //creating my scanner object that will read the input given by the user
        Scanner sc = new Scanner(System.in);

        //my two string variables to store users input in
        String firstString = "";
        String secondString = "";

        //prompting user to enter input
        System.out.print("Please enter your first string: ");
        firstString = sc.next();

        System.out.print("Please enter your second string: ");
        secondString = sc.next();

        //output to user
        System.out.println("----------------------------------------------------------");
        System.out.println("Here is a comparison made on the two strings provided");
        System.out.println();

        //string compare using == operator
        System.out.println("1.) Comparison using the == operator");
        if(firstString == secondString)
            System.out.println("String: " + firstString + " is equal to String: " + secondString);
        else if(firstString != secondString)
            System.out.println("String: " + firstString + " is not equal to String: " + secondString);

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("2.) Comparison using the equals() method");
        if(firstString.equals(secondString))
            System.out.println("String: " + firstString + " is equal to String: " + secondString);
        else
            System.out.println("String: " + firstString + " is not equal to String: " + secondString);

        System.out.println();
        System.out.println("----------------------------------------------------------");
        System.out.println("3.) Comparison using the compareTo() method");
        if(firstString.compareTo(secondString) == 0)
            System.out.println("String: " + firstString + " is equal to String: " + secondString);
        else
            System.out.println("String: " + firstString + " is not equal to String: " + secondString);

        //more clarified examples in using the compareTo() method
        System.out.println("----------------------------------------------------------");
        String firstName = "Kgotso";
        String firstName2 = "Kgotso";
        String secondName = "Catalogo";
        String lastName = "Matjato";

        System.out.println();
        System.out.println(firstName.compareTo(firstName2));//0 because both are equal
        System.out.println(firstName.compareTo(secondName));//8 because "K" is 8 times higher than "C"
        System.out.println(firstName.compareTo(lastName));//-2 because "K" is 2 times lower than "M"

    }
}
