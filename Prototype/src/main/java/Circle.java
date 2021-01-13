public class Circle extends Shape{
    public Circle(){
        type = "Circle";
    }

    @Override
    void draw() {
        System.out.println("I have drew a circle!");
    }
}
