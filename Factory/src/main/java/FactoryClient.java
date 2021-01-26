public class FactoryClient {
    public static void main(String[] args) {
        AnimalFarm farmA = new HorseFarm();
        Animal a = farmA.newAnimal();
        a.run();
        AnimalFarm farmB = new CattleFarm();
        Animal b = farmB.newAnimal();
        b.run();
    }
}
