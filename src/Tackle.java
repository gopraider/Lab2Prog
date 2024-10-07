import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class Tackle extends SpecialMove {
    public Tackle(){
        super(Type.PSYCHIC, 40, 100);
    }

    @Override
    protected String describe(){
        return "использует атаку Tackle";
    }
}
