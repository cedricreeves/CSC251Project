public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus; // "smoker" or "non-smoker"
    private double height; // in inches
    private double weight; // in pounds

    // No-argument constructor
    public PolicyHolder() {
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0.0;
        this.weight = 0.0;
    }

    // Parameterized constructor
    public PolicyHolder(String firstName, String lastName, int age, String smokingStatus, double height, double weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters here

    // BMI Calculation
    public double calculateBMI() {
        return (this.weight * 703) / (this.height * this.height);
    }

    // toString Method
    @Override
    public String toString() {
        return "Policyholder's First Name: " + firstName + "\n" +
               "Policyholder's Last Name: " + lastName + "\n" +
               "Policyholder's Age: " + age + "\n" +
               "Policyholder's Smoking Status: " + smokingStatus + "\n" +
               "Policyholder's Height: " + height + " inches\n" +
               "Policyholder's Weight: " + weight + " pounds\n" +
               "Policyholder's BMI: " + String.format("%.2f", calculateBMI());
    }
}
