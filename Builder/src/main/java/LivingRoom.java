public class LivingRoom implements Room {
    private String sofa;
    private String wall;
    private String window;

    @Override
    public void setSofa(String sofa) {
        this.sofa = sofa;
    }

    @Override
    public void setWindow(String window) {
        this.window = window;
    }

    @Override
    public void setWall(String wall) {
        this.wall = wall;
    }

    @Override
    public void setBed(String bed) {
        return;
    }

    @Override
    public void setTable(String table) {
        return;
    }

    @Override
    public void show() {
        System.out.println("Window is " + this.window + ", wall is " + this.wall + ", sofa is " + this.sofa + ".");
    }
}
