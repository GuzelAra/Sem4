package Warrior;

public class Knight extends Warrior<Knife> {
    public Knight(String name, int hp, Knife weapon) {
        super(name, hp, weapon);
    }

    public int getRage() {
        return rand.nextInt(weapon.getDurability()+1);
    }

    @Override
    public String toString() {
        return "Knight{" +
                super.toString()+
                '}';
    }
}
