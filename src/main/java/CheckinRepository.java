import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CheckinRepository {
    Gson gson = new Gson();

    public List<CheckIn> buscarDados() {

        try (FileReader reader = new FileReader("checkin_data.json")) {
            return gson.fromJson(reader, new TypeToken<List<CheckIn>>() {
            }.getType());
        } catch (IOException e) {
            return new ArrayList<>(); //se nao houver lista no habitos do main ele cria aqui
        }
    }

    public void registrarDados(List<CheckIn> CheckIn){

        try(FileWriter writer = new FileWriter("checkin_data.json"))  {
            gson.toJson(CheckIn, writer);
        }//toJson usa o parametro do objeto / e oque voce vai fazer com ele
        catch (IOException e) {
            throw new RuntimeException(e);
        }//metodo de registrar tudo
    }
}
