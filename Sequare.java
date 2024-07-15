

public class Sequare extends Rectangle {


  public Sequare() {

  }

  public Sequare(double side) {
      super.getWidth();
  }

  public Sequare(double side, String color, boolean filled) {

  }
   public double getSide(){
     return  getWidth();
    }

  public void setSide(double side){
       setWidth(side);
   }

    @Override
    public double getArea() {
        return getSide()*getSide();
    }

    @Override
    public double getPereime() {
        return getSide()*4;
    }

    @Override
    public String toString() {
    return " A Square with side "+getSide()+" which is a subclass of "+super.toString();

} }
