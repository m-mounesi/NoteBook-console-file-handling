import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static boolean running = true;
    public static void main(String[] args) {

        System.out.printf("Hi, welcome to console notebook!");
        Scanner input;
        input = new Scanner(System.in);
        Note note= new Note();

        while (running == true) {
            System.out.println("Choose an option below or '/q' to close!");
            System.out.println("1-  Create a new note");
            System.out.println("2-  Open an existing note");
            String menu = input.next();
            switch (menu){
                case "1":
                    note.create();
                    break;
                case "2":
                    note.read();
                    break;
                case "/q":
                    System.out.println("Good-bye");
                    running = false;
                    break;
                default:
                    System.out.println("write your option correctly! ");
            }
        }



    }
}