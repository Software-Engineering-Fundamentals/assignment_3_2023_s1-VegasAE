public class Course {

    // private class attributes
    private int courseId;
    private String title;
    private String description;
    private int durationInWeeks; // TODO: might need to find different type to store this under
    private boolean isOnline;

    // class methods
    // TODO: Implement class methods

    // get the details of a course
    public void getCourseDetails(){

    }

    // set the details of a course
    public void setCourseDetails(int courseId, String title, String description, int duration){
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.durationInWeeks = duration;
    }
    
}
