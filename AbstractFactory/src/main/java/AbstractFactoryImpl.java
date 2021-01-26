import Animal.Animal;
import Plant.Plant;

public interface AbstractFactoryImpl {
    public Animal newAnimal();
    public Plant newPlant();
}
