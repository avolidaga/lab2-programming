package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Stat;
import ru.ifmo.se.pokemon.Type;

public class ShadowBall extends SpecialMove{
    public ShadowBall(){
        super(Type.GHOST,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if(Math.random()<0.2){
            def.setMod(Stat.SPECIAL_DEFENSE,(int) def.getStat(Stat.SPECIAL_DEFENSE)-1);
        }
    }

    @Override
    protected String describe() {
        return "метает в противника дементора";
    }
}
