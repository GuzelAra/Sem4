package Warrior;

public class Shield extends Protection {

    private String name;

    public Shield(int durability, String name) {
        super(durability);
        this.name = "Shield";
    }

    @Override
    public int damage() {
        return 5;
    }

    @Override
    public String toString() {
        return "Shield{" +
                "name='" + name +
                super.toString() +   //   вызвали родиельский тустринг, чтобы не писать здесь заново
                '}';
    }
}


