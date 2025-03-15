package bankaccount;
import java.util.Scanner;

public class pri {
 
    public static double calculateToll(String banktype, boolean hasMorethanmimimumbalance) {
        double withdrawAtmim = 0;


        if (banktype.equalsIgnoreCase("savings_account")) {
            withdrawAtmim = 500;
        } else if (banktype.equalsIgnoreCase("current_account")) {
            withdrawAtmim = 1000;
        } else {
            System.out.println("Invalid invelid type.");
            return -1; 
        }


        if (hasMorethanmimimumbalance) {
            withdrawAtmim = withdrawAtmim ; 
        }

        return withdrawAtmim;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Account type: ");
        String accountype = scan.nextLine();
        System.out.println("Does the account has mimimum balance ? (true/false): ");
        boolean hasMorethanmimimumbalance = scan.nextBoolean();

        double tollFee = calculateToll(account, hasRFID);
        if (tollFee != -1) {
            System.out.println("Toll fee: " + tollFee);
        }
    }       
}

