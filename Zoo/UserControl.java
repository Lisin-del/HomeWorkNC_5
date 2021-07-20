package Zoo;
import java.util.*;


public class UserControl implements Zoo {
    private Scanner in = new Scanner(System.in);
    private String commandUser;

    public void userInput() {
        System.out.println("Enter your command: ");
        commandUser = in.nextLine();


    }




    @Override
    public void checkInAnimal(Animal animal) {

    }

    @Override
    public void checkOutAnimal(Animal animal) {

    }

    @Override
    public List<InhibitionLog> getHistory() {
        return null;
    }
}
