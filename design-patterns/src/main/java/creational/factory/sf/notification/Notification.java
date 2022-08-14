package creational.factory.sf.notification;

public abstract class Notification {
    String name;

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "name='" + name + '\'' +
                '}';
    }
}
