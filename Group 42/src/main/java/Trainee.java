import java.util.ArrayList;
import java.util.Scanner;

public class Trainee extends User{
    // private attribute fields
    private String registrationId;
    private ArrayList<Course> courses;

    // public attributes;
    public String username;

    // class methods

    // Constructor
    public Trainee(String registrationId, String username) {
        this.registrationId = null;
        this.username = username;
    }

    // Provide feedback about something
    public void provideFeedback(){
    
    }

    // Attend a hosted session
    public void attendSession(){

    }

    // Access the resources for a course
    public void accessResources() {

    }

    // Take an exam for a course
    public void takeExam(){

    }

    // Request a refund
    public boolean requestRefund(){
        
        // Create input scanner
        Scanner inputScanner = new Scanner(System.in);

        // Get refund answer
        System.out.print("Do you want a refund (y/n): ");
        String response = inputScanner.nextLine();

        // Close input
        inputScanner.close();

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
