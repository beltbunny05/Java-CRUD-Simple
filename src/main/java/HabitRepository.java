import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HabitRepository {
    //read from memory - define Gson var
    Gson gson = new Gson();

    public List<Habito> buscarDados(){

        try(FileReader reader = new FileReader("data.json")){
            return gson.fromJson(reader, new TypeToken<List<Habito>>(){}.getType());
        }catch (IOException e) {
            return new ArrayList<>();
        } //learn return values
        //metodo de buscar tudo (deve ser implementado no começo do codigo? :/


    }

    public void registrarDados(List<Habito> habitos){

        try(FileWriter writer = new FileWriter("data.json"))  {
            gson.toJson(habitos, writer);
        }//toJson usa o parametro do objeto / e oque voce vai fazer com ele
        catch (IOException e) {
            throw new RuntimeException(e);
        }//metodo de registrar tudo
    }

}