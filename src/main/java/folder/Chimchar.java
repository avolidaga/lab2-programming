package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Chimchar extends Pokemon {
    public Chimchar() {
        super();
        addType(Type.FIRE);
        setStats(44, 58, 44, 58, 44, 61);
        setMove(new Swagger(), new IceBeam());
    }

    public Chimchar(String name, int level) {
        super(name, level);
        addType(Type.FIRE);
        setStats(44, 58, 44, 58, 44, 61);
        setMove(new Swagger(), new IceBeam());
    }
}
