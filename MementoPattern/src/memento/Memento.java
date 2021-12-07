package memento;

public class Memento {

    private String state;

    protected Memento(String state) {
        this.state = state;
    }

    protected String getState() {
        return state;
    }

}
