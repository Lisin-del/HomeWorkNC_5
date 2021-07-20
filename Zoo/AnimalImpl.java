package Zoo;

public class AnimalImpl implements Animal {
    private String name;
    private Species species;

    public AnimalImpl(String name, Species species) {
        this.name = name;
        this.species = species;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public Species getSpecies() {
        return null;
    }
}
