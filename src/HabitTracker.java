import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HabitTracker {
    static void main(String[] args) {
        System.out.println("HabitTracker");
        Scanner input = new Scanner(System.in);

        List<Habito> habitos = new ArrayList<Habito>();//baby i dont undestand this obama sandwich

        while(!input.next().equals("stop")){
            //imports

            System.out.println("Digite 1 para criar um habito");
            System.out.println("Digite 2 para ver seus habitos"); // for loop para cada habito que existir
            System.out.println("Digite 3 para apagar um habito"); // excluir o habito da memoria


            switch (input.next()) {
                case "1":
                    Habito habito = new Habito();
                    System.out.println("Novo habito: ");
                    String novoNome = input.next();
                    habito.setNome(novoNome);

                    habitos.add(habito);


                    System.out.println("Seu habito é: " + habito.getNome());
                    System.out.println("Seu recorde é de: " + habito.getRecorde() + " dias.");
                    break;

                case "2":
                    System.out.println(".");
                    break;

                case "3":
                    System.out.println("..");
                    break;
            }
        }
        input.close();
    }

}
