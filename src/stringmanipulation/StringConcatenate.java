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

        //first concatenation example
        String defaultString = "Java is a very special programming language";
        String programmingChoice = "";

        System.out.println(defaultString.concat(" which I would recommend to other programmers"));
        System.out.println();


        //second concatenation example with user input  data
        System.out.println("---------------------------------------------------------------------");
        System.out.print("What is your favourite programming language between (Java, Python and C#): ");
        programmingChoice = sc.next();

        if(programmingChoice.equalsIgnoreCase("Java"))
            System.out.println(programmingChoice.concat(" is a popular programming language, " +
                    "created in 1995 It is owned by Oracle, and more than 3 billion devices run Java."));
        else if(programmingChoice.equalsIgnoreCase("Python"))
            System.out.println(programmingChoice.concat(" is a high-level, general-purpose " +
                    "programming language." +
                    " Its design philosophy emphasizes code readability with the use of significant indentation."));
        else if(programmingChoice.equalsIgnoreCase("C#"))
            System.out.println(programmingChoice.concat(" (pronounced \"See Sharp\") is a modern," +
                    " object-oriented, and type-safe programming language."));
        else
            System.out.println("Not a valid choice");


    }
}
