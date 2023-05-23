package ObjectOrientedProgramming.MethodOverridingExample;

public class MethodOverridingExample {
  public static void main(String[] args) {
    Shape shape = new Shape();
    Circle circle = new Circle();

    shape.area();
    circle.area();
  }
}
