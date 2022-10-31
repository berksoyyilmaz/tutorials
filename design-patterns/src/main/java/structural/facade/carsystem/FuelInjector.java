package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class FuelInjector {
  private static final Logger logger = LoggerFactory.getLogger(FuelInjector.class);

  private final FuelPump fuelPump = new FuelPump();

  public void on() {
    logger.info("Fuel injector ready to inject fuel.");
  }

  public void inject() {
    fuelPump.pump();
    logger.info("Fuel injected.");
  }

  public void off() {
    logger.info("Stopping Fuel injector..");
  }
}
