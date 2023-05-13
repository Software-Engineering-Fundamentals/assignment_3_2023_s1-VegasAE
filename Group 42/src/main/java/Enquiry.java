public class Enquiry {

    // private class methods
    protected String enquiryId;
    protected String userId;
    protected String enquiry;
    protected boolean resolved;

    // class methods
    // TODO: Implement class methods

    // view what the enquiry is about
    public void viewEnquiry(){

    }

    // track the progress of a enquiry
    public boolean trackEnquiry(){
        return resolved;
    }
    
    // resolve / close an enquiry
    public void resolveEnquiry(){
        this.resolved = true;
    }
}
