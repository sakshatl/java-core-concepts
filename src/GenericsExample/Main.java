package GenericsExample;

public class Main {
  public static void main(String[] args) {
    IntegerPrinter iPrinter = new IntegerPrinter(8);
    StringPrinter sPrinter = new StringPrinter("Hello World");
    // In the above cases we have created duplicate code for 2 almost similar cases
    sPrinter.print();
    iPrinter.print();

    // Generics help solving the above issue
    // We can create a Generic Class with a <Type>
    // We can replace <Type> with respective Object type as per use case
    GenericPrinter<String> stringGenericPrinter = new GenericPrinter<String>("Hello from generic printer");
    GenericPrinter<Integer> integerGenericPrinter = new GenericPrinter<Integer>(4);
    stringGenericPrinter.print();
    integerGenericPrinter.print();
  }
}
