package behavioral.chainofresponsibility.currency;

public class Currency {

  private final int amount;

  public Currency(int amt) {
    amount = amt;
  }

  public int getAmount() {
    return amount;
  }
}