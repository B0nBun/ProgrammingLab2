package custom.pokemon;

import ru.ifmo.se.pokemon.*;
import custom.pokemon.Kirlia;
import custom.pokemon.Attacks.Facade;


public class Gardevoir extends Kirlia {
    public Gardevoir(String name, int level) {
        super(name, level);
        this.setStats(68, 65, 65, 125, 115, 80);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.addMove(
            new Facade()
        );
    }
}