import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Crabrawler extends Pokemon {
    public Crabrawler(String name, int lvl){
        super(name, lvl);
        this.setType(Type.FIGHTING);
        this.setStats(47,82,57,42,47,63);
        super.addMove(new RockTomb());
        super.addMove(new StoneEdge());
        super.addMove(new DynamicPunch());


    }
}
