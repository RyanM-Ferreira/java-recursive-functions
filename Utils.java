import java.util.Scanner;

public class Utils {
    Recursion recursion = new Recursion();
    Scanner input = new Scanner(System.in);

    void ConsoleClear() {
        System.out.print("\u001b[H\u001b[2J");
        System.out.flush();
    }

    void GetInput() {
        System.out.println("> Choose a progression type:");
        System.out.println("1. Arithmetic Progression");
        System.out.println("2. Geometric Progression");
        System.out.println("3. Geometric Progression with Even/Odd Separation");

        int choice;
        System.out.print("\nYour choice: ");
        choice = input.nextInt();

        while (choice < 1 || choice > 3) {
            System.out.println("\nInvalid option! Try again.");
            System.out.print("Your choice: ");
            choice = input.nextInt();
        }

        System.out.println("\n> Progression Parameters");

        System.out.printf("Initial Term: ");
        long initialTerm = input.nextLong();

        System.out.printf("Ratio: ");
        long ratio = input.nextLong();

        System.out.printf("Limit: ");
        long limit = input.nextLong();

        ConsoleClear();

        switch (choice) {
            case 1:
                recursion.ArithmeticProgression(initialTerm, ratio, limit);
                break;
            case 2:
                recursion.GeometricProgression(initialTerm, ratio, limit);
                break;
            case 3:
                recursion.GeometricProgression(initialTerm, ratio, limit);
                recursion.GetEvenAndOdd(0);
                break;
        }

        RestartProgram();
    }

    void RestartProgram() {
        input.nextLine();

        System.out.println("\nPress Enter to continue...");
        input.nextLine();

        recursion.numbersList.clear();
        recursion.evenList.clear();
        recursion.oddList.clear();
    }
}