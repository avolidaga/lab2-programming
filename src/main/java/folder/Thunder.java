package main.java.folder;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;

public class Thunder extends StatusMove {
    public Thunder(){
        super(Type.ELECTRIC,120,70);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<0.3){
            Effect.paralyze(def);
        }
    }

    @Override
    protected String describe() {
        return "парализует противника";
    }
}
