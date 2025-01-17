

public class Shape {

    private String color;
    private boolean filled;

    // constructers
    public Shape(){
    this.color="green";
    this.filled=true;
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }


    // getter ans setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // toString
    @Override
    public String toString() {
        return " A Shape with color of "+ this.color +
                " and filled = " +(this.filled ?"filled" : "not filled");
    }

}
