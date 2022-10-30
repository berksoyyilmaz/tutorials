package structural.decorator.worst;

public abstract class Car {
  private String name;

  protected Car(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  abstract void assemble();
}