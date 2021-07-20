package Zoo;

public class AnimalImpl implements Animal {
    private Species species;
    private String name;

    public AnimalImpl(Species species, String name) {
        this.species = species;
        this.name = name;
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
