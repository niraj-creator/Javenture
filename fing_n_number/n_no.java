package fing_n_number;

import java.util.Scanner;

public class n_no {
    public static void main(String args[]){
        int i=1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number"); 
        int n=input.nextInt();
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}
