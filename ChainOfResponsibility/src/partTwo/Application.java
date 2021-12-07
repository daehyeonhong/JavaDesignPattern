package partTwo;

public class Application {

    public static void main(String[] args) {
        Attack attack = new Attack(100);

        Armor chestPlate = new Armor(10);
        Armor helmet = new Armor(15);

        chestPlate.setNextDefence(helmet);
        // 첫번째 공격
        chestPlate.defense(attack);

        System.out.println(attack.getAmount());

        /**
         * Point2
         */
        Defense shield = attack1 -> attack1.setAmount(attack1.getAmount() - 50);

        helmet.setNextDefence(shield);
        attack.setAmount(100);
        // 두번째 공격
        chestPlate.defense(attack);
        System.out.println(attack.getAmount());
    }

}
