package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TemperatureSensor {
  private static final Logger logger = LoggerFactory.getLogger(TemperatureSensor.class);

  public void getTemperature() {
    logger.info("Getting temperature from the sensor..");
  }

}
