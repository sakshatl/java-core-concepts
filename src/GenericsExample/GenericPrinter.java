package GenericsExample;

public class GenericPrinter<T> {
  T valueToPrint;

  GenericPrinter(T valueToPrint) {
    this.valueToPrint = valueToPrint;
  }

  public void print() {
    System.out.println(valueToPrint);
  }
}
