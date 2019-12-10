package shapes;

//Inside of shapes, create an abstract Quadrilateral class that extends Shape and implements Measurable. This class should have:
abstract class Quadrilateral extends Shape implements Measurable {

    //    protected properties for length and width.
    protected double length;
    protected double width;

    //    a constructor that accepts two numbers for the length and width and sets those properties.
    public Quadrilateral(double lengthInput, double widthInput) {
        this.length = lengthInput;
        this.width = widthInput;
    }

    //    methods for getting the length and width.
    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    //    abstract methods for setting the length and width.
    abstract void setLength(double length);
    abstract void setWidth(double width);
}

//public class Psvm extends GroceryItem {
//
//
//    //******************//
//    // grocery exercise //
//    //******************//
//
//    int totalNumberDifferentItems;
//
//    public Psvm(String foodName, int quantityFood, String category) {
//        super(foodName, quantityFood, category);
//    }
//
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Please tell me how many grocery items you'd like to enter: ");
//        @@ -29,5 +35,13 @@ public static void main(String[] args) {
//            System.out.println(itemArray[j].name);
//        }
//
//        //***************//
//        //cumulative sum //
//        //***************//
//
//        int[] intArray = new int[]{};
//
//
//
//    }
//}