package custom.pokemon;

import ru.ifmo.se.pokemon.*;
import custom.pokemon.Attacks.DreamEater;
import custom.pokemon.Attacks.HealPulse;

public class Ralts extends Pokemon {
    public Ralts(String name, int level) {
        super(name, level);
        this.setStats(28, 25, 25, 45, 35, 40);
        this.setType(Type.PSYCHIC, Type.FAIRY);
        this.setMove(
            new DreamEater(),
            new HealPulse()
        );
    }
}