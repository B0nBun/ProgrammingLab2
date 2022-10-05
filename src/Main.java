import java.util.Arrays;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;
import custom.pokemon.*;

// TODO?: Add final to methods
public class Main {
	public static void main(String[] args) {
		Battle b = new Battle();
		
		b.addAlly(new Sawk("Sawk", 1));
		b.addAlly(new Hippopotas("Hippopotas", 1));
		b.addAlly(new Kirlia("Kirlia", 1));
		
		b.addFoe(new Hippowdon("Hippowdon", 1));
		b.addFoe(new Gardevoir("Gardevoir", 1));
		b.addFoe(new Ralts("Ralts", 1));

		b.go();
	}
}
