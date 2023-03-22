package main.java.folder;

public class Hariyama extends Makuhita {
    public Hariyama() {
        super();
        setStats(144,120,60,40,60,50);
        addMove(new DefenseCurl());
    }
    public Hariyama(String name,int level){
        super(name, level);
        setStats(144,120,60,40,60,50);
        addMove(new DefenseCurl());
    }
}
