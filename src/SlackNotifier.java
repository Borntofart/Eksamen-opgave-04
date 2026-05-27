public class SlackNotifier implements Notifier {

    //atributer
    private String channel;

    //constructor
    public SlackNotifier(String channel) {
        this.channel = channel;

    }


    //metoder
    public void send(User user, String message) {
        if (user.hasSlack) {
            System.out.println("Kære " + user.userName +" Du har fået en meddelse: " + message);
        }
    }
}
