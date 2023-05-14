import java.util.List;

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
    public void resolveEnquiry(Enquiry enquiry){
        System.out.println("Reviewing enquiry");
        enquiry.resolveEnquiry();
        System.out.print("Manager has resolved the enquiry \"" + enquiry.getEnquiry() + "\"");

    }

    // create new course
    public Course createCourse(){
        Course newCourse = new Course();
        newCourse.setCourseDetails(0, "Economics", "Markets and such.", 4);
        return newCourse;
    }
}
