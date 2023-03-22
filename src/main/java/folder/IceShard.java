package main.java.folder;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class IceShard extends PhysicalMove {

    public IceShard(){
        super(Type.ICE,40,100);
        priority=1;
    }

    @Override
    protected String describe() {
        return "использует IceShard";
    }
}
