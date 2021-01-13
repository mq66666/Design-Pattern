public class Triangle extends Shape{
    public Triangle(){
        type = "Triangle";
    }

    @Override
    void draw() {
        System.out.println("I have drew a Triangle!");
    }
}
