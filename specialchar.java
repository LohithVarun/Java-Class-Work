import java.util.Scanner;

public class SpecialCharacterCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a line of text: ");
        String line = scanner.nextLine(); 
        
        int count = 0;
        System.out.println("Special characters:");
        
        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);
            if (isSpecialCharacter(ch)) {
                count++;
                System.out.println(ch);
            }
        }
        
        System.out.println("Number of special characters: " + count);
    }
    
    public static boolean isSpecialCharacter(char ch) {
        String regex = "[!@#$%&*]";
        
        return String.valueOf(ch).matches(regex);
    }
}
