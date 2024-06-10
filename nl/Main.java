package nl;

import nl.Pokemon.Types.ElectricPokemon;
import nl.Pokemon.Types.FirePokemon;
import nl.Pokemon.Types.GrassPokemon;
import nl.Pokemon.Types.WaterPokemon;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");

        ElectricPokemon pikachu = new ElectricPokemon( "pikachu" , 4);
        FirePokemon ccharmander = new FirePokemon( "ccharmander" , 5);
        GrassPokemon leafStorm = new GrassPokemon( "leafStorm" , 6);
        WaterPokemon Blastoise = new WaterPokemon( "Blastoise" , 7);


        Blastoise.serf();
        leafStorm.leafStorm();
        ccharmander.inferno();
        pikachu.eat();
        pikachu.electroBall();
    }
}


