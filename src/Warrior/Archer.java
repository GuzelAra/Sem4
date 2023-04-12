package Warrior;

public class Archer extends Warrior<Throwing> { //   прописали, что оружие именно дальнебойное
    public Archer(String name, int hp, Throwing weapon) {
        super(name, hp, weapon);
    }
    public int getRange() {
        return rand.nextInt(weapon.getDistance()+1);
    }


    @Override
    public String toString() {
        return "Archer{" +
                super.toString()+
                '}';
    }
}
