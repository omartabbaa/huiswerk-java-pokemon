package nl.Pokemon.Types;

import nl.Pokemon.Pokemon;

public class ElectricPokemon extends Pokemon {
    public ElectricPokemon(String name, int level) {
        super(name, level);
    }

    public void electroBall() {
        System.out.println(getName() + "Electric Ball !!!");

    }
}
