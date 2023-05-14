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

    public User(){
    }
    public User(String name, String userID, String email, int phoneNum, String password, int emergencyContact){
        this.name = name;
        this.userID = userID;
        this.email = email;
        this.phoneNum = phoneNum;
        this.password = password;
        this.emergencyContact = emergencyContact;
    }
    //TODO: Implement these functions
    // get details of the user
    public void getDetails(){
        
    }

    // set the details of the user
    public void setDetails(){

    }

    // create an enquiry request
    public Enquiry createEnquiry(Scanner scanner){

        System.out.print("Input your enquiry: ");
        String feedback = scanner.nextLine();
        Enquiry enquiry = new Enquiry(this, feedback);

        return enquiry;
    }

    // create IT support ticket
    public void createItEnquiry(){

    }

    // allow user to join a course
    public void joinCourse(){

    }

    // allow user to register themselves with the training service
    public void register(){

    }

    // allows the user to login
    public void login(){

    }

}
