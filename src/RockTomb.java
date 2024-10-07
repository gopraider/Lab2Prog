import ru.ifmo.se.pokemon.*;

public class RockTomb extends PhysicalMove {
    public RockTomb(){
        super(Type.ROCK, 60,95);
    }
    @Override
    protected String describe(){
        return "Использует атаку Rock Tomb";
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(1).stat(Stat.SPEED, -1));
    }
}
