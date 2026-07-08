import java.util.Scanner;

public class HabitTracker {
     static void main(String[] args) {
        System.out.println("HabitTracker");
        int numHabits = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the name of the habit you want to add: ");

        String habitName = input.nextLine();

        int habit // Criar habito objeto para armazenar nome dias cumpridos

        /*
        int newNumHabits = input.nextInt();

        numHabits = numHabits + newNumHabits ;

        System.out.println("You have: " + numHabits + " habits");
        */

        System.out.println("Do you want to add another habit? y/n: ");

        if(input.next().equals("y"))
            System.out.println("nice");
        else
            System.out.println("NOT nice");
    }
}
