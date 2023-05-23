package ObjectOrientedProgramming.MethodOverridingExample;

class Main {
  public static void main(String[] args) {
    Test test = new Test(10);
    System.out.println(test);
  }
}

public class Test {
  int foo;
  public Test(int foo) {
    this.foo = foo;
  }

  @Override
  public String toString() {
    return "Test";
  }
}
