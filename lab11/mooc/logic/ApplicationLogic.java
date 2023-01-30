package mooc.logic;
import mooc.ui.UserInterface;
import mooc.ui.TextUserInterface;

public class ApplicationLogic {
    private UserInterface ui = new TextUserInterface();

    public ApplicationLogic(UserInterface ui) {
        this.ui = ui;
    }

    public void execute(int howManyTimes) {
        for(int i = 0; i < howManyTimes; i++) {
            System.out.println("The application logic works");
            ui.update();
        }
    }
}
