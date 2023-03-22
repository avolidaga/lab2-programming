package main.java.folder;

import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Status;
import ru.ifmo.se.pokemon.Type;

public class Venoshock extends SpecialMove {
    public Venoshock(){
        super(Type.POISON,65,100);
    }
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        return super.calcBaseDamage(att, def) * (def.getCondition() == Status.POISON ? 2 : 1);
    }

    @Override
    protected String describe() {
        return "использует атаку Venoshock";
    }
}
