import ru.ifmo.se.pokemon.*;

public class EnergyBall extends SpecialMove {
    public EnergyBall(){
        super(Type.GRASS, 90,100);
    }
    @Override
    protected String describe(){
        return "Использует атаку Energy Ball";
    }

    @Override
    protected void applyOppEffects(Pokemon pokemon) {
        pokemon.addEffect(new Effect().chance(0.1).stat(Stat.SPECIAL_DEFENSE,-1));
    }
}