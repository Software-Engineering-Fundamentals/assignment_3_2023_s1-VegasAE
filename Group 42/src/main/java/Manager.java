import java.util.List;

public class Manager extends User{
    
    // private class attributes
    private String managerUsername;

    // class methods
    // TODO: Implement class methods

    // resolved enquiries from users
    public void resolveEnquiries(Enquiry[] enquiries){
        for(Enquiry enquiry: enquiries){
            enquiry.resolveEnquiry();
        }
    }

    // create new course
    public Course createCourse(){
        Course newCourse = new Course();
        newCourse.setCourseDetails(0, "Economics", "Markets and such.", 4);
        return newCourse;
    }
}
