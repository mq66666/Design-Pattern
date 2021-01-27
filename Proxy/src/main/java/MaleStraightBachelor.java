public class MaleStraightBachelor extends RealBachelor {

    public MaleStraightBachelor(String name) {
        super(name);
    }

    @Override
    public void findAMate() {
        System.out.println("俺" + this.getName() + ",终于找到对象了！");

    }

    public void claimSexualOrientation() {
        System.out.println("俺" + super.getName() + ",喜欢女的！");
    }
}
