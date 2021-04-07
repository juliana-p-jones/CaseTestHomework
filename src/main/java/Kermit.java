public class Kermit {
    //vars
    private String color;

    //default constructor
    public Kermit() {
    }
    //constructor with color
    public Kermit(String color){
        this.color = color;
    }
        //method
        public String makeSound ( int timesSqueezed){
            String sound = "It ain't easy being green";
            return sound;
        }
        //getters setters
        public String getColor() {
            return color;
        }

    public void setColor(String color) {
        this.color = color;
    }

}
