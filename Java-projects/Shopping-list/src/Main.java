import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> items = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1) Add item");
            System.out.println("2) Show list");
            System.out.println("0) Quit");
            System.out.print("Choice: ");
            String choice = scanner.nextLine();

            if (choice.equals("1")) {
                System.out.print("Name: ");
                String name = scanner.nextLine();

                System.out.print("Quantity: ");
                int quantity = Integer.parseInt(scanner.nextLine());

                System.out.print("Price: ");
                double price = Double.parseDouble(scanner.nextLine());

                items.add(new Item(name, quantity, price));
                System.out.println("Added.");

            } else if (choice.equals("2")) {
                if (items.isEmpty()) {
                    System.out.println("List is empty.");
                } else {
                    for (Item item : items) {
                        System.out.println(item);
                    }
                }

            } else if (choice.equals("0")) {
                System.out.println("Bye.");
                break;

            } else {
                System.out.println("Invalid input.");
            }
        }

        scanner.close();
    }
}