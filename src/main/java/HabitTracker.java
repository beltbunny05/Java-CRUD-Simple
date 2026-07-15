import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class HabitTracker {
    static void main(String[] args) {

        //puxar Repo para ler o json
        HabitRepository habitFile = new HabitRepository();

        CheckinRepository checkinFile = new CheckinRepository();
        //--------------------------------------------------

        System.out.println("HabitTracker");

        boolean flag = true;

        Scanner input = new Scanner(System.in);//input setup

        List<Habito> habitos = habitFile.buscarDados();
        List<CheckIn> checkins = checkinFile.buscarDados();

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
                    // adicionar sistema de recorde para mostrar aqui

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

                    //public CheckIn(String habitoID, LocalDate data)
                    CheckIn novoID = new CheckIn(habitoCheckin.getHabitoID(), LocalDate.now()); //puta que o pariu nem fudendo

                    checkins.add(novoID); //atributo para guardar na memoria


                    habitoCheckin.setDias(habitoCheckin.getDias() + 1);//serão movidas para a logica de streak depois
                    habitoCheckin.setRecorde(habitoCheckin.getRecorde() + 1); // esse tb


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

        habitFile.registrarDados(habitos);
        checkinFile.registrarDados(checkins);


        //usar o Habit Repository para escrever
    }
}