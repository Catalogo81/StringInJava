package stringmanipulation;

import java.util.Scanner;

/**
 * A Java Program that concatenates a given string to the end of another string
 *
 * @author Kgotso Matjato
 */

public class StringConcatenate
{
    public static void main(String[] args) {

        //creating my scanner object that will read the input given by the user
        Scanner sc = new Scanner(System.in);

        String defaultString = "Java is a very special programming language";
        String programmingChoice = "";

        System.out.println(defaultString.concat(" which I would recommend to other programmers"));
        System.out.println();

        System.out.println("What is your favourite programming language between (Java, Python and C#)");
        programmingChoice = sc.next();

        if(programmingChoice.equals("Java"))
            System.out.println(defaultString.concat(" is a popular programming language, created in 1995. " +
                "It is owned by Oracle, and more than 3 billion devices run Java."));
        else if(programmingChoice.equals("Java"))

    }
}
