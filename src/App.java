import javadraw.*;

public class App extends Window {
    Text text;

    public static void main(String[] args) throws Exception {
        Window.open(1200, 1000);
    }

    public void start() {
        int textSize = 40;
        int changeSize = 3;
        double rotateAmount = 10;
        text = new Text(screen, "CS1", 400, 300);
        text.size(20);

        while (true) {
            if (text.size() >= 250 || text.size() <= 10) {
                changeSize = -changeSize;
            }
           
            text.rotate(rotateAmount);

            text.size(text.size() + changeSize);
            text.center(screen.width() / 2, screen.height() / 2);
            screen.update();
            screen.sleep(1 / 30.0);
        }
    }

    public void keyDown(Key k) {
        if (k == Key.UP) {

        }
        String currentText = text.text();
        text.text(currentText + k.character());
    }

}
