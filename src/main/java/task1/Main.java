package task1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, enter number >= 0: ");
        try {
            System.out.println(validNumber(scanner.nextInt()));
            scanner.close();
        } catch (InvalidNumberException e) {
            System.out.println(e + e.getMessage());
        }
        scanner.close();
    }

    private static String validNumber(int number) throws InvalidNumberException {
        if (number < 0) throw new InvalidNumberException("Number must more than zero");
        return "Number is correctly";
    }
}