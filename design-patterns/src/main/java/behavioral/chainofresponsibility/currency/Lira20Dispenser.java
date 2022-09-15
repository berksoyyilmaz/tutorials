package behavioral.chainofresponsibility.currency;

public class Lira20Dispenser implements DispenseChain {

  private DispenseChain chain;

  @Override
  public void setNextChain(DispenseChain nextChain) {
    chain = nextChain;
  }

  @Override
  public void dispense(Currency cur) {
    if (cur.getAmount() >= 20) {
      int num = cur.getAmount() / 20;
      int remainder = cur.getAmount() % 20;
      System.out.println("Dispensing " + num + " piece 20 TL note");
      if (remainder != 0) {
        chain.dispense(new Currency(remainder));
      }
    } else {
      chain.dispense(cur);
    }
  }

}