import java.util.ArrayList;
import java.util.Scanner;

public class Trainee extends User{
    // private attribute fields
    private String registrationId;
    private ArrayList<Course> courses = new ArrayList<>();

    // public attributes;
    public String username;

    // class methods

    // Constructor
    public Trainee(String registrationId, String username) {
        this.courses.add(new Course());
        this.registrationId = registrationId;
        this.username = username;
    }

    // Provide feedback about something
    public void provideFeedback(){
    
    }

    // Request a refund
    public boolean requestRefund(Scanner scanner){
        
        // Get refund answer
        System.out.print("Do you want a refund (y/n): ");
        String response = scanner.nextLine();

        // Check response
        if (response.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    // Clear courses
    public void clearCourses() {
        courses.clear();
    }

    // Return registrationId
    public String getRegistrationId() {
        return registrationId;
    }
}
