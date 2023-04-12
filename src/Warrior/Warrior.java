package Warrior;

import java.util.Random;

public class Warrior<T extends Weapon> extends Person { //   обобщили д типа оружия
    protected T weapon; //    протектед позволяет модифицировать в наследниках
    protected static Random rand = new Random(); //  рандом б опр нанесен урон или нет, относится ко всем воинам
    public Warrior(String name, int hp, T weapon) {
        super(name, hp);
        this.weapon = weapon;
    }
    public int harm() {  // будет определять нанесен урон или нет
        boolean isHit = rand.nextBoolean(); // возвращает слчайное булевское значение
        int damage = 0; // если урона нет, дэмэдж = ноль
        if(isHit) {   // если дэмэдж есть, то мы присваимваем следующее случайное значение урона
            damage = rand.nextInt(weapon.damage()+1); // +1чтобы достичб макс знач, иначе б на 1 меньше
        }
        return damage;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                " name = " + getName() +
                " hp = " + getHp() +
                " weapon=" + weapon +
                '}';
    }
}
