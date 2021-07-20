import Zoo.Animal;
import java.util.List;

public interface Zoo {
    void checkInAnimal(Animal animal);
    void checkOutAnimal(Animal animal);
    List<InhibitionLog> getHistory();
}
