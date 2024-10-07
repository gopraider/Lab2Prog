public class Floette extends Flabebe{
    public Floette(String name, int lvl){
        super(name,lvl);
        this.setStats(54,45,47,75,98,52);
        this.addMove(new Tackle());
    }
}