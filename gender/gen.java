package gender;

import java.util.Scanner;

public class gen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter gender (M/F): ");
        String gender = scanner.nextLine().trim().toUpperCase();

        if (gender.equals("M")) {
            System.out.println(name + " is Male.");
        } else if (gender.equals("F")) {
            System.out.println(name + " is Female.");
        } else {
            System.out.println("Invalid input. Please enter 'M' for Male or 'F' for Female.");
        }

        scanner.close();
    }
}