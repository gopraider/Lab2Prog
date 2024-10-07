import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Flabebe extends Pokemon {
    public Flabebe(String name, int lvl){
        super(name,lvl);
        this.setType(Type.FAIRY);
        this.setStats(44,38,39,61,79,42);
        this.addMove(new CalmMind());
        this.addMove(new EnergyBall());
    }
}
