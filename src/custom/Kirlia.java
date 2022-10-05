package custom.pokemon;

import ru.ifmo.se.pokemon.*;
import custom.pokemon.Ralts;
import custom.pokemon.Attacks.Charm;

public class Kirlia extends Ralts {
    public Kirlia(String name, int level) {
        super(name, level);
        this.setStats(38, 35, 35, 65, 55, 50);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.addMove(
            new Charm()
        );
    }
}

