import java.util.Scanner;

public class ConsonantVowelSeparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.nextLine();
        
        String consonants = ""; 
        String vowels = "";
        
        for (int i = 0; i < word.length(); i++) {
            char ch = Character.toLowerCase(word.charAt(i));
            if (isVowel(ch)) {
                vowels += ch;
            } else if (Character.isLetter(ch)) {
                consonants += ch;
            }
        }
        
        System.out.println("Consonants: " + consonants);
        System.out.println("Vowels: " + vowels);
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
