public class Director {
    private Decorator decorator;
    public Director(Decorator decorator){
        this.decorator = decorator;
    }

    public Room construct(){
        return this.decorator.decorate();
    }
}
