package if_else_condition;

public class ifcon {
    public static void main(String[] args) {
        int number = 2;

        if (number % 2 == 0) {
            System.out.println("The number is even.");
        } else if (number % 2 != 0) {
            System.out.println("The number is odd.");
        } else {
            System.out.println("The number is neutral.");
        }
    }
}
