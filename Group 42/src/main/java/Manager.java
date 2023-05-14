import java.util.List;
import java.util.Scanner;

public class Manager extends User{
    
    // private class attributes
    private String managerUsername;

    // class methodsy
    // TODO: Implement class methods

    // constructor
    public Manager(){
        super();
    }

    public Manager(String managerUsername){
        super();
        this.managerUsername = managerUsername;
    }

    // resolved enquiries from users
    public String resolveEnquiry(Enquiry enquiry, Scanner inputScanner){

        // Gets pop up of the enquiry summary
        System.out.println("Reviewing enquiry: " + enquiry.getEnquiry());

        // Get manager response
        System.out.print("Manager's response to the above enquiry: ");
        String response = inputScanner.nextLine();

        // Marks enquiry as resolved and returns response to system
        enquiry.resolveEnquiry(response);
        System.out.println("Manager has resolved the enquiry \"" + enquiry.getEnquiry() + "\"");
        return response;
    }

    // create new course
    public Course createCourse(){
        Course newCourse = new Course();
        newCourse.setCourseDetails(0, "Economics", "Markets and such.", 4);
        return newCourse;
    }
}
