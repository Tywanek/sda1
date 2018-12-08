package observable;

public class DrinksPosObservable extends PosObserver {

    public DrinksPosObservable(PosSubject subject) {
        this.posSubject = subject;
        this.posSubject.attach(this);
    }

    @Override
    void update() {
        if (posSubject.getBook().Age>18)
        System.out.println( "DRink added" );
    }
}
