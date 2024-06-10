package nl.Pokemon.Types;

import nl.Pokemon.Pokemon;

public class FirePokemon extends Pokemon {
    public FirePokemon(String name, int level) {
        super(name, level);
    }

 public void inferno() {
     System.out.println(getName() + "Inferno attack !!!");}
}
