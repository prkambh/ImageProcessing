import processing.core.PImage;
public class StuffedBear extends Toy{

        private PImage img;
        //private SoundFile sound;

        public StuffedBear(int x, int y, int w, int h){
            // making and initializing a new StuffedBear object
            super(x, y, w, h); // calling the Toy constructor
        }

        public void setupToy(){
            img = Main.app.loadImage("data/AR-26227-2.png"); // change name to your file's name
            //sound = new SoundFile(getPApplet(), "Squeaky-sound.mp3");// change name to your file's name
        }

        public void drawToy(){
            Main.app.imageMode(Main.app.CORNER);
            Main.app.image(img, getToyUpperLeftX(), getToyUpperLeftY(), Main.app.width/3, Main.app.height/2);
        }

        public void doClickAction(int x, int y){
         //   sound.play();
        }
    }




