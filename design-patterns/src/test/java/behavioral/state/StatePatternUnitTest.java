package behavioral.state;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

public class StatePatternUnitTest {

  @Test
  public void givenNewPackage_whenPackageReceived_thenStateReceived() {
    Package pkg = new Package();

    assertThat(pkg.getState(), instanceOf(OrderedState.class));
    pkg.nextState();

    assertThat(pkg.getState(), instanceOf(DeliveredState.class));
    pkg.nextState();

    assertThat(pkg.getState(), instanceOf(ReceivedState.class));
  }

  @Test
  public void givenDeliveredPackage_whenPrevState_thenStateOrdered() {
    Package pkg = new Package();
    pkg.setState(new DeliveredState());
    pkg.previousState();

    assertThat(pkg.getState(), instanceOf(OrderedState.class));
  }
}