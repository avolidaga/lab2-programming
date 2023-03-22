package main.java.folder;

import ru.ifmo.se.pokemon.*;

public class IceBeam extends SpecialMove {
    public IceBeam(){
        super(Type.ICE,95,100);
    }
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<0.1){
            Effect.freeze(def);
        }
    }
    @Override
    protected String describe() {
        return "атакует ледяной бомбой";
    }
}
