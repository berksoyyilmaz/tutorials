package behavioral.memento;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MementoTest {

  @Test
  void givenValue_whenSetStateAndCareTakerAdd_thenReturnLastOverridedState() {
    Originator originator = new Originator();
    CareTaker careTaker = new CareTaker();

    originator.setState("State #1");
    originator.setState("State #2");
    careTaker.add(originator.saveStateToMemento());

    originator.setState("State #3");
    originator.setState("State #4");
    careTaker.add(originator.saveStateToMemento());

    Assertions.assertEquals("State #2", careTaker.get(0).getState());
    Assertions.assertEquals("State #4", careTaker.get(1).getState());
  }

}

