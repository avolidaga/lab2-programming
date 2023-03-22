package main.java.folder;

import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Type;

public class WingAttack extends PhysicalMove {
    public WingAttack(){
        super(Type.FLYING,60,100);
    }

    @Override
    protected String describe() {
        return "ударяет крылом Клювокрыла";
    }
}
