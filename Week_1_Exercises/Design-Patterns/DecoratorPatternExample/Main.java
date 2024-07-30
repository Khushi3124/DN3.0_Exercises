public class Main {
    public static void main(String[] args) {
        EmailNotifier emailNotifier = new EmailNotifier();
        System.out.println(emailNotifier.send());

        Notifier smsNotifier = new SmsNotifierDecorator(new EmailNotifier());
        System.out.println(smsNotifier.send());

        Notifier slackNotifier = new SlackNotifierDecorator(new EmailNotifier());
        System.out.println(slackNotifier.send());
    }
}
