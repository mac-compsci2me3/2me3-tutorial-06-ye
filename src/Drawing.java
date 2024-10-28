public class Drawing {
    // Step 1: Declare a private static instance variable for Singleton.
    private static Drawing instance;

    // Step 2: Make the constructor private to prevent instantiation from other classes.
    private Drawing() {}

    // Step 3: Provide a public static method to get the single instance.
    public static Drawing getInstance() {
        if (instance == null) { // Check if instance is null, and create if needed.
            instance = new Drawing();
        }
        return instance;
    }

    // Step 4: Create the drawShape method.
    public void drawShape(Shape shape) {
        String shapeType = shape.getClass().getSimpleName(); // Get the class name (e.g., Square, Circle).
        String color = shape.getColor(); // Get the color of the shape.
        double area = shape.calculateArea(); // Calculate area of the shape.

        System.out.println("Drawing a " + shapeType + " with color: " + color + " and area: " + area);
    }
}
