public class User {

    //attributes
    String userName;
    boolean hasEmail;
    boolean hasSms;
    boolean hasSlack;

    public User(String userName, boolean hasEmail, boolean hasSms, boolean hasSlack) {
        this.userName = userName;
        this.hasEmail = hasEmail;
        this.hasSms = hasSms;
        this.hasSlack = hasSlack;
    }


}
