public class SlackNotifierDecorator extends NotifierDecorator{

    public SlackNotifierDecorator(Notifier decoratedNotifier){
        super(decoratedNotifier);
    }

    @Override
    public String send() {
      return decoratedNotifier.send() + " and Slack channel";
    }
}
