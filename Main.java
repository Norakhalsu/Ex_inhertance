

public class Main {
    public static void main(String[] args) {

        Shape shape1=new Shape();
        Circle circle1=new Circle("Yellow" ,true , 3.0);
        Rectangle rectangle1=new Rectangle("Black",false,2.0 , 4.5);
        Sequare sequare1=new Sequare(5.6);


//        Shape shape2=new Shape();
//        Circle circle2=new Circle(2.0);
//        Rectangle rectangle2=new Rectangle(3.0,3.0);
//        Sequare sequare2=new Sequare(3.4);

        System.out.println();
        System.out.println(shape1);
        System.out.println();
        System.out.println(circle1);
        System.out.println();
        System.out.println(rectangle1);
        System.out.println();
        System.out.println(sequare1);

    }
}