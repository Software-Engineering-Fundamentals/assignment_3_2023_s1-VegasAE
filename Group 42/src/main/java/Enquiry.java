public class Enquiry {

    // private class attributes
    protected String enquiryId;
    protected User user;
    protected String enquiry;
    protected boolean isResolved;

    // Constructor
    public Enquiry(User user, String enquiry){
        isResolved = false;
        this.user = user;
        this.enquiry = enquiry;
    }

    // class methods

    // view what the enquiry is about
    public String getEnquiry(){
        return enquiry;
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
