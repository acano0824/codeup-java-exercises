package shapes;

public class Rectangle extends Quadrilateral implements Measurable {

    public Rectangle(int length, int width) {
        super(length, width);
   }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return 2 * length + 2 * width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    //    private int length;
//    private int width;
//
//    public Rectangle() {
//
//    }
//
//    public Rectangle(int length, int width) {
//        this.length = length;
//        this.width = width;
//    }
//
//    public int getArea() {
//
//        return this.length * this.width;
//    }
//    public int getPerimeter() {
//
//        return 2 * this.length + 2 * this.width;
//    }

}
