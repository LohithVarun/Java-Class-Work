import java.util.Scanner;
class SuperClass {
    int num;

    SuperClass(int num) {
        this.num = num; 
    }
}

class SubClass extends SuperClass {
    int num;

    SubClass(int num1, int num2) {
        super(num1);
        this.num = num2;
    }

    void display() {
        System.out.println("SuperClass num: " + super.num);
        System.out.println("SubClass num: " + num);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        SubClass obj = new SubClass(num1, num2);
        obj.display();
    }
}