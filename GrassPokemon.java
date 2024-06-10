public class GrassPokemon extends Pokemon {

    protected GrassPokemon(String name, int level) {
        super(name, level);
    }

    protected void leafStorm() {
        System.out.println(getName() + "LeafStorm attack !!!");
    }
}
