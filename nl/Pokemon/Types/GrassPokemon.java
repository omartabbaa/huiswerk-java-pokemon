package nl.Pokemon.Types;

import nl.Pokemon.Pokemon;

public class GrassPokemon extends Pokemon {

    public GrassPokemon(String name, int level) {
        super(name, level);
    }

    public void leafStorm() {
        System.out.println(getName() + "LeafStorm attack !!!");
    }
}
