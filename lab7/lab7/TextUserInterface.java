import java.util.Scanner;

public class TextUserInterface {
    private Scanner reader;
    private Dictionary dictionary;

    public TextUserInterface(Scanner reader, Dictionary dictionary) {
        this.reader = reader;
        this.dictionary = dictionary;
    }

    public void start() {
        while(true) {
            System.out.print("\nStatement: ");
            String command = reader.nextLine();

            if(command.equals("quit")) {
                System.out.println("Cheers!");
                break;
            }
            else if(command.equals("add")) {
                System.out.print("In Finnish: ");
                String key = reader.nextLine();
                System.out.print("Translation: ");
                String value = reader.nextLine();
                dictionary.add(key, value);
            }
            else if(command.equals("translate")) {
                System.out.print("Give a word:");
                String word = reader.nextLine();
                System.out.println("Translation: " + dictionary.translate(word));
            }
            else {
                System.out.println("Unknown statement!");
            }
        }
    }

}
