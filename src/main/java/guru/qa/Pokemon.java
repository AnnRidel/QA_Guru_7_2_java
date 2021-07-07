package guru.qa;

public class Pokemon {

    static String numberOfPokemon = "898";
    String type;
    String abilities;
    boolean isСaught;
    int pokedexNumber;
    String height;
    String weight;

    public Pokemon(String type, String abilities, int pokedexNumber, String height, String weight, boolean isСaught) {
        this.type = type;
        this.abilities = abilities;
        this.pokedexNumber = pokedexNumber;
        this.height = height;
        this.weight = weight;
        this.isСaught = isСaught;
    }

    public Pokemon() {
    }

    String getType() {
        return type;
    }

    String getAbilities() {
        return abilities;
    }

    void setPokedexNumber (int pokedexNumber) {
        this.pokedexNumber = pokedexNumber;
    }

    String getHeight() {
        return height;
    }

    String getWeight() {
        return weight;
    }

    static void sayNumberOfPokemon() {
        System.out.println("Total number of pokemon (for today): " + numberOfPokemon);
    }


}
