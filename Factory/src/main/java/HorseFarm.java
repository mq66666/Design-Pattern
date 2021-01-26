public class HorseFarm implements AnimalFarm{
    @Override
    public Animal newAnimal() {
        System.out.println("let a horse out");
        return new Horse();
    }
}
