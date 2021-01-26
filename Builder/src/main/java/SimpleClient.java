import java.awt.image.DirectColorModel;

public class SimpleClient {
    public static void main(String[] args) {
        Director director = new Director(new LivingRoomDecoratorA());
        Room room = director.construct();
        room.show();

        Director director2 = new Director(new LivingRoomDecoratorB());
        Room room1 = director2.construct();
        room1.show();
    }
}
