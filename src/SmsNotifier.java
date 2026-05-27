public class SmsNotifier implements Notifier {

    //attributer

    private String recipient;

    //constructor

    public SmsNotifier(String recipient){
        this.recipient = recipient;
    }

    public void send(User user, String message){
        if (user.hasSms && message.length() < 160 ) {
            System.out.println("Kære " + user.userName + " Du har fået en besked: " + message );
        }
    }
}
