public class EmailNotifier implements Notifier {

    //attributer

    private String recipient;

    //constructor

    public EmailNotifier(String recipient){
        this.recipient = recipient;
    }

    //metoder implemtere og bruger send

    public void send(User user, String message) {
    if (user.hasEmail) {
        System.out.println("Kære " + user.userName + " Du har fået mail: " + message);
        }
    }
}
