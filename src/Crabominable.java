import ru.ifmo.se.pokemon.Type;

public class Crabominable extends Crabrawler{
    public Crabominable(String name, int lvl){
        super(name, lvl);
        this.setType(Type.ICE);
        this.setStats(97,132,77,62,67,43);
        super.addMove(new Blizzard());

    }
}
