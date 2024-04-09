public class Policy {
    private String policyNumber; // The policy number
    private String providerName; // The name of the insurance provider
    private PolicyHolder policyHolder; // The policyholder

    // Default constructor
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.policyHolder = new PolicyHolder();
    }

    // Parameterized constructor
    public Policy(String policyNumber, String providerName, PolicyHolder policyHolder) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.policyHolder = policyHolder;
    }

    // Getters and setters

    public String getPolicyNumber() {
        return policyNumber;
    }

    // Other getters and setters

    public PolicyHolder getPolicyHolder() {
        return policyHolder;
    }

    public void setPolicyHolder(PolicyHolder policyHolder) {
        this.policyHolder = policyHolder;
    }

    // Calculate insurance price
    public double calculateInsurancePrice() {
        // Calculation logic here
    }

    // toString method
    @Override
    public String toString() {
        return "Policy Number: " + policyNumber + "\n" +
               "Provider Name: " + providerName + "\n" +
               policyHolder.toString(); // This will call the toString of PolicyHolder
    }
}
