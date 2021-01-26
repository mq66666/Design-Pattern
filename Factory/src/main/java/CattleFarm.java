public class CattleFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("let a cattle out~~~");
        return new Cattle();
    }
}
