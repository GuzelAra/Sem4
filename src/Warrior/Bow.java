package Warrior;

public class Bow extends Throwing {
    private String name;

    public Bow(int distance) {
        super(distance);
        this.name = "Bow";
    }

    @Override
    public int damage() {
        return 10; //   задали базовый урон от лука- 10
    }

    @Override
    public String toString() {
        return "Bow{" +
                "name='" + name +
                super.toString() +   //   вызвали родиельский тустринг, чтобы не писать здесь заново
                '}';
    }
}
