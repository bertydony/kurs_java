package berty.listaZakupow;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> shoppingList = new ArrayList<>();
        Map<String, String> contacts = new HashMap<>();

        boolean loop = true;
        while (loop) {
            System.out.println("Wybierz opcję:");
            System.out.println("1. Dodaj do listy zakupów");
            System.out.println("2. Usuń z listy zakupów");
            System.out.println("3. Wyświetl listę zakupów");
            System.out.println("4. Sortuj listę zakupów");
            System.out.println("5. Filtruj listę zakupów");
            System.out.println("6. Dodaj kontakt");
            System.out.println("7. Usuń kontakt");
            System.out.println("8. Wyświetl kontakty");
            System.out.println("9. Wyświetl szczegóły kontaktu");
            System.out.println("0. Wyjdź z aplikacji");

            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Podaj nazwę produktu do dodania:");
                    String product = scanner.nextLine();
                    shoppingList.add(product);
                    System.out.println("Produkt dodany do listy zakupów.");
                    break;
                case 2:
                    System.out.println("Podaj nazwę produktu do usunięcia:");
                    String productToRemove = scanner.nextLine();
                    shoppingList.remove(productToRemove);
                    System.out.println("Produkt usunięty z listy zakupów.");
                    break;
                case 3:
                    System.out.println("Lista zakupów:");
                    shoppingList.forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Posortowana lista zakupów:");
                    List<String> sortedShoppingList = shoppingList.stream()
                            .sorted()
                            .collect(Collectors.toList());
                    sortedShoppingList.forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Podaj fragment produktu do filtrowania:");
                    String filterKeyword = scanner.nextLine();
                    List<String> filteredShoppingList = shoppingList.stream()
                            .filter(item -> item.contains(filterKeyword))
                            .collect(Collectors.toList());
                    System.out.println("Filtrowana lista zakupów:");
                    filteredShoppingList.forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Podaj nazwę kontaktu:");
                    String contactName = scanner.nextLine();
                    System.out.println("Podaj numer telefonu kontaktu:");
                    String contactNumber = scanner.nextLine();
                    contacts.put(contactName, contactNumber);
                    System.out.println("Kontakt dodany.");
                    break;
                case 7:
                    System.out.println("Podaj nazwę kontaktu do usunięcia:");
                    String contactToRemove = scanner.nextLine();
                    contacts.remove(contactToRemove);
                    System.out.println("Kontakt usunięty.");
                    break;
                case 8:
                    System.out.println("Lista kontaktów:");
                    contacts.forEach((name, number) -> System.out.println(name + ": " + number));
                    break;
                case 9:
                    System.out.println("Podaj nazwę kontaktu, którego szczegóły chcesz wyświetlić:");
                    String contactToDisplay = scanner.nextLine();
                    String phoneNumber = contacts.get(contactToDisplay);
                    if (phoneNumber != null) {
                        System.out.println("Szczegóły kontaktu:");
                        System.out.println("Nazwa: " + contactToDisplay);
                        System.out.println("Numer telefonu: " + phoneNumber);
                    } else {
                        System.out.println("Nie znaleziono takiego kontaktu.");
                    }
                    break;
                case 0:
                    loop = false;
                    System.out.println("Zakończono działanie aplikacji.");
                    break;
                default:
                    System.out.println("Podaj poprawna opcje...");
            }
        }
        scanner.close();
    }
}
