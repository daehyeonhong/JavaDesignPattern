package partTwo;

public class Armor implements Defense {

    private Defense nextDefence;

    private int def;

    public Armor(int def) {
        this.def = def;
    }

    @Override
    public void defense(Attack attack) {
        /**
         * Point!
         */
        process(attack);
        if (nextDefence != null)
            nextDefence.defense(attack);
    }

    private void process(Attack attack) {
        int amount = attack.getAmount();
        amount -= def;
        attack.setAmount(amount);
    }

    public void setNextDefence(Defense nextDefence) {
        this.nextDefence = nextDefence;
    }

}
