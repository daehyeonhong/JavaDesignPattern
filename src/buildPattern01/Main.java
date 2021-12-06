package buildPattern01;

public class Main {

    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        factory.setBlueprint(new LgGramBluePrint());
//        factory.setBlueprint(new MacProBlueprint());
//        factory.setBlueprint(new SonyVaioBlueprint());
        factory.make();
        Computer computer = factory.getComputer();

//        Computer computer = new Computer("i9", "32", "256G SSD");

        System.out.println("computer = " + computer);
    }

}
