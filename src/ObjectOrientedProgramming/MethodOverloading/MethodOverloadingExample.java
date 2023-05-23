package ObjectOrientedProgramming.MethodOverloading;

public class MethodOverloadingExample {
  public static void main(String[] args) {
    Number number = new Number();
    System.out.println(number.sum(3, 4, 5));
    System.out.println(number.sum(3, 4));
  }
}

