package creational.singleton.chocolate;

public class ChocolateBoiler {
  private static ChocolateBoiler uniqueInstance;
  private boolean empty;
  private boolean boiled;

  private ChocolateBoiler() {
    empty = true;
    boiled = false;
  }

  public static synchronized ChocolateBoiler getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new ChocolateBoiler();
    }
    return uniqueInstance;
  }

  public void fill() {
    if (isEmpty()) {
      empty = false;
      boiled = false;
    }
  }

  public void drain() {
    if (!isEmpty() && isBoiled()) {
      empty = true;
    }
  }

  public void boil() {
    if (!isEmpty() && !isBoiled()) {
      // bring the contents to a boil
      boiled = true;
    }
  }

  public boolean isEmpty() {
    return empty;
  }

  public boolean isBoiled() {
    return boiled;
  }
}
