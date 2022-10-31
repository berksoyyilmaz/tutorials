package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CoolingController {
  private static final Logger logger = LoggerFactory.getLogger(CoolingController.class);
  private static final Integer DEFAULT_RADIATOR_SPEED = 10;
  private final Radiator radiator = new Radiator();
  private final TemperatureSensor temperatureSensor = new TemperatureSensor();
  private Integer temperatureUpperLimit;

  public void setTemperatureUpperLimit(Integer temperatureUpperLimit) {
    logger.info("Setting temperature upper limit to {}", temperatureUpperLimit);
    this.temperatureUpperLimit = temperatureUpperLimit;
  }

  public void run() {
    logger.info("Cooling Controller ready!");
    radiator.setSpeed(DEFAULT_RADIATOR_SPEED);
  }

  public void cool(Integer maxAllowedTemp) {
    logger.info("Scheduled cooling with maximum allowed temperature {}", maxAllowedTemp);
    temperatureSensor.getTemperature();
    radiator.on();
  }

  public void stop() {
    logger.info("Stopping Cooling Controller..");
    radiator.off();
  }
}
