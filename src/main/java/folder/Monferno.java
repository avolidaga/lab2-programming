package main.java.folder;

import ru.ifmo.se.pokemon.Type;

public class Monferno extends Chimchar {
    public Monferno(){
        super();
        addType(Type.FIGHTING);
        setStats(64,78,52,78,52,81);
        addMove(new FireBlast());
    }
    public Monferno(String name,int level){
        super(name,level);
        addType(Type.FIGHTING);
        setStats(64,78,52,78,52,81);
        addMove(new FireBlast());
    }
}
