package Decorator.main;

import Decorator.abst.Beverage;
import Decorator.concrete.Base;
import Decorator.concrete.Espresso;
import Decorator.concrete.Milk;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // base
        Beverage beverage = new Base();
        boolean done = false;
        while (!done) {
            System.out.printf("음료 현재 가격 : %d\n", beverage.getTotalPrice());
            System.out.print("선택 : 1:샷 추가 / 2:우유 추가");
            switch (scanner.nextInt()) {
                case 1:
                    beverage = new Espresso(beverage);
                    break;
                case 2:
                    beverage = new Milk(beverage);
                    break;
                default:
                    done = true;
            }
        }

        System.out.printf("음로 갸격 : %d", beverage.getTotalPrice());
        scanner.close();
    }

}
