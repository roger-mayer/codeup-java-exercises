package shapes;

//Change your existing Rectangle class to inherit from Quadrilateral and
//implement Measurable.
public class Rectangle extends Quadrilateral implements Measurable {


    public Rectangle(double lengthInput, double widthInput) {
        super(lengthInput, widthInput);
    }

    //    the methods that need to be implemented.
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
