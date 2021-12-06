package buildPattern01;

public class LgGramBluePrint extends BluePrint {

    private Computer computer;

    public LgGramBluePrint() {
        computer = new Computer("default", "default", "default");
    }

    @Override
    void setCpu() {
        computer.setCpu("i9");
    }

    @Override
    void setRam() {
        computer.setRam("16G");
    }

    @Override
    void setStorage() {
        computer.setStorage("256G SSD");
    }

    @Override
    Computer getComputer() {
        return computer;
    }

}
