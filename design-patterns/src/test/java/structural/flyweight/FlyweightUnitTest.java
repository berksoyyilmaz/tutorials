package structural.flyweight;

import org.junit.Assert;
import org.junit.Test;

import java.awt.*;

public class FlyweightUnitTest {

  @Test
  public void givenDifferentFlyweightObjects_whenEquals_thenFalse() {
    Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
    Vehicle blueVehicle = VehicleFactory.createVehicle(Color.BLUE);

    Assert.assertNotNull("Object returned by the factory is null!", blackVehicle);
    Assert.assertNotNull("Object returned by the factory is null!", blueVehicle);
    Assert.assertNotSame("Objects returned by the factory are equals!", blackVehicle, blueVehicle);
  }

  @Test
  public void givenSameFlyweightObjects_whenEquals_thenTrue() {
    Vehicle blackVehicle = VehicleFactory.createVehicle(Color.BLACK);
    Vehicle anotherBlackVehicle = VehicleFactory.createVehicle(Color.BLACK);

    Assert.assertNotNull("Object returned by the factory is null!", blackVehicle);
    Assert.assertNotNull("Object returned by the factory is null!", anotherBlackVehicle);
    Assert.assertEquals("Objects returned by the factory are not equals!", blackVehicle, anotherBlackVehicle);
  }
}
