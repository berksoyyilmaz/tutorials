package structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.awt.*;

public class Car implements Vehicle {

  private static final Logger LOG = LoggerFactory.getLogger(Car.class);

  private final Engine engine;
  private final Color color;

  public Car(Engine engine, Color color) {
    this.engine = engine;
    this.color = color;
  }

  @Override
  public void start() {
    LOG.info("Car is starting!");
    engine.start();
  }

  @Override
  public void stop() {
    LOG.info("Car is stopping!");
    engine.stop();
  }

  @Override
  public Color getColor() {
    return color;
  }

}
