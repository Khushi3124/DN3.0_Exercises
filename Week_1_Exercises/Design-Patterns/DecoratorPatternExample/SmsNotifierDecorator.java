public class SmsNotifierDecorator extends NotifierDecorator{

    public SmsNotifierDecorator(Notifier decoratedNotifier){
        super(decoratedNotifier);
    }

    @Override
    public String send() {
        return decoratedNotifier.send() + " and SMS channel";
    }
}
