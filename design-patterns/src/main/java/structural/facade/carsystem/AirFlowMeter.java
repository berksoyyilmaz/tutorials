package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirFlowMeter {

  private static final Logger logger = LoggerFactory.getLogger(AirFlowMeter.class);

  public void getMeasurements() {
    logger.info("Getting air measurements..");
  }
}
