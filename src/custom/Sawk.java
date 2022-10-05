package custom.pokemon;

import ru.ifmo.se.pokemon.*;
import custom.pokemon.Attacks.Facade;
import custom.pokemon.Attacks.RockTomb;
import custom.pokemon.Attacks.RockSlide;
import custom.pokemon.Attacks.DoubleTeam;


public class Sawk extends Pokemon {
    public Sawk(String name, int level) {
        super(name, level);
        this.setStats(75, 125, 75, 30, 75, 85);
        this.setType(Type.FIGHTING);
        this.setMove(
            new Facade(),
            new RockTomb(),
            new RockSlide(),
            new DoubleTeam()
        );
    }
}