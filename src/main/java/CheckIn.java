import java.time.LocalDate;
import java.util.UUID;

public class CheckIn {

    String habitoID;
    LocalDate data;

    public CheckIn(String habitoID, LocalDate data) {
        this.habitoID = habitoID;
        this.data = data;
    }
}