import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner; 

public class NameSorter { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of names: ");
        int count = scanner.nextInt();
        
        List<String> names = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.print("Enter name #" + (i + 1) + ": ");
            String name = scanner.next();
            names.add(name);
        }
        
        System.out.print("Enter 'A' for ascending order or 'D' for descending order: ");
        String choice = scanner.next();
        
        if (choice.equalsIgnoreCase("A")) {
            Collections.sort(names); 
        } else if (choice.equalsIgnoreCase("D")) {
            Collections.sort(names, Collections.reverseOrder()); 
        } else {
            System.out.println("Invalid choice. Please enter 'A' or 'D'.");
            return;
        }
        
        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
