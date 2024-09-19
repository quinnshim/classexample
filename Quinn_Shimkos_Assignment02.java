package assignment02;

import java.util.Scanner;

public class Quinn_Shimkos_Assignment02 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);
        
        // Variables
        String firstName;
        char middleInitial;
        String lastName;
        int age;
        double grossAnnualPay;
        double taxRate;
        double netAnnualPay;
        
        // user input
        System.out.print("Enter your first name: ");
        firstName = scanner.nextLine();
        
        System.out.print("Enter your middle initial: ");
        middleInitial = scanner.nextLine().charAt(0);
        
        System.out.print("Enter your last name: ");
        lastName = scanner.nextLine();
        
        System.out.print("Enter your age: ");
        age = scanner.nextInt();
        
        System.out.print("Enter your annual pay: ");
        grossAnnualPay = scanner.nextDouble();
        
        System.out.print("Enter your tax rate (e.g, 0.15 for 15%): ");
        taxRate = scanner.nextDouble();
        
        // scanner close
        scanner.close();
        
        // math
        netAnnualPay = grossAnnualPay - (grossAnnualPay * taxRate);
        
        // displaying output of user input
        System.out.println("Hello " + firstName + " " + middleInitial + ". " + lastName + ",");
        System.out.println("You are " + age + " years old now.");
        System.out.println("It is amazing that you made $" + grossAnnualPay + " this year. With the tax");
        System.out.println("rate of " + taxRate + ", you can take home $" + netAnnualPay + ".");
    }
}
