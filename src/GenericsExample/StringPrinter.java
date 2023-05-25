package GenericsExample;

public class StringPrinter {
  String stringToPrint;
  StringPrinter(String stringToPrint) {
    this.stringToPrint = stringToPrint;
  }

  public void print() {
    System.out.println(stringToPrint);
  }
}
