public abstract class RealBachelor implements Bachelor{
    private String name;
    public RealBachelor(String name){
        this.name = name;
    }
    abstract public void claimSexualOrientation();
    public String getName(){
        return this.name;
    };
}
