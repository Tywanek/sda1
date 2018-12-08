package observable;

public abstract class PosObserver {
    protected PosSubject posSubject;
    abstract void update();
}
