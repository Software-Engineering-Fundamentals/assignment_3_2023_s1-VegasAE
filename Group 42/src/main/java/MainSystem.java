/*
 * This is the main system file from where all classes will be initialised
 * and methods are called.
 */

class MainSystem {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        /// MANDATORY SCENARIO 1: Trainee lodges a registration fee refund request which is addressed by the finance manager

        // Create trainee
        Trainee trainee = new Trainee("T123", "Tyrone");

        // Create finance manager
        FinanceManager fm = new FinanceManager();

        // Ask trainee if they want a refund
        if (trainee.requestRefund()) {

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
        
    }
}