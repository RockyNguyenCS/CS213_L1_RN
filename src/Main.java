/* Rocky Nguyen
Lab Assignment 2
 */

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        do {
            showMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Clear the newline after reading the int

            switch (choice) {
                case 1:
                    playMadLibs(scanner);
                    break;
                case 2:
                    System.out.println("Thanks for playing Mad Libs. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1 to play or 2 to quit.");
            }
        } while (choice != 2);
    }

    public static void showMenu() {
        System.out.println("\n=== Mad Libs Game ===");
        System.out.println("1. Play Mad Libs");
        System.out.println("2. Quit");
        System.out.print("Enter your choice: ");
    }

    public static void playMadLibs(Scanner scanner) {
        String animal = getStringInput(scanner, "Enter your favorite animal (e.g. dragon, turtle): ");
        String place = getStringInput(scanner, "Enter a place (e.g. beach, space, forest): ");
        int number = getIntInput(scanner, "Enter a whole number: ");
        float price = getFloatInput(scanner, "Enter a price (e.g. 9.99): ");

        displayMadLibsStory(animal, place, number, price);
    }

    public static String getStringInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        return scanner.nextLine();
    }

    public static int getIntInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        int value = scanner.nextInt();
        scanner.nextLine(); // Clear the newline
        return value;
    }

    public static float getFloatInput(Scanner scanner, String prompt) {
        System.out.print(prompt);
        float value = scanner.nextFloat();
        scanner.nextLine(); // Clear the newline
        return value;
    }

    public static void displayMadLibsStory(String animal, String place, int number, float price) {
        System.out.println("\n--- Your Mad Libs Story ---");
        System.out.println("Once upon a time, a " + animal + " went to " + place + ".");
        System.out.println("It bought " + number + " ice creams for $" + price + " each.");
        System.out.println("That " + animal + " sure knows how to party at the " + place + "!");
        System.out.println("-----------------------------\n");
    }
}

/*
/Users/damac/Library/Java/JavaVirtualMachines/openjdk-24.0.1/Contents/Home/bin/java -javaagent:/Users/damac/Library/Caches/JetBrains/IntelliJIdea2025.1/testAgent/intellij.platform.coverage.agent.jar=/private/var/folders/3n/rl2ylbjs4czcgn37g3vl9grh0000gn/T/coverageargs -Didea.coverage.calculate.hits=true -javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=56259 -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath /Users/damac/Desktop/Madlibs/out/production/Madlibs Main

=== Mad Libs Game ===
1. Play Mad Libs
2. Quit
Enter your choice: 1
Enter your favorite animal (e.g. dragon, turtle): Turtle
Enter a place (e.g. beach, space, forest): Forest
Enter a whole number: 313
Enter a price (e.g. 9.99): 9.42

--- Your Mad Libs Story ---
Once upon a time, a Turtle went to Forest.
It bought 313 ice creams for $9.42 each.
That Turtle sure knows how to party at the Forest!
-----------------------------


=== Mad Libs Game ===
1. Play Mad Libs
2. Quit
Enter your choice:
 */
