public class LivingRoomDecoratorA implements Decorator {
    private Room livingRoom = new LivingRoom();

    @Override
    public void decorateWall() {
        livingRoom.setWall("WallA");
    }

    @Override
    public void decorateWindow() {
        livingRoom.setWindow("WindowA");
    }

    @Override
    public void decorateTable() {
        return;
    }

    @Override
    public void decorateSofa() {
        livingRoom.setSofa("SofaA");
    }

    @Override
    public void decorateBed() {
        return;
    }

    @Override
    public Room decorate() {
        decorateWall();
        decorateSofa();
        decorateWindow();
        return this.livingRoom;
    }

}
