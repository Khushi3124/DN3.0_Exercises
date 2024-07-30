public class EmailNotifier implements Notifier{

    @Override
    public String send() {
        return "Notification has been sent via Email channel";
    }
}
