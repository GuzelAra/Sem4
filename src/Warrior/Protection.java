package Warrior;

public abstract class Protection implements Weapon{
    private int durability;

    public Protection(int durability) {
        this.durability = durability;
    }

    public int getDurability() {
        return durability;
    }

    @Override
    public String toString() {
        return "Protection{" +
                "durability=" + durability +
                "damage= " + damage() +
                '}';
    }
}
