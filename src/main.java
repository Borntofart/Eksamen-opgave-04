import java.util.ArrayList;
import java.util.List;

public class main {


    public static void main (String[] arg){
        //opretter en bruger som kan blive notifeieret
    User user1 = new User ("Lucas", true, true, true);
    User user2 = new User ("Peter", true, true, true);
    //opretter Slack kanelen som kan blive notiferiet
    SlackNotifier channel1 = new SlackNotifier ("Team IT");
    //opretter slack meddelse så man kan notified
    //user 1 har nu slack
    channel1.send( user1,"Der er en besked i din Slack kanal: " + "Hej Team pga. jeg har fødselsdag har jeg købt kage med :)");


    //opretter mailen
    EmailNotifier email = new EmailNotifier("Lucas");
    //sender til user 1 som er lucas
    email.send(user1, "Din pakke er her");

    //opretter sms'en
    SmsNotifier sms = new SmsNotifier("Lucas");
    //sender til user 1 som er lucas
    sms.send(user1, "Hey bro hvordan går det med eksamen?");


    //lægger dem i en liste
    List<Notifier> notifiers = new ArrayList<>();
    notifiers.add(email);
    notifiers.add(sms);
    notifiers.add(channel1);

    //kald notify all for brugern
    notifyAll(notifiers, user1, "");


    }
    //laver notify all metode
    public static void notifyAll(List<Notifier> notifiers, User user, String message) {
        for (Notifier notifier : notifiers) {
            notifier.send(user, message);

        }
    }
}
