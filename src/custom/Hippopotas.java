package custom.pokemon;

import ru.ifmo.se.pokemon.*;
import custom.pokemon.Attacks.Crunch;
import custom.pokemon.Attacks.SandAttack;
import custom.pokemon.Attacks.TakeDown;

public class Hippopotas extends Pokemon {
    public Hippopotas(String name, int level) {
        super(name, level);
        this.setStats(68, 72, 78, 38, 42, 32);
        this.setType(Type.GROUND);
        this.setMove(
            new Crunch(),
            new SandAttack(),
            new TakeDown()
        );
    }
}