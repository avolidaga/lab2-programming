package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Battle;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon p1 = new Giratina("Harry", 1);
        Pokemon p2 = new Infernape("Hermione", 1);
        Pokemon p3 = new Makuhita("Ron", 1);
        Pokemon p4 = new Monferno("Draco", 1);
        Pokemon p5 = new Hariyama("Voldemort", 1);
        Pokemon p6 = new Chimchar("Bellatrix", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}
