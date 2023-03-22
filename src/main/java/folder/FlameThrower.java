package main.java.folder;

import ru.ifmo.se.pokemon.*;

public class FlameThrower extends SpecialMove {
    public FlameThrower(){
        super(Type.FIRE,95,100);
    }
    @Override
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<0.1){
            Effect.burn(def);
        }
    }

    @Override
    protected String describe() {
        return "щелкает предохранителем огнемета";
    }
}
