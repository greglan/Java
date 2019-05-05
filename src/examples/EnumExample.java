package examples;

/*
 * This file demonstrate the use of enums in Java
 * https://www.w3schools.com/java/java_enums.asp
 */
public class EnumExample {
    enum Level {
        LOW,
        MEDIUM,
        HIGH
    }

    public static void main(String[] args) {
        Level myVar = Level.MEDIUM;

        switch(myVar) {
          case LOW:
            System.out.println("Low level");
            break;
          case MEDIUM:
            System.out.println("Medium level");
            break;
          case HIGH:
            System.out.println("High level");
            break;
        }

        // Loop through possible values
        for (Level value : Level.values()) {
            System.out.println(value);
        }
    }
}
