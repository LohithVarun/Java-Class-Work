import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
 
        System.out.print("Enter the grade of the employee: ");
        String grade = input.nextLine();

        System.out.print("Enter the employee salary: ");
        double salary = input.nextDouble();

        double bonus = 0.0;
        if (salary < 10000) {
            bonus += 0.02 * salary;
        }
        if (grade.equalsIgnoreCase("A")) {
            bonus += 0.05 * salary;
        } else if (grade.equalsIgnoreCase("B")) {
            bonus += 0.1 * salary;
        }

        double totalSalary = salary + bonus;

        System.out.println("Salary=" + salary);
        System.out.println("Bonus=" + bonus);
        System.out.println("Total to be paid:" + totalSalary);
    }
}