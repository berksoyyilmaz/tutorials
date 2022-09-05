package creational.builder.house.director;

public class ConstructionEngineerTest {
  public static void main(String[] args) {
    HouseBuilder concreteHouseBuilder = new ConcreteHouseBuilder();
    ConstructionEngineer engineerA = new ConstructionEngineer(concreteHouseBuilder);
    House concreteHouse = engineerA.constructHouse();
    System.out.println("House is: " + concreteHouse);

    HouseBuilder prefabricatedHouseBuilder = new PrefabricatedHouseBuilder();
    ConstructionEngineer engineerB = new ConstructionEngineer(prefabricatedHouseBuilder);
    House prefabricatedHouse = engineerB.constructHouse();
    System.out.println("House is: " + prefabricatedHouse);
  }
}
