import ru.ifmo.se.pokemon.*;

public class BubbleBeam extends SpecialMove {
    public BubbleBeam(){
        super(Type.ICE, 65,100);
    }
    @Override
    protected String describe(){
        return "Использует атаку BubbleBeam";
    }
    @Override
    protected void applyOppEffects(Pokemon p) {
        Effect e =new Effect().chance(0.10).turns(1).stat(Stat.SPEED, -1);
        p.addEffect(e);
    }
}