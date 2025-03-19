public class MethodReturnTypes {
    public static void main(String[] args) {
        // Call the method to display the welcome message
        displayWelcomeMessage();
        
        // Declare variables for calculating the average
        int value1 = 20;
        int value2 = 30;
        
        // Call the method to calculate the average and store the result in 'result'
        double result = calculateAverage(value1, value2);
        
        // Print the calculated average
        System.out.println("The average is: " + result);
    }

    // Method to display a welcome message (void method)
    public static void displayWelcomeMessage() {
        System.out.println("Welcome to our program!");
    }

    // Method to calculate the average of two numbers (value-returning method)
    public static double calculateAverage(int num1, int num2) {
        double average = (num1 + num2) / 2.0; // Calculate the average
        return average; // Return the average value
    }
}
