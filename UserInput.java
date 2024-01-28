import java.util.Scanner;

public interface UserInput {
     Scanner scanner = new Scanner(System.in);

    public static double getUserInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static int getUserInputInt(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static char getUserOperation() {
        System.out.print("Введите операцию (+, -, *, /): ");
        return scanner.next().charAt(0);
    }
}
