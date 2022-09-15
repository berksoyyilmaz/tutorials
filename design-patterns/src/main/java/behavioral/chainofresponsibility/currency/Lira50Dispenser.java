package behavioral.chainofresponsibility.currency;

public class Lira50Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    chain = nextChain;
  }

  @Override
  public void dispense(Currency cur) {
    if (cur.getAmount() >= 50) {
      int num = cur.getAmount() / 50;
      int remainder = cur.getAmount() % 50;
      System.out.println("Dispensing " + num + " piece 50 TL note");
      if (remainder != 0) {
        chain.dispense(new Currency(remainder));
      }
    } else {
      chain.dispense(cur);
    }
  }

}