package Zoo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Condition conditionForCageOne = new ConditionImpl(Species.LEON);
        Condition conditionForCageTwo = new ConditionImpl(Species.GIRAFFE);
        Condition conditionForCageThree = new ConditionImpl(Species.SQUIRREL);
        Condition conditionForCageFour = new ConditionImpl(Species.PENGUIN);

        Cage cageOne = new CageImpl(1, 12.0, conditionForCageOne, true);
        Cage cageTwo = new CageImpl(2, 150.0, conditionForCageTwo, true);
        Cage cageThree = new CageImpl(3, 10.0, conditionForCageThree, true);
        Cage cageFour = new CageImpl(4, 100.0, conditionForCageFour, true);

        String testString = "check-in Leon Leo";
        String m[];
        String p = " ";
        m = testString.split(p);
        for(String s : m) {
            System.out.println(s);
        }

    }
}
