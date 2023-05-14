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
    public void printCourseDetails(){
        System.out.println("Course title: " + title);
        System.out.println("ID: " + courseId);
        System.out.println("Description: " + description);
        System.out.println("Duration: " + durationInWeeks + " weeks");
        
    }

    // set the details of a course
    public void setCourseDetails(int courseId, String title, String description, int durationInWeeks){
        this.courseId = courseId;
        this.title = title;
        this.description = description;
        this.durationInWeeks = durationInWeeks;
    }
    
}
