package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Giratina extends Pokemon {
    public Giratina() {
        super();
        setType(Type.DRAGON,Type.GHOST);
        setStats(150,100,100,100,120,90);
        setMove(new AirSlash(),new Venoshock(),new Bite(),new WingAttack());
    }

    public Giratina (String name, int level) {
        super(name, level);
        setType(Type.DRAGON,Type.GHOST);
        setStats(150,100,100,100,120,90);
        setMove(new AirSlash(),new Venoshock(),new Bite(),new WingAttack());
    }
}
