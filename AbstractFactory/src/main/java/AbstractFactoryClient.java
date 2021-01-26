import Animal.Animal;
import Plant.Plant;

public class AbstractFactoryClient {
    public static void main(String[] args) {
        AbstractFactoryImpl farmA = new MengniuFarm();
        Animal animalA = farmA.newAnimal();
        animalA.run();
        Plant plantA = farmA.newPlant();
        plantA.bloom();

        AbstractFactoryImpl farmB = new YiliFarm();
        Animal animalB = farmB.newAnimal();
        animalB.run();
        Plant plantB = farmB.newPlant();
        plantB.bloom();
    }
}
