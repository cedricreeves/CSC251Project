/**
 * Represents a policy with details such as policy number, provider name, insured person's name,
 * age, smoking status, height, and weight.
 */
public class Policy {

    private String policyNumber; // The policy number
    private String providerName; // The name of the insurance provider
    private String firstName; // The first name of the insured person
    private String lastName; // The last name of the insured person
    private int age; // The age of the insured person
    private String smokingStatus; // The smoking status of the insured person
    private double height; // The height of the insured person in inches
    private double weight; // The weight of the insured person in pounds

    /**
     * Constructs a Policy object with default values.
     */
    public Policy() {
        this.policyNumber = "";
        this.providerName = "";
        this.firstName = "";
        this.lastName = "";
        this.age = 0;
        this.smokingStatus = "";
        this.height = 0.0;
        this.weight = 0.0;
    }

    /**
     * Constructs a Policy object with specified values.
     *
     * @param policyNumber   The policy number
     * @param providerName   The name of the insurance provider
     * @param firstName      The first name of the insured person
     * @param lastName       The last name of the insured person
     * @param age            The age of the insured person
     * @param smokingStatus  The smoking status of the insured person
     * @param height         The height of the insured person in inches
     * @param weight         The weight of the insured person in pounds
     */
    public Policy(String policyNumber, String providerName, String firstName, String lastName,
                  int age, String smokingStatus, double height, double weight) {
        this.policyNumber = policyNumber;
        this.providerName = providerName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.smokingStatus = smokingStatus;
        this.height = height;
        this.weight = weight;
    }

    // Getters and setters

    /**
     * Gets the policy number.
     *
     * @return The policy number
     */
    public String getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number.
     *
     * @param policyNumber The policy number to set
     */
    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }

    /**
     * Gets the name of the insurance provider.
     *
     * @return The name of the insurance provider
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the name of the insurance provider.
     *
     * @param providerName The name of the insurance provider to set
     */
    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * Gets the first name of the insured person.
     *
     * @return The first name of the insured person
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the first name of the insured person.
     *
     * @param firstName The first name of the insured person to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Gets the last name of the insured person.
     *
     * @return The last name of the insured person
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the last name of the insured person.
     *
     * @param lastName The last name of the insured person to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Gets the age of the insured person.
     *
     * @return The age of the insured person
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the insured person.
     *
     * @param age The age of the insured person to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Gets the smoking status of the insured person.
     *
     * @return The smoking status of the insured person
     */
    public String getSmokingStatus() {
        return smokingStatus;
    }

    /**
     * Sets the smoking status of the insured person.
     *
     * @param smokingStatus The smoking status of the insured person to set
     */
    public void setSmokingStatus(String smokingStatus) {
        this.smokingStatus = smokingStatus;
    }

    /**
     * Gets the height of the insured person.
     *
     * @return The height of the insured person in inches
     */
    public double getHeight() {
        return height;
    }

    /**
     * Sets the height of the insured person.
     *
     * @param height The height of the insured person to set in inches
     */
    public void setHeight(double height) {
        this.height = height;
    }

    /**
     * Gets the weight of the insured person.
     *
     * @return The weight of the insured person in pounds
     */
    public double getWeight() {
        return weight;
    }

    /**
     * Sets the weight of the insured person.
     *
     * @param weight The weight of the insured person to set in pounds
     */
    public void setWeight(double weight) {
        this.weight = weight;
    }

    // Calculate BMI

    /**
     * Calculates the Body Mass Index (BMI) of the insured person.
     *
     * @return The BMI of the insured person
     */
    public double calculateBMI() {
        return (weight * 703) / (height * height);
    }

    // Calculate insurance price

    /**
     * Calculates the insurance price based on age, smoking status, and BMI.
     *
     * @return The calculated insurance price
     */
    public double calculateInsurancePrice() {
        double baseFee = 600;
        double additionalFee = 0;
        if (age > 50) {
            additionalFee += 75;
        }
        if (smokingStatus.equals("smoker")) {
            additionalFee += 100;
        }
        double bmi = calculateBMI();
        if (bmi > 35) {
            additionalFee += (bmi - 35) * 20;
        }
        return baseFee + additionalFee;
    }
}
