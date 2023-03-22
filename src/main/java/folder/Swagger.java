package main.java.folder;

import ru.ifmo.se.pokemon.*;

public class Swagger extends StatusMove {
    public Swagger(){
        super(Type.NORMAL,0,90);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        def.setMod(Stat.ATTACK,(int) def.getStat(Stat.ATTACK)+2);
        Effect.confuse(def);

    }

    @Override
    protected String describe() {
        return "заставляет противника бить самого себя";
    }
}
