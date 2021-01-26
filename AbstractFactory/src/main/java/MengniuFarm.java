import Animal.Animal;
import Animal.impl.Cattle;
import Plant.Plant;
import Plant.impl.Sunflower;

public class MengniuFarm implements AbstractFactoryImpl{
    @Override
    public Animal newAnimal() {
        System.out.println("Let a cattle out~~~");
        return new Cattle();
    }

    @Override
    public Plant newPlant() {
        System.out.println("Put a sunflow seed on the ground~~~");
        return new Sunflower();
    }
}
