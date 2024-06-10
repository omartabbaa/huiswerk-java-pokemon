package nl.Pokemon.Types;

import nl.Pokemon.Pokemon;

public class WaterPokemon extends Pokemon {
    public WaterPokemon(String name, int level) {
        super(name, level);


    }

   public void serf() {
       System.out.println(getName() + " Serfing attack !!!");
    }
}

