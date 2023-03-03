import processing.core.PImage;
// import processing.sound.*;

public class NewToy extends Toy{

        private PImage img;
        private PImage img1;
        private PImage img2;

        // private SoundFile sound;
        private int click = 0;

        public NewToy(int x, int y, int w, int h){
            super(x, y, w, h); // calling the Toy constructor
        }

        public void setupToy(){
            img = Main.app.loadImage("data/dolphin.png");
            img1 = Main.app.loadImage("data/dolphin.png");
            img2 = Main.app.loadImage ("data/dolphin copy.png");
            // sound = new SoundFile(getPApplet(), "Dolphin Chatter-SoundBible.com-808959219.mp3");
        }

        public void drawToy(){
            Main.app.imageMode(Main.app.CORNER);
            Main.app.image(img, getToyUpperLeftX(), getToyUpperLeftY(), Main.app.width/3, Main.app.height/2);
        }

        public void doClickAction(int x, int y){
            Main.app.imageMode(Main.app.CORNER);
            if (click % 2 == 0){
                this.img = img2;
                click++;
            } else {
                this.img = img1;
                click++;
            }
            //image(img2, getToyUpperLeftX(), getToyUpperLeftY(), width/3, height/2); //how do you make the switch last longer?
            // sound.play();

        }
    }




