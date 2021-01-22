public class SimpleFactoryImpl {
    public SimpleFactoryImpl(){

    }
    public static Product makeProduct(String code){
        switch (code){
            case "A":
                return new ConcreteProductA();
            case "B":
                return new ConcreteProductB();
        }
        return null;
    }
}
