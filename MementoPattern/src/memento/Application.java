package memento;

import java.util.Stack;

public class Application {

    public static void main(String[] args) {

        Stack<Memento> mementos = new Stack<>();

        Originator originator = new Originator();

        originator.setState("StateOne");
        mementos.push(originator.createMemento());
        originator.setState("StateTwo");
        mementos.push(originator.createMemento());
        originator.setState("StateThree");
        mementos.push(originator.createMemento());
        originator.setState("StateFinal");
        mementos.push(originator.createMemento());

        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());
        originator.restoreMemento(mementos.pop());
        System.out.println(originator.getState());

    }

}
