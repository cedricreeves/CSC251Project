import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Asking user to enter necessary information
        System.out.println("Please enter the Policy Number:");
        String policyNumber = scanner.nextLine();

        System.out.println("Please enter the Provider Name:");
        String providerName = scanner.nextLine();

        System.out.println("Please enter the Policyholder's First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Please enter the Policyholder's Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Please enter the Policyholder's Age:");
        int age = Integer.parseInt(scanner.nextLine());

        System.out.println("Please enter the Policyholder's Smoking Status (smoker/non-smoker):");
        String smokingStatus = scanner.nextLine();

        System.out.println("Please enter the Policyholder's Height (in inches):");
        double height = Double.parseDouble(scanner.nextLine());

        System.out.println("Please enter the Policyholder's Weight (in pounds):");
        double weight = Double.parseDouble(scanner.nextLine());

        // Creating a Policy object using the constructor with arguments
        Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);

        // Displaying policy information
        System.out.println("Policy Number: " + policy.getPolicyNumber());
        System.out.println("Provider Name: " + policy.getProviderName());
        System.out.println("Policyholder's First Name: " + policy.getFirstName());
        System.out.println("Policyholder's Last Name: " + policy.getLastName());
        System.out.println("Policyholder's Age: " + policy.getAge());
        System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
        System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
        System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

        // Calculating and displaying BMI
        double bmi = policy.calculateBMI();
        System.out.println("Policyholder's BMI: " + bmi);

        // Calculating and displaying insurance price
        double price = policy.calculateInsurancePrice();
        System.out.println("Policy Price: $" + price);
    }
}
