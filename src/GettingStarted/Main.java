package GettingStarted;


import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // --- VARIABLES ---

    int age; // variable declaration
    age = 25; // variable assignment

    int marks = 20; // variable declaration + assignment

    // --- NUMERIC DATA TYPES ---

    // --- STRING DATA TYPES ---
    String name = "Sakshat";

    String message = """
          Hello world,
          My name is Sakshat
        """;

    // System.out.println(message);
    // System.out.println(name.charAt(4)); // java indexes our strings


    // --- SCANNER CLASS IN JAVA ---
    Scanner sc = new Scanner(System.in); // Scanner constructor expects an argument
    int x = sc.nextInt(); // to read "int" values (similarly other types can be used)
    System.out.println(x * x);

    String username = sc.nextLine(); // to read "String" inputs
    System.out.println(username);
  }
}
