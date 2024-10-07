import ru.ifmo.se.pokemon.*;

public class AuroraBeam extends SpecialMove {
    public AuroraBeam(){
        super(Type.ICE, 65,100);
    }
    @Override
    protected String describe(){
        return "Использует атаку AuroraBeam";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e =new Effect().chance(0.10).turns(1).stat(Stat.ATTACK, -1);
        p.addEffect(e);
    }
}