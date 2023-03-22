package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Makuhita extends Pokemon {
    public Makuhita(){
        super();
        addType(Type.FIGHTING);
        setStats(72,60,30,20,30,25);
        setMove(new FlameThrower(),new Thunder(),new ShadowBall());
    }

    public Makuhita(String name, int level){
        super(name,level);
        addType(Type.FIGHTING);
        setStats(72,60,30,20,30,25);
        setMove(new FlameThrower(),new Thunder(),new ShadowBall());
    }

}
