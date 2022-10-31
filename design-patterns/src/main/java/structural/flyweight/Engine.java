package structural.flyweight;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Engine {
  private static final Logger logger = LoggerFactory.getLogger(Engine.class);

  public void start() {
    logger.info("Engine is starting!");
  }

  public void stop() {
    logger.info("Engine is stopping!");
  }
}
