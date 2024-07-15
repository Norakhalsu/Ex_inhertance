public class Rectangle extends Shape {

    private  double width;
    private double lenght;


    public Rectangle(){
        this.lenght= 1.0;
        this.width=1.0;
    }
    public Rectangle(double width, double lenght) {
        this.width = width;
        this.lenght = lenght;
    }
    public Rectangle(String color, boolean filled, double width, double lenght) {
        super(color, filled);
        this.width = width;
        this.lenght = lenght;
    }
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }
    public double getArea(){
        return this.width*this.width;
    }
    public double getPereime(){
        return (this.width+this.lenght)*2;
    }

    @Override
    public String toString() {
        return " A Rectangle with " +
                "width " + this.width +
                " and lenght= " +this.lenght+" which is a subclass of "+super.toString();

    }
}
