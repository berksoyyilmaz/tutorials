package structural.adapter;

public class MovableAdapterImpl implements MovableAdapter {
  private final Movable luxuryCars;

  public MovableAdapterImpl(Movable luxuryCars) {
    this.luxuryCars = luxuryCars;
  }

  @Override
  public double getSpeed() {
    double mph = luxuryCars.getSpeed();
    return convertMPHtoKMPH(mph);
  }

  private double convertMPHtoKMPH(double mph) {
    return mph * 1.60934;
  }
}
