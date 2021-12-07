package observer;

public class Application {

    public static void main(String[] args) {
        Button button = new Button();
        button.setOnClickListener(button1 -> System.out.printf("%s is Clicked", button1));
        button.onClick();
    }

}
