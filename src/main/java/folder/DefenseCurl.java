package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.StatusMove;
import ru.ifmo.se.pokemon.Type;
import ru.ifmo.se.pokemon.Stat;

public class DefenseCurl extends StatusMove {

    public DefenseCurl(){
        super(Type.NORMAL,0,0);
    }

    protected void applySelfEffects(Pokemon att){
        att.setMod(Stat.DEFENSE,(int) att.getStat(Stat.DEFENSE)+1);

    }
    @Override
    protected String describe() {
        return "группируется";
    }
}
