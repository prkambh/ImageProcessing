import processing.core.PApplet;
import java.util.ArrayList;

public class Main extends PApplet {
    private ArrayList<Toy> toys; //HELP I DON'T THINK I DID THIS RIGHT
    final int ROWS = 2;
    final int COLUMNS = 3;
    public static PApplet app;

    public Main() {
        super();
        app = this;
    }

    public static void main(String[] args) {
        PApplet.main("Main");
    }

    public void settings() {
        size(600, 600);
    }

    public void setup() {
        size(600, 600);
        toys = new ArrayList<Toy>(); //[ROWS * COLUMNS]; // allocating memory for array of toys
        int i = 0; //dol index into the toys array
        int w = width / COLUMNS; // calculating the width of toy
        int h = height / ROWS; // calculating the height of toy
        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLUMNS; col++) {
                int x = col * w; // upper left x coordinate for toy's position
                int y = row * h;  // upper left y coordinate for toy's position
                Toy t;
                // change this conditional statement to make 2 Toys
                //2 StuffedBears, and 2 NewToys
                if (i % 2 == 0) { // i <= 2
                    t = new StuffedBear(x, y, w, h);
                } else {
                    t = new NewToy(x, y, w, h);
                }

                t.setupToy();
                toys.add(t); // adding the toy object into the toys array
                i++; // incrementing the array index
            }
        }
    }

    public void draw() {
        background(255);

        for (Toy t: toys) {
            t.drawToy();
        }
        // ask each toy to draw itself
        //for (int i = 0; i < toys.size(); i++) {
        //    Toy t = toys.get(i);// getting the toy from the array
        //    t.drawToy(); // calling the toy's method to draw itself
        //}
    }

    public void mouseClicked() {
        for (Toy t : toys) {
            t.handleMouseClicked(mouseX, mouseY);
        }
        // ask each toy to test if it should handle the click
         /* for (int i = 0; i < toys.size(); i++){
            Toy t = toys.get(i); // getting the toy from the array

            // calling the toy's method to test if the mouse click was within
            // the rectangular boundaries of the toy and handle it if so
            t.handleMouseClicked(mouseX, mouseY);
        } */
    }

    public void keyPressed() {
        if (key == 's') {
            Toy t1 = toys.remove(0);
            Toy t2 = toys.remove(toys.size() - 1);
            toys.add(0, t2);
            toys.add(t1);

            int x = t1.getToyUpperLeftX();
            int y = t1.getToyUpperLeftY();

            t1.setUpperLeftX(t2.getToyUpperLeftX());
            t1.setUpperLeftY(t2.getToyUpperLeftY());

            t2.setUpperLeftX(x);
            t2.setUpperLeftY(y);

        } else if (key == 'r') {
            int randomIndex = (int) (Math.random() * toys.size());
            Toy t = toys.get(randomIndex);
            // HELP I CANNOT DO THIS.

            int upx = t.getToyUpperLeftX();
            int upy = t.getToyUpperLeftY();

            if (toys.get(randomIndex) instanceof NewToy) {
                Toy newT = new StuffedBear(upx, upy, t.getWidth(), t.getHeight());
                newT.setupToy();
                toys.set(randomIndex, newT);
            } else {
                Toy newT = new NewToy(upx, upy, t.getWidth(), t.getHeight());
                newT.setupToy();
                toys.set(randomIndex, newT);
            }

        }
    }

}
