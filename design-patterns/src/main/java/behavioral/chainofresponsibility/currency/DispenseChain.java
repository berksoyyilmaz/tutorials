package behavioral.chainofresponsibility.currency;

public interface DispenseChain {

  void setNextChain(DispenseChain nextChain);

  void dispense(Currency cur);
}