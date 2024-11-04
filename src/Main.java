import java.util.Scanner;
import java.util.HashMap;


public class Main {
    private static System system;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //VARIABLES
        String option;
        String stringInput;
        int intInput;
        int assignmentCount = 0;
        boolean sentinal = true;
        HashMap<Integer, String> userTodo = new HashMap<Integer, String>();


        while (sentinal) {
            System.out.println("Hi! What would you like to do? \n [A. Create New Assignment] \n [B. Delete Assignment] \n [C. View all Assignments]\n");

            option = scan.nextLine();

            if(option.equalsIgnoreCase("a")) {
                system.out.println("What do you have to do?:");
                stringInput = scan.nextLine();
                assignmentCount++;
                userTodo.put(assignmentCount,stringInput);
                stringInput = "";
            } else if(option.equalsIgnoreCase("b")) {
                system.out.println("Which assignment would you like to delete?");
                intInput = scan.nextInt();
                assignmentCount--;
                userTodo.remove(intInput);
            }else if(option.equalsIgnoreCase("c")) {
                for (int i : userTodo.keySet()) {
                    System.out.println("Task Number: " + i + " Thing to do: " + userTodo.get(i));
                }
            }


        }

        //-----
    }
}