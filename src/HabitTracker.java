import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HabitTracker {
    static void main(String[] args) {

        System.out.println("HabitTracker");
        System.out.println("Press any button to continue:");

        Scanner input = new Scanner(System.in);//input setup

        List<Habito> habitos = new ArrayList<Habito>();//baby i dont undestand this obama sandwich
        //jk i got it


        while(!input.next().equals("stop")){
            //imports

            System.out.println("Digite 1 para criar um habito");
            System.out.println("Digite 2 para ver seus habitos"); // for loop para cada habito que existir
            System.out.println("Digite 3 para apagar um habito"); // excluir o habito da memoria
            System.out.println("Digite 4 para check-in");
            System.out.println("Digite 5 para mudar o nome do seu habito");


            switch (input.next()) {
                case "1":
                    System.out.println("Novo habito: ");
                    String novoNome = input.next();

                    Habito habito = new Habito();

                    habito.setNome(novoNome);

                    habitos.add(habito);

                    System.out.println("Seu habito é: " + habito.getNome());
                    System.out.println("Seu recorde é de: " + habito.getRecorde() + " dias.");
                    break;

                case "2":
                    // var pegar o array e atribuir o getNome de cada um

                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.println(habitos.get(i).getNome());
                    }

                    break;

                case "3":
                    System.out.println("Escolha um habito para apagar:");

                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.println(habitos.get(i).getNome());
                    }

                    int pegarIndex = input.nextInt();

                    habitos.remove(pegarIndex - 1);

                    break;

                case "4":

                    System.out.println("...");

                    break;

                case "5":
                    System.out.println("Escolha um habito para editar:");

                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.println(habitos.get(i).getNome());
                    }

                    int pegarIndex = input.nextInt();



                    habitos.

            }
        }
        input.close();
    }

}
