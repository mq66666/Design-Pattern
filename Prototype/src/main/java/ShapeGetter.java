public class ShapeGetter {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        ShapeCache.getShape("1").draw();
        ShapeCache.getShape("2").draw();
        ShapeCache.getShape("3").draw();
    }
}
