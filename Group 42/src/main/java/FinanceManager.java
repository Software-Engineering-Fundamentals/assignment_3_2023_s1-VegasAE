import java.util.ArrayList;

public class FinanceManager extends User {

    // private class attributes
    private ArrayList<String> reports;

    // class methods

    // handle refund request, return true is accepted false if rejected
    public boolean handleRefund(Trainee trainee){
        boolean eligible = false;

        // If they are in the system
        if (trainee.getRegistrationId() != null) {
            eligible = true;
        }

        // Update trainee database
        if (eligible) {
            System.out.println(trainee.username + " refund request has been accepted.");
        } else {
            System.out.println(trainee.username + " refund request has been rejected.");
        }
        
        return eligible;
    }
}
