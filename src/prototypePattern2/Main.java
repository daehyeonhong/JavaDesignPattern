package prototypePattern2;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Dog choco = new Dog();
        choco.setName("choco");
        choco.setAge(new Age(2021, 1));

        Dog blue = choco.copy();
        blue.setName("blue");
        blue.getAge().setYear(2013);
        blue.getAge().setValue(2);

        System.out.println(choco.getName());
        System.out.println(choco.getAge().getYear());
        System.out.println(choco.getAge().getValue());

        System.out.println(blue.getName());
        System.out.println(blue.getAge().getYear());
        System.out.println(blue.getAge().getValue());
    }

}
