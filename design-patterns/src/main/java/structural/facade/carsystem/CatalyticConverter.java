package structural.facade.carsystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CatalyticConverter {

  private static final Logger logger = LoggerFactory.getLogger(CatalyticConverter.class);

  public void on() {
    logger.info("Catalytic Converter switched on!");
  }

  public void off() {
    logger.info("Catalytic Converter switched off!");
  }
}
