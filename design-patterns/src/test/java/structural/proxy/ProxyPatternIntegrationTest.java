package structural.proxy;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import util.InMemoryCustomTestAppender;

import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ProxyPatternIntegrationTest {
  private InMemoryCustomTestAppender appender;

  @Before
  public void setUp() {
    appender = new InMemoryCustomTestAppender();
  }

  @After
  public void tearDown() {
    appender.stop();
  }

  @Test
  public void givenExpensiveObjectProxy_WhenObjectInitialized_thenInitializedOnlyOnce() {
    ExpensiveObject object = new ExpensiveObjectProxy();
    object.process();
    object.process();

    List<ILoggingEvent> log = appender.getLog();

    assertThat(log.get(0).getMessage(), is("Loading initial configuration.."));
    assertThat(log.get(1).getMessage(), is("processing complete."));
    assertThat(log.get(2).getMessage(), is("processing complete."));
  }
}

