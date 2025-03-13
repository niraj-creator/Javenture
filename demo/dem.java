//package demo;

/*import java.util.Scanner;
public class dem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter");
    }
}*/
package demo;

import java.util.Scanner;

public class dem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter name: ");
        String name = scanner.nextLine().trim();
        
        System.out.print("Enter age: ");
        int age = scanner.nextInt();
        
        scanner.nextLine();

        System.out.print("Enter your favorite color: ");
        String color = scanner.nextLine().trim();
    
        System.out.println("\n--- User Information ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Favorite Color: " + color);
        
        scanner.close();
    }
}