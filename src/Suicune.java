import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Suicune extends Pokemon {
    public Suicune(String name, int lvl){
        super(name, lvl);
        this.setType(Type.WATER);
        this.setStats(100,75,115,90,115,85);
        super.addMove(new Scald());
        super.addMove(new AuroraBeam());
        super.addMove(new BubbleBeam());
        super.addMove(new CalmMind());
    }
}
