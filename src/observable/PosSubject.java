package observable;

import java.util.ArrayList;
import java.util.List;

public class PosSubject {
    private List<PosObserver> observers = new ArrayList<PosObserver>();
    private Book book;

    public void addBook(Book book) {
        this.book = book;
        notifyAllObservers();
    }

    public Book getBook() {
        return book;
    }

    public void attach(PosObserver observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (PosObserver observer : observers) {
            observer.update();
        }
    }
}
