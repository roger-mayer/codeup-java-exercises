package shapes;

public class Rectangle {
    protected double length;
    protected double width;

    ///constructor
    public Rectangle (double lengthInput, double widthInput){
        this.length = lengthInput;
        this.width = widthInput;
    }

    //getter
    public double getArea () {
        double area = length * width;
        return area;
        //can also write--> return this.length * this.width;

    }
    public double getPerimeter () {
        double perimeter = ((2 * length) + (2 * width));
        return perimeter;
        //can also write--> return ((this.length * 2) + (this.width * 2));
    }
}
