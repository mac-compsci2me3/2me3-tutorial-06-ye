public class Client {
    public static void main(String[] args) {
        // Create some shapes with specified color
        Shape square = new Square("Red", 5.0);
        Shape circle = new Circle("Blue", 3.0);

        // Retrieve the instance of Drawing (Singleton)
        Drawing drawing = Drawing.getInstance();

        // Draw shapes using the single Drawing instance
        drawing.drawShape(square);
        drawing.drawShape(circle);
    }
}
