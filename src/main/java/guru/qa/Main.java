package guru.qa;

public class Main {
    public static void main(String[] args) {
        Pokemon vulpix = new Pokemon();
        Pokemon jigglypuff = new Pokemon();
        Pokemon snorlax = new Pokemon("Normal", "Thick Fat, Immunity", 143, "2.1 m", "460.0 kg", false);
        vulpix.weight = "9.9 kg";
        vulpix.height = "0.6 m";
        vulpix.abilities = "Flash Fire";
        vulpix.pokedexNumber = 37;
        vulpix.type = "Fire";
        vulpix.isСaught = true;


        jigglypuff.setPokedexNumber(39);
        jigglypuff.abilities = "Cute Charm, Competitive";
        jigglypuff.weight = "5.5 kg";
        jigglypuff.height = "0.5 m";
        jigglypuff.type = "Normal, Fairy";
        jigglypuff.isСaught = true;


        System.out.println("Jigglypuff's abilities: " + jigglypuff.getAbilities());
        System.out.println("Vulpix's type: " + vulpix.getType());
        System.out.println("Snorlax's weight: " + snorlax.getWeight());
        Pokemon.sayNumberOfPokemon();
    }
}
