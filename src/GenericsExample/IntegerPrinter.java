package GenericsExample;

public class IntegerPrinter {
  Integer integerToPrint;
  IntegerPrinter(Integer integerToPrint) {
    this.integerToPrint = integerToPrint;
  }

  public void print() {
    System.out.println(integerToPrint);
  }
}
