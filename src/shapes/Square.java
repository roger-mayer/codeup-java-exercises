package shapes ;

public class Square extends Quadrilateral{
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


    //        //new constructor
//    public Square(double side){
//        super(side, side);
//        this.side = sideInput;
//    }


//@Override
//    public double getArea () {
//    return Math.pow(super.length, 2);

//    }

//@Override
//    public double getPerimeter () {

//        return 4 * super.width;
//    }
}
