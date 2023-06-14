import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the marks of subject 1: ");
        int subject1 = input.nextInt();
        
        System.out.print("Enter the marks of subject 2: ");
        int subject2 = input.nextInt();
        
        System.out.print("Enter the marks of subject 3: ");
        int subject3 = input.nextInt();
        
        System.out.print("Enter the marks of subject 4: ");
        int subject4 = input.nextInt();
        
        int totalMarks = subject1 + subject2 + subject3 + subject4;
        double aggregatePercentage = (totalMarks / 4.0) * 100;
        String grade;
        
        if (aggregatePercentage >= 75) {
            grade = "Distinction"; 
        } else if (aggregatePercentage >= 60 && aggregatePercentage < 75) {
            grade = "First Division";
        } else if (aggregatePercentage >= 50 && aggregatePercentage < 60) {
            grade = "Second Division";
        } else if (aggregatePercentage >= 40 && aggregatePercentage < 50) {
            grade = "Third Division";
        } else {
            grade = "Fail";
        }
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Aggregate Percentage: " + aggregatePercentage + "%");
        System.out.println("Grade: " + grade);
    }
    
}