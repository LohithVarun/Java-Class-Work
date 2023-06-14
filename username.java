import java.util.Scanner;

public class UserNameValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a username: ");
        String username = scanner.nextLine(); 
        
        if (isValidUsername(username)) {
            System.out.println("Valid username!");
        } else {
            System.out.println("Invalid username!");
        }
    }
    
    public static boolean isValidUsername(String username) {
        String regex = "^[a-zA-Z0-9_]{6,}$";
        
        return username.matches(regex);
    }
}
