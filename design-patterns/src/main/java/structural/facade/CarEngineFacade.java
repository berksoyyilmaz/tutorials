package structural.facade;

import structural.facade.carsystem.*;

public class CarEngineFacade {
  private static final Integer DEFAULT_COOLING_TEMP = 90;
  private static final Integer MAX_ALLOWED_TEMP = 50;
  private final FuelInjector fuelInjector = new FuelInjector();
  private final AirFlowController airFlowController = new AirFlowController();
  private final Starter starter = new Starter();
  private final CoolingController coolingController = new CoolingController();
  private final CatalyticConverter catalyticConverter = new CatalyticConverter();

  public void startEngine() {
    fuelInjector.on();
    airFlowController.takeAir();
    fuelInjector.inject();
    starter.start();
    coolingController.setTemperatureUpperLimit(DEFAULT_COOLING_TEMP);
    coolingController.run();
    catalyticConverter.on();
  }

  public void stopEngine() {
    fuelInjector.off();
    catalyticConverter.off();
    coolingController.cool(MAX_ALLOWED_TEMP);
    coolingController.stop();
    airFlowController.off();
  }
}
