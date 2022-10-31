package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AirFlowController {

  private static final Logger logger = LoggerFactory.getLogger(AirFlowController.class);
  private final AirFlowMeter airFlowMeter = new AirFlowMeter();

  public void takeAir() {
    airFlowMeter.getMeasurements();
    logger.info("Air provided!");
  }

  public void off() {
    logger.info("Air controller switched off.");
  }
}
