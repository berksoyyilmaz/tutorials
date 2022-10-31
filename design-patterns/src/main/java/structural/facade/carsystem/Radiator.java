package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Radiator {

  private static final Logger logger = LoggerFactory.getLogger(Radiator.class);

  public void on() {
    logger.info("Radiator switched on!");
  }

  public void off() {
    logger.info("Radiator switched off!");
  }

  public void setSpeed(Integer speed) {
    logger.info("Setting radiator speed to {}", speed);
  }
}
