import java.util.UUID;

public class Habito {
    private String nome;
    private String habitoID;
    private int dias;
    private int recorde;

    public Habito(){
        this.habitoID = UUID.randomUUID().toString();
    }//id unico para novo habito

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setDias(int dias) {
        this.dias = dias;
    }

    public void setRecorde(int recorde){
        this.recorde = recorde;
    }


    public String getNome(){
        return nome;
    }

    public String getHabitoID(){ return habitoID;}

    public int getDias(){
        return dias;
    }

    public int getRecorde(){
        return  recorde;
    }

}