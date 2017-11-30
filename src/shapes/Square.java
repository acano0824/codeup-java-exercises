package shapes;

public class Square extends Quadrilateral {


    public Square(int side) {
        super(side, side);

    }

    @Override
    public void setLength() {

    }

    @Override
    public void setWidth() {

    }

    @Override
    public double getPerimeter() {
        return length * 4;
    }

    @Override
    public double getArea() {
        return length * length;
    }


    //    public int side;
//
//
//
//    public int getArea() {
//
//        return side * side;
//    }
//    public int getPerimeter() {
//
//        return 4 * side;
//    }

}