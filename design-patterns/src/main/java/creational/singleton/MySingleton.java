package creational.singleton;

public class MySingleton {
  private static MySingleton uniqueInstance;

  private MySingleton() {
  }

  public static MySingleton getInstance() {
    if (uniqueInstance == null) {
      uniqueInstance = new MySingleton();
    }
    return uniqueInstance;
  }
}