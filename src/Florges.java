public class Florges extends Floette{
    public Florges(String name, int lvl){
        super(name,lvl);
        this.setStats(78,65,68,112,154,75);
        this.addMove(new PetalBlizzard());
    }
}