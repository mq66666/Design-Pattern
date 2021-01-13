/**
 * Static inner class静态内部类
 */
public class SICSingleton {
    private static class SingletonProducer{
        private static final SICSingleton INSTANCE = new SICSingleton();
    }

    private SICSingleton(){

    }

    public static final SICSingleton getInstance(){
        return SingletonProducer.INSTANCE;
    }
}
