package custom.pokemon;

import ru.ifmo.se.pokemon.*;
import custom.pokemon.Hippopotas;
import custom.pokemon.Attacks.StoneEdge;

public class Hippowdon extends Hippopotas {
    public Hippowdon(String name, int level) {
        super(name, level);
        this.setStats(108, 112, 118, 68, 72, 47);
        this.setType(Type.GROUND);
        this.addMove(new StoneEdge());
    }
}