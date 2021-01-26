public class LivingRoomDecoratorB implements Decorator {
    private Room livingRoom = new LivingRoom();

    @Override
    public void decorateWall() {
        this.livingRoom.setWall("WallB");
    }

    @Override
    public void decorateWindow() {
        this.livingRoom.setWindow("WindowB");
    }

    @Override
    public void decorateTable() {
        return;
    }

    @Override
    public void decorateSofa() {
        this.livingRoom.setSofa("SofaB");
    }

    @Override
    public void decorateBed() {
        return;
    }

    @Override
    public Room decorate() {
        decorateSofa();
        decorateWall();
        decorateWindow();
        return this.livingRoom;
    }
}
