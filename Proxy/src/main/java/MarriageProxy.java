public class MarriageProxy implements Bachelor {
    private RealBachelor realBachelor;

    MarriageProxy(String name) {
        if (null == this.realBachelor) {
            this.realBachelor = new MaleStraightBachelor(name);
        }
    }

    @Override
    public void findAMate() {
        System.out.println("帮助" + realBachelor.getName() + "找到对象了！");
    }

    public void contactBachelor() {
        System.out.println("联系" + realBachelor.getName());
    }

    public void setMarriage() {
        System.out.println("给" + realBachelor.getName() + "准备婚礼");
    }

    public RealBachelor getRealBachelor(){
        return this.realBachelor;
    }
}
