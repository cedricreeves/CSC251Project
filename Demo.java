import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        List<Policy> policies = new ArrayList<>();
        int smokerCount = 0;
        int nonSmokerCount = 0;

        try {
            File file = new File("policies.txt");
            Scanner scanner = new Scanner(file);

            while (scanner.hasNextLine()) {
                // Read policy information from the file
                String policyNumber = scanner.nextLine();
                String providerName = scanner.nextLine();
                String firstName = scanner.nextLine();
                String lastName = scanner.nextLine();
                int age = Integer.parseInt(scanner.nextLine());
                String smokingStatus = scanner.nextLine();
                double height = Double.parseDouble(scanner.nextLine());
                double weight = Double.parseDouble(scanner.nextLine());

                // Create Policy object and add it to the list
                Policy policy = new Policy(policyNumber, providerName, firstName, lastName, age, smokingStatus, height, weight);
                policies.add(policy);

                // Count smokers and non-smokers
                if (smokingStatus.equals("smoker")) {
                    smokerCount++;
                } else {
                    nonSmokerCount++;
                }
            }

            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
            e.printStackTrace();
        }

        // Display policy information
        for (Policy policy : policies) {
            System.out.println("Policy Number: " + policy.getPolicyNumber());
            System.out.println("Provider Name: " + policy.getProviderName());
            System.out.println("Policyholder's First Name: " + policy.getFirstName());
            System.out.println("Policyholder's Last Name: " + policy.getLastName());
            System.out.println("Policyholder's Age: " + policy.getAge());
            System.out.println("Policyholder's Smoking Status: " + policy.getSmokingStatus());
            System.out.println("Policyholder's Height: " + policy.getHeight() + " inches");
            System.out.println("Policyholder's Weight: " + policy.getWeight() + " pounds");

            // Calculate BMI
            double bmi = policy.calculateBMI();
            System.out.println("Policyholder's BMI: " + bmi);

            // Calculate insurance price
            double price = policy.calculateInsurancePrice();
            System.out.println("Policy Price: $" + String.format("%.2f", price));

            System.out.println(); // Add a blank line for readability
        }

        // Display smoker and non-smoker counts
        System.out.println("The number of policies with a smoker is: " + smokerCount);
        System.out.println("The number of policies with a non-smoker is: " + nonSmokerCount);
    }
}
