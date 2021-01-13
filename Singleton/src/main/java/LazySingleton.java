/**
 * 懒汉式
 */
class LazySingleton {
    private static volatile LazySingleton INSTANCE;

    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
