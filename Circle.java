

public class Circle extends Shape{
    private double raduis;

    // constructer
    public Circle(){
    super();
     this.raduis=1.0;
    }
    public Circle(double raduis) {
        super();
        this.raduis = raduis;
    }

    public Circle(String color, boolean filled, double raduis) {
        super(color, filled);
        this.raduis = raduis;
    }

    // geter and setter
    public double getRaduis() {
        return raduis;
    }
    public void setRaduis(double raduis) {
        this.raduis = raduis;
    }


    // methods
    public double getArea(){
        return 3.14*this.raduis*this.raduis;
    }
    public double getPerimeter(){
        return 3.14*this.raduis*2;
    }

    @Override
    public String toString() {
        return " A Circle with " +
                "radius " +this.raduis+" which is a subclass of "+super.toString();
    }
}
