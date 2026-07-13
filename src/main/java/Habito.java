public class Habito {
    private String nome;
    private int dias;
    private int recorde;

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

    public int getDias(){
        return dias;
    }

    public int getRecorde(){
        return  recorde;
    }
}