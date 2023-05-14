/*
 * This is the main system file from where all classes will be initialised
 * and methods are called.
 */
import java.util.Scanner;

class MainSystem {
    public static void main(String[] args) {

        /// MANDATORY SCENARIO 1: Trainee lodges a registration fee refund request which is addressed by the finance manager

        // Create trainee
        Trainee trainee = new Trainee("T123", "Tyrone");

        // Create finance manager
        FinanceManager fm = new FinanceManager();

        // Create scanner
        Scanner inputScanner = new Scanner(System.in);
        // Ask trainee if they want a refund
        if (trainee.requestRefund(inputScanner)) {

            // Forward refund request to financial manager
            if (fm.handleRefund(trainee)) {

                // Update datebase
                trainee.clearCourses();
                System.out.println(trainee.username + " refund request has been accepted, course removed.");
            } else {

                // Tell trainee result
                System.out.println(trainee.username + " refund request has been rejected.");
            }
        }
        System.out.println("");

        /// SCENARIO 2: Lodge a feedback/complaint which is successfully addressed by the Manager

        // Get user 
        Enquiry enquiry = trainee.createEnquiry(inputScanner);

        // Store enquiry to database
        System.out.println("Storing enquiry into database: " + enquiry.getEnquiry());
        Manager manager = new Manager();
        
        // Forward enquiry to manager to address enquiry
        String response = manager.resolveEnquiry(enquiry, inputScanner);

        // Once the enquiry is resolved
        if (enquiry.trackEnquiry()) {

            // Update database
            System.out.println("Updated enquiry status and response in database");

            enquiry.user.resolvedEnquiry(response);
        }

        inputScanner.close();
    }
}