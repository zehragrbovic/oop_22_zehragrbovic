import java.io.File;
import java.util.Scanner;

public class Printer {
    private File file;
    private Scanner reader;

    public Printer(String fileName) throws Exception{
        this.file = new File(fileName);
        this.reader = null;
    }

    public void printLinesWhichContain(String word) {
        try {
            reader = new Scanner(this.file);
        } catch(Exception e) {
            System.out.println("Error");
        }
        while (reader.hasNextLine()) {
            String line = reader.nextLine();
            
            if(line.contains(word)) {
                System.out.println(line);
            }
        }

        reader.close();
    }
}
