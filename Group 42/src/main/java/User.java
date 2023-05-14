import java.util.Date;
import java.util.Scanner;

public class User {

    // Private class attributes
    protected String name;
    protected String userID;
    protected Date DOB;
    protected String email;
    protected int phoneNum;
    protected String password;
    protected int emergencyContact;
    private String payment; // set to private for the current moment

    // Default constructor
    public User() {
    }

    // Constructor with args
    public User(String name, String userID, String email, int phoneNum, String password, int emergencyContact){
        this.name = name;
        this.userID = userID;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
        this.emergencyContact = emergencyContact;
    }

    // Create an enquiry request
    public Enquiry createEnquiry(Scanner scanner){

        // Get enquiry details and pass it back to the system
        System.out.print("Input your enquiry: ");
        String feedback = scanner.nextLine();
        Enquiry enquiry = new Enquiry(this, feedback);

        return enquiry;
    }

    // On requiry resolved
    public void resolvedEnquiry(String response) {
        System.out.println("Here is the response to your enquiry: " + response);
    }
}
