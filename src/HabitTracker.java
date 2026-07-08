import java.util.Scanner;

public class HabitTracker {
    public static void main(String[] args) {
        System.out.println("HabitTracker");
        int numHabits = 1;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter the number of habits you want to add: ");

        int newNumHabits = input.nextInt();

        numHabits = numHabits + newNumHabits ;

        System.out.println("You have: " + numHabits + " habits");

        System.out.println("Do you want to add another habit? y/n: ");

        if(input.next().equals("y"))
            System.out.println("nice");
        else
            System.out.println("NOT nice");
    }
}
