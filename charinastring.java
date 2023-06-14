import java.util.Scanner;

public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine(); 
        
        System.out.print("Enter a character to search: ");
        char target = scanner.next().charAt(0);
        
        int index = findCharacter(text, target);
        
        if (index != -1) {
            System.out.println("Character '" + target + "' found at index " + index);
        } else {
            System.out.println("Character '" + target + "' not found in the string.");
        }
    }
    
    public static int findCharacter(String text, char target) {
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == target) {
                return i;
            }
        }
        return -1; 
    }
}
