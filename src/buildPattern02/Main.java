package buildPattern02;

import buildPattern01.Computer;

public class Main {

    public static void main(String[] args) {
//        Computer computer= new Computer("", "", "");
        Computer computer = ComputerBuilder
                .start()
                .setCpu("i9")
                .setRam("32G")
                .setStorage("256G SSD")
                .build();

        System.out.println("computer = " + computer);
    }

}
