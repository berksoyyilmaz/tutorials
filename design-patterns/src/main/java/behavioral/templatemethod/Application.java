package behavioral.templatemethod;

public class Application {
  public static void main(String[] args) {
    new StandardComputerBuilder()
        .buildComputer()
        .getComputerParts()
        .forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));

    new HighEndComputerBuilder()
        .buildComputer()
        .getComputerParts()
        .forEach((k, v) -> System.out.println("Part : " + k + " Value : " + v));
  }
}
