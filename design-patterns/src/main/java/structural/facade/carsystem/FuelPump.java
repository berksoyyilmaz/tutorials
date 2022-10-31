package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelPump {

  private static final Logger logger = LoggerFactory.getLogger(FuelPump.class);

  public void pump() {
    logger.info("Fuel Pump is pumping fuel..");
  }
}
