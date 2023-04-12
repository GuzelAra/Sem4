package Warrior;

public class Main {
    public static void main(String[] args) {
        Team<Archer> archers = new Team<>();
        Team<Knight> knights = new Team<>();
        archers.addPersons(new Archer("Robin", 100, new Bow(20)))
                .addPersons(new Archer("Bobin", 100, new Bow(15)));
        knights.addPersons(new Knight("John", 150, new Knife()))
                .addPersons(new Knight("Adam", 150, new Knife()));
//        Archer archer1 = new Archer("Robin", 100, new Bow(20));
//        Archer archer2 = new Archer("Bobin", 100, new Bow(15));
        Knight knight1 = new Knight("John", 150, new Knife());
        Knight knight2 = new Knight("Adam", 150, new Knife());
        Battle fight = new Battle(knight1, knight2);
        fight.run();
    }
}
