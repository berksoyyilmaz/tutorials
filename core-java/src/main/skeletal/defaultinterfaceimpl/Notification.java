package main.skeletal.defaultinterfaceimpl;

interface Notification {
  default void start() {
    System.out.println("Start notification module");
  }

  void chooseChannel();

  default void stop() {
    System.out.println("Stop notification module");
  }

  default void process() {
    start();
    chooseChannel();
    stop();
  }
}
