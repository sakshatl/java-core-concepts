package ObjectOrientedProgramming;

public class InheritanceExample {
  public static void main(String[] args) {
    Employee emp1 = new Employee("Sakshat", "foo@bar.com", 1234);
    Employee emp2 = new Employee("Bruce", "bruce@gmail.com", 5678);

    Manager manager1 = new Manager(emp1);
    Manager manager2 = new Manager(emp2);

    System.out.println(manager1.name);
    System.out.println(manager2.name);
  }
  static class Employee {
    String name;
    String email;
    int id;

    Employee() {

    }

    Employee(String name, String email, int id) {
      this.name = name;
      this.email = email;
      this.id = id;
    }
  }

  static class Manager extends Employee {
    boolean isManager;
    public Manager(Employee obj) {
      this.isManager = true;
      this.email = obj.email;
      this.name = obj.name;
      this.id = obj.id;
    }
  }
}