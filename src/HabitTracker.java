import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HabitTracker {
    static void main(String[] args) {

        System.out.println("HabitTracker by Tedegas");

        boolean flag = true;

        Scanner input = new Scanner(System.in);//input setup

        List<Habito> habitos = new ArrayList<Habito>();//baby i dont undestand this obama sandwich
        //jk i got it

        int pegarIndex;

        do{
            //imports

            System.out.println("Digite 1 para criar um habito");
            System.out.println("Digite 2 para ver seus habitos"); // for loop para cada habito que existir
            System.out.println("Digite 3 para apagar um habito"); // excluir o habito da memoria
            System.out.println("Digite 4 para check-in");
            System.out.println("Digite 5 para mudar o nome do seu habito");
            System.out.println("Digite 0 para fechar o programa");


            switch (input.nextInt()) {
                case 1:
                    System.out.println("Novo habito: ");
                    String novoNome = input.next();

                    Habito habito = new Habito();

                    habito.setNome(novoNome);

                    habitos.add(habito);

                    System.out.println("Seu habito é: " + habito.getNome());
                    System.out.println("Seu recorde é de: " + habito.getRecorde() + " dias.");
                    break;

                case 2:
                    // var pegar o array e atribuir o getNome de cada um

                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.println((i + 1) + ". " + habitos.get(i).getNome());
                    }

                    break;

                case 3:
                    System.out.println("Escolha um habito para apagar:");

                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.println((i + 1) + ". " + habitos.get(i).getNome());
                    }

                    pegarIndex = input.nextInt();

                    habitos.remove(pegarIndex - 1);

                    System.out.println("Habito apagado com sucesso!");

                    break;

                case 4:
                    System.out.println("Escolha um habito para check-in:");
                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.println((i + 1) + ". " + (habitos.get(i).getNome()) + " sua streak é de " + (habitos.get(i).getDias()) + " dias.");
                    }

                    pegarIndex = (input.nextInt() - 1);

                    Habito habitoCheckin = habitos.get(pegarIndex);

                    habitoCheckin.setDias(habitoCheckin.getDias() + 1);

                    System.out.println("Parabens pelo check-in agora seu habito " + habitoCheckin.getNome() + " esta com " + habitoCheckin.getDias() + " dias.");

                    break;

                case 5:
                    System.out.println("Escolha um habito para editar:");

                    for (int i=0; i < habitos.toArray().length; i++){
                        System.out.print(i + 1 + " ");
                        System.out.println(habitos.get(i).getNome());
                    }

                    pegarIndex = (input.nextInt() - 1);

                    Habito habitoEditar = habitos.get(pegarIndex);
                    System.out.print("Digite o novo nome: ");


                    String novoNomeAlterado = input.next();//no array habitos pega o nome e troca :) lembrar de deixar bonito

                    habitoEditar.setNome(novoNomeAlterado);

                    // var habitorEditar é classe habito onde ele pega o array habitos e puxa no array escolhe esse index acessa e altera o nome (setNome) =>

                    System.out.println("Nome alterado para " + novoNomeAlterado);

                    break;

                case 0: //fim dos tempos
                    flag = false;
                    break;
            }
        } while(flag);
        //write on file

    }

}
