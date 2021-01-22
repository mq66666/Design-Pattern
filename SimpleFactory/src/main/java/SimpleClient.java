public class SimpleClient {
    public static void main(String[] args) {
        SimpleFactoryImpl.makeProduct("A").show();
        SimpleFactoryImpl.makeProduct("B").show();
    }
}
