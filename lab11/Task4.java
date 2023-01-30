public class Task4 {
    public static void main(String[] args) {
        
        Printer printer = new Printer("textfile.txt");

        printer.printLinesWhichContain("Väinämöinen");
        System.out.println();
        printer.printLinesWhichContain("Frank Zappa");
        System.out.println();
        printer.printLinesWhichContain("");
        System.out.println();

    }
}
