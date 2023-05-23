package ObjectOrientedProgramming;

public class MultilevelInheritanceExample {
  public static void main(String[] args) {

  }


  static class Employee {
    String name;
    String email;
    String id;
    double salary;

    public Employee(String name, String email, String id, double salary) {
      this.name = name;
      this.email = email;
      this.id = id;
      this.salary = salary;
    }
  }

  static class Manager extends Employee {
    boolean isManager;
    public Manager(String name, String email, String id, double salary) {
      super(name, email, id, salary); // calling constructor of the base class
      this.isManager = true;
    }
  }

}
