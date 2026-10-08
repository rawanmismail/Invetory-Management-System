import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    // Greeting message
    System.out.println("================================");
    System.out.println("   Invetory Management System   ");
    System.out.println("================================");

    System.out.println("Welcome! Manage your invetory here!");
    System.out.println("");


    // Adding a product
        System.out.println("========== Add A Product ==========");
        System.out.print("Enter product ID: ");
        String productID = scanner.nextLine();
        System.out.print("Enter product name: ");
        String productName = scanner.nextLine();
        System.out.print("Enter product category: ");
        String productCategory = scanner.nextLine();
        System.out.print("Enter product price: ");
        double productPrice = scanner.nextDouble();
        System.out.print("Enter product quantity in stock: ");
        int productQuantity = scanner.nextInt();
        System.out.println("Enter minimum stock level: ");
        int minStockLevel = scanner.nextInt();
        System.out.println("");
        System.out.println("Product information recorded successfully!");

    scanner.close();
    }
}