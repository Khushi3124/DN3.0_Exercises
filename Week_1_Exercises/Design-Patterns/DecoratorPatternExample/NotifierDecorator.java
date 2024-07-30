public abstract class NotifierDecorator implements Notifier{
    protected Notifier decoratedNotifier;

    public NotifierDecorator(Notifier decoratedNotifier){
       this.decoratedNotifier = decoratedNotifier;
    }

    @Override
    public String send() {
      return decoratedNotifier.send();
    }
}