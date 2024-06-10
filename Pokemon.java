public class Pokemon {
    String name;
    int level;


    protected Pokemon (String name, int level) {
        this.name = name;
        this.level = level;

    }

    protected void eat () {
        System.out.println(name + " is eating.");

    }

    protected void sleeping () {
        System.out.println(name + " is sleeping.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }



}




