package main.java.folder;

public class Infernape extends Monferno {
    public Infernape(){
        super();
        setStats(76,104,71,104,71,108);
        addMove(new IceShard());
    }
    public Infernape(String name,int level){
        super(name, level);
        setStats(76,104,71,104,71,108);
        addMove(new IceShard());
    }
}
