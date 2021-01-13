import java.util.Hashtable;

public class ShapeCache {
    private static Hashtable<String,Shape> shapeMap = new Hashtable<>();

    public static Shape getShape(String shapId){
        Shape shape = shapeMap.get(shapId);
        return (Shape)shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Triangle triangle = new Triangle();
        triangle.setId("2");
        shapeMap.put(triangle.getId(),triangle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);
    }
}
