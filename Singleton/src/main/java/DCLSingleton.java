/**
 * 双重检验锁
 */
public class DCLSingleton {
    private volatile static DCLSingleton INSTANCE;

    private DCLSingleton(){

    }

    public static DCLSingleton getInstance(){
        if(INSTANCE == null){
            synchronized (DCLSingleton.class){
                if(INSTANCE == null){
                    INSTANCE = new DCLSingleton();
                }
            }
        }
        return INSTANCE;
    }
}
