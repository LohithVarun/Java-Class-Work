import java.util.Scanner;

public class VowelCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a statement: "); 
        String statement = scanner.nextLine();
        
        int count = countVowels(statement);
        
        System.out.println("Number of vowels: " + count);
    }
    
    public static int countVowels(String statement) {
        int count = 0;
        for (int i = 0; i < statement.length(); i++) {
            char ch = Character.toLowerCase(statement.charAt(i));
            if (isVowel(ch)) {
                count++;
            }
        }
        return count;
    }
    
    public static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
