public class FinanceManager extends User {

    // class methods

    // handle refund request, return true is accepted false if rejected
    public boolean handleRefund(Trainee trainee){
        boolean eligible = false;

        // If they are in the system
        if (trainee.getRegistrationId() != null) {
            eligible = true;
        }
        
        return eligible;
    }
}
