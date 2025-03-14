package array_vowel;

import java.util.Scanner;

public class vow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character"); 
        char ch = input.next().charAt(0);
        
        char[] vowels = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        boolean isVowel = false;

        for (char vowel : vowels) {
            if (ch == vowel) {
                isVowel = true;
                break;
            }
        }

        if (isVowel) {
            System.out.println("Vowel");
        } else {
            System.out.println("Consonant");
        }
    }
}