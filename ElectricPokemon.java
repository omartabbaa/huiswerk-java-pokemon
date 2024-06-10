public class ElectricPokemon extends Pokemon {
    protected ElectricPokemon(String name, int level) {
        super(name, level);
    }

    protected void electroBall() {
        System.out.println(getName() + "Electric Ball !!!");

    }
}
