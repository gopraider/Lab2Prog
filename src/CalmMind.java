import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.PhysicalMove;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Stat;

public class CalmMind extends PhysicalMove {
    public CalmMind(){

    }
    @Override
    protected String describe(){
        return "Использует атаку CalmMind";
    }
    @Override
    protected void applySelfEffects(Pokemon p) {
        Effect e =new Effect().chance(1).turns(1).stat(Stat.SPECIAL_ATTACK, +1);
        p.addEffect(e);
        Effect e1 =new Effect().chance(1).turns(1).stat(Stat.SPECIAL_DEFENSE, +1);
        p.addEffect(e1);
    }
}
