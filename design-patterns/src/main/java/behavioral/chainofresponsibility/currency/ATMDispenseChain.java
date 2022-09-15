package behavioral.chainofresponsibility.currency;

import java.util.Scanner;

public class ATMDispenseChain {

  private final DispenseChain c1;

  public ATMDispenseChain() {
    // initialize the chain
    c1 = new Lira50Dispenser();
    DispenseChain c2 = new Lira20Dispenser();
    DispenseChain c3 = new Lira10Dispenser();

    // set the chain of responsibility
    c1.setNextChain(c2);
    c2.setNextChain(c3);
  }


  public static void main(String[] args) {
    ATMDispenseChain atmDispenser = new ATMDispenseChain();
    while (true) {
      int amount;
      System.out.print("Enter amount to dispense:");
      Scanner input = new Scanner(System.in);
      amount = input.nextInt();
      if (amount % 10 != 0) {
        System.out.println("Amount should be in multiple of 10s.");
        return;
      }
      // process the request
      atmDispenser.c1.dispense(new Currency(amount));
    }

  }

}