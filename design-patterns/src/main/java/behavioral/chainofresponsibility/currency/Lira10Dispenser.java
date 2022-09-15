package behavioral.chainofresponsibility.currency;

public class Lira10Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    chain = nextChain;
  }

  @Override
  public void dispense(Currency cur) {
    if (cur.getAmount() >= 10) {
      int num = cur.getAmount() / 10;
      int remainder = cur.getAmount() % 10;
      System.out.println("Dispensing " + num + " piece 10 TL note");
      if (remainder != 0) {
        chain.dispense(new Currency(remainder));
      }
    } else {
      chain.dispense(cur);
    }
  }

}