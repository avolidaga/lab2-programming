package main.java.folder;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Bite extends PhysicalMove {
    public Bite(){
        super(Type.DARK,60,100);
    }
    @Override
    protected void applyOppEffects(Pokemon def){
        if(Math.random()<0.3){
            Effect.flinch(def);
        }
    }

    @Override
    protected String describe() {
        return "делает удар";
    }
}
