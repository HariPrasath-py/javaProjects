import java.util.ArrayList;
import java.util.Scanner;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        int i = 1;

        while(running){
            System.out.println("\n1.Add a task");
            System.out.println("2.Remobe a task");
            System.out.println("3.View menu");
            System.out.println("4.Exit");

            System.out.println("Enter an option");
            int option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.print("Enter a task to add : ");
                    String task = scan.nextLine();
                    tasks.add(task);
                    break;

                case 2:
                    System.out.print("Enter a task number to remove : ");
                    int num = scan.nextInt();
                    if (num > 0 && num <= tasks.size()){
                        tasks.remove(num-1);
                        System.out.println("Task removed successfully");
                    }
                    else{
                        System.out.println("Enter a valied Number");
                    }
                    break;

                case 3:
                    for(String ts:tasks){
                        
                        System.out.println(i + " " + ts);
                        i += 1;
                    }
                    break;

                case 4:
                    running = false;
                    System.out.println("Exiting");
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        }
    }
    
}
