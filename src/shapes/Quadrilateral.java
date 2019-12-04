package shapes;

abstract class Quadrilateral extends Shape implements Measurable{
    protected double length;
    protected double width;

    public Quadrilateral (double lengthInput, double widthInput){
        this.length = lengthInput;
        this.width = widthInput;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    abstract void setLength(double length);

    abstract void setWidth(double width);


}
