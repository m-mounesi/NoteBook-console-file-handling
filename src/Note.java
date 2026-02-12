import java.io.*;
import java.util.Scanner;

public class Note {
    private Scanner scanner;
    private BufferedWriter writer;
    private BufferedReader reader;

    public void create(){
        scanner= new Scanner(System.in);
        System.out.println("Enter your note file name:    ");
        System.out.println("You can write '/q' to back to main menu");

        String notename= scanner.nextLine();
        if (notename.equalsIgnoreCase("/q")){
            System.out.println("Good-bye");
            return;

//            System.exit(0);
//            You can use to close entire program
        }

            try {
                writer = new BufferedWriter(new FileWriter(notename + ".txt"));
                System.out.println("Now you can write your note, Type 'save' in next empty line to save it. ");
                String text;
                do {
                    text= scanner.nextLine();
                    writer.write(text);
                    writer.newLine();
                }while (!text.equalsIgnoreCase("save"));

                writer.close();
            } catch (IOException e) {
//            throw new RuntimeException(e);
                System.out.println("Something went wrong! To check,Next time make sure you choose the correct name. ");
                return;
            }
            System.out.println("Your note has been saved!");
        }




    public void read() {
        scanner = new Scanner(System.in);
        System.out.println("Write your file name");
        String filename = scanner.nextLine();

        if (filename.equalsIgnoreCase("/q")) {
            System.out.println("Good-bye");
            return;
//            System.exit(0);
        }
            try {
                reader = new BufferedReader(new FileReader(filename + ".txt"));

                String line = reader.readLine();
                while (line != null){
                    System.out.println(line);
                    line= reader.readLine();
                }
                System.out.println(line);
                reader.close();
            } catch (IOException e) {
//            throw new RuntimeException(e);
//                instead of using this exception, we can show a message and continue app until user find its file.
                System.out.println("File not found. Try again or type '/q' to close the app!");
                read();
            }
        }
    }

