package Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Animal leon = new AnimalImpl("Vasiliy", Species.LEON);
        Animal giraffe = new AnimalImpl("Tolik", Species.GIRAFFE);
        Animal squirrel = new AnimalImpl("Galina", Species.SQUIRREL);
        Animal penguin = new AnimalImpl("Maxim", Species.PENGUIN);

        List<Species> isAvailableFor = new ArrayList<>();

        Condition condition = new ConditionImpl(isAvailableFor);
        condition.isAvailableFor().add(Species.LEON);
        CageImpl cageForLeon = new CageImpl(1, 100.00, condition, true);
        System.out.println(cageForLeon.getCondition().isAvailableFor());

    }
}
