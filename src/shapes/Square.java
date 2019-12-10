package shapes ;

public class Square extends Quadrilateral{
    //new constructor
    public Square(double side) {
        super(side, side);
    }

    @Override
    public double getPerimeter() {
        return ((this.length * 2) + (this.width * 2));
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    void setLength(double length) {

    }

    @Override
    void setWidth(double width) {

    }

}
