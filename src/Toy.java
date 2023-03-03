public class Toy {
        private int upperLeftX, upperLeftY; // upper left coordinates
        private int w, h; // width and height
        private int red;
        private int green;
        private int blue;

        // constructor (i.e. factory) for making new instances/objects of type Toy
        public Toy(int x, int y, int _w, int _h){
            // assign the client's specification for position and size
            // to the Toy's instance variables
            upperLeftX = x;
            upperLeftY = y;
            w = _w;
            h = _h;
            red = (int) Main.app.random(256);
            green = (int) Main.app.random(256);
            blue = (int) Main.app.random(256);
        }
        public void setupToy(){

        }

        public void drawToy(){
            // toy draws itself
            Main.app.fill(red, green, blue);
            Main.app.rect(upperLeftX, upperLeftY, w, h);
        }

        public void handleMouseClicked(int x, int y){
            // if the (x,y) lies withing the bounds of my rectangle
            if (x > upperLeftX && x < (upperLeftX + w) &&
                    y > upperLeftY && y < (upperLeftY + h)){
                doClickAction(x, y);
            }
        }

        public void setUpperLeftX(int x) {
            upperLeftX = x;

        }

        public void setUpperLeftY(int y) {
            upperLeftY = y;

        }

        public int getWidth(){
            return w;

        }

        public void setWidth(int w){
            this.w = w;
        }

        public int getHeight(){
            return h;
        }

        public void setHeight(int h){
            this.h = h;
        }

        public int getToyUpperLeftX(){
            return upperLeftX;
        }

        public int getToyUpperLeftY(){
            return upperLeftY;
        }

        public void doClickAction(int x, int y){
            red = (int) Main.app.random(256);
            green = (int) Main.app.random(256);
            blue = (int) Main.app.random(256);
        }


    }

