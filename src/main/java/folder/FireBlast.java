package main.java.folder;

import ru.ifmo.se.pokemon.*;

public class FireBlast extends SpecialMove {
    public FireBlast() {
        super(Type.FIRE, 120, 85);
    }

    @Override
    protected void applyOppEffects(Pokemon def) {
        if (Math.random() < 0.1) {
            Effect.burn(def);
        }
    }

    @Override
    protected String describe() {
        return "поражает противника огнем";
    }
}