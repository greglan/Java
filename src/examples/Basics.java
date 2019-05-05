package examples;

import java.util.Scanner;

/**
 * Class to demonstrate the basic structures of Java.
 *
 */
public class Basics {
    private static void IOExamples(){
        System.out.println("IOExamples() function");

        // Standard output
        System.out.print("A print without a new line.");
        System.out.println("This one has a new line.");
        System.out.print("But I can add one manually.\n");

        // Standard input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter: ");
        System.out.print("\t a string: ");
        String str = sc.nextLine();
        System.out.print("\t and int: ");
        int integer = sc.nextInt();

        System.out.println("\n");
    }

    private static void loopExamples() {
        System.out.println("loopExamples() function");

        for(int i = 0, j = 2; (i < 10 && j < 6); i++, j+=2){
            System.out.println("i = " + i + ", j = " + j);
        }

        System.out.println("\n");
    }

    private static void varExamples() {
        System.out.println("varExamples() function");


        boolean booleanVar = true;
        booleanVar = (booleanVar != false);

        byte byteVar;  // -128 to 127

        char charVar = 'c'; // Use '' for definition

        short shortVar; // -32 768 to 32 767 (2 bytes)

        int intVar; // -2^31=-2 147 483 648 to 2^31-1 = 2 147 483 647 (4 bytes)
        intVar = Integer.parseInt("5");
        System.out.println("intvar=" + intVar);
        intVar = Integer.parseInt("10", 16);
        System.out.println("intvar=" + intVar);

        long longVar; // -9 223 372 036 854 775 808 to 9 223 372 036 854 775 807 (8 bytes)
        longVar = 10000000000000000L; // Add 'L' to specify long type

        float floatVar; // -1.40239846E-45 to 3.40282347E38 (4 bytes)
        floatVar = 2.0f; // Always a '.' in the declaration and a 'f' to specify float type
        floatVar = Float.parseFloat("2.0");

        double doubleVar; // 4.9406564584124654E-324 to 1.797693134862316E308 (8 bytes)
        doubleVar = 2;
        doubleVar = 2.0;
        doubleVar = 2d;
        doubleVar = Double.parseDouble("2.0");
        System.out.println("doubleVar=" + doubleVar);

        int integerDivResult = (int) intVar / intVar;
        double doubleDivResult = (double) (intVar) / (intVar); // Incorrect
        doubleDivResult = (double) (intVar) / (double) (intVar);
        System.out.println("Incorrect integer division: " + (double) (intVar) / (intVar));
        System.out.println("Correct integer division: " + (double) (intVar) / (double) (intVar));

        System.out.println("\n");
    }

    private static void stringExamples() {
        System.out.println("stringExamples() function");

        String str1 = "test";
        String str2 = new String("hello");
        String str3 = new String();
        str3 = "world";

        int length = str1.length();
        str1.equals("test-nope!");
        str1.toLowerCase();
        str1.toUpperCase();

        String str4 = str2.concat(str3);
        str4 = str2 + str3; // Alternative concatenation
        str4 = str4.substring(5, 10); // Characters 5 to 9 (10 excluded)

        char firstChar = str1.charAt(0);
        int firstIndex = str1.indexOf('t');
        firstIndex = str1.indexOf("te");
        int lastIndex = str1.lastIndexOf('t');
        lastIndex = str1.lastIndexOf("st");

        System.out.println("\n");
    }

    /**
     * Demonstrate the use and declaration of arrays
     * See also ArrayList
     */
    private static void arrayExamples() {
        System.out.println("arrayExamples() function");

        int integerArray[] = {1, 4, 5, 2}; // C-style declaration
        int integerArrayBis[] = new int[4];
        int[] integerArrayTer = new int[4]; // Java-style declaration
        double[] doubleArray = {0.0, 0.1, 9.0};
        char[] charArray = {'h', 'e', 'l', 'l', 'o'};
        String[] stringArray = {"Hello", "World", "!"};

        int twoDimensionalArray[][] = {{1, 2}, {3, 4}};


        System.out.println("Array size: " + integerArray.length);
        System.out.println("Elements: ");

        for (int i : integerArray)
            System.out.println("\t" + i);

        System.out.println("\n");
    }

    private static void miscExamples() {
        System.out.println("miscExamples() function");

        System.out.println("Float between 0 and 1: " + Math.random());
        System.out.println("sin(pi/4): " + Math.sin(45));
        System.out.println("abs(-5): " + Math.abs(-5));
        System.out.println("2^10 (result is a double): " + Math.pow(2, 10));

        System.out.println("\n");
    }

    public static void main(String[] args){
//        IOExamples();
        loopExamples();
        varExamples();
        stringExamples();
        arrayExamples();
        miscExamples();
    }
}
