import Animal.Animal;
import Animal.impl.Horse;
import Plant.Plant;
import Plant.impl.Tulip;

public class YiliFarm implements AbstractFactoryImpl{
    @Override
    public Animal newAnimal() {
        System.out.println("Let a horse out~~~");
        return new Horse();
    }

    @Override
    public Plant newPlant() {
        System.out.println("Put a tulip seed on the ground~~~");
        return new Tulip();
    }
}
