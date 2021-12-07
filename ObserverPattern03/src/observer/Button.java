package observer;

public class Button {

    public Button() {
        observable = new Observable<>();
    }

    private Observable<String> observable;

    public void addObserver(Observable.Observer<String> observer) {
        observable.addObserver(observer);
    }

    public void notifyObservers() {
        observable.notifyObservers(null);
    }

    public void onClick() {
        observable.setChanged();
        notifyObservers();
    }

}
