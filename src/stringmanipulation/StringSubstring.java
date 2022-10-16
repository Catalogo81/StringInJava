package stringmanipulation;

import java.util.Scanner;

/**
 * A Java program to get a substring of a given string between two specified positions
 *
 * @author Kgotso Matjato
 */

public class StringSubstring
{
    public static void main(String[] args) {

        //declaring my string
        String str = "This is a Java program that gets a substring at a specific place.";

        // Get the substring at index 8 and ending at index 12.
        String new_str = str.substring(8, 44);

        // The two strings compared.
        System.out.println("Original String = " + str);
        System.out.println("Sub-string = " + new_str);

    }
}
