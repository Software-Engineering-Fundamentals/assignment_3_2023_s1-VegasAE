public class Enquiry {

    // private class attributes
    protected String enquiryId;
    protected User user;
    protected String enquiry;
    protected boolean isResolved;

    // Constructor
    public Enquiry(String enquiryID, User user, String enquiry){
        isResolved = false;
    }

    // class methods

    // view what the enquiry is about
    public void printEnquiry(){
        System.out.println(enquiry);
    }

    // track the progress of a enquiry (return resolved status)
    public boolean trackEnquiry(){
        return isResolved;
    }
    
    // resolve close an enquiry
    public void resolveEnquiry(){
        this.isResolved = true;
    }
}
