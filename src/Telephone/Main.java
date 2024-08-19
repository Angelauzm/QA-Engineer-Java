package Telephone;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        PhoneBook book = new PhoneBook();

        // Добавление записей
        book.add("Иванов", "Иван", "123-456-7890");
        book.add("Петров", "Петр", "987-654-3210");
        book.add("Петров", "Петр", "456-456-345-234");
        book.add("Кузнецова", "Анна", "555-123-4567");

        List<Employee> employee1 = book.get("Иванов");
        System.out.println("Телефоны сотрудника Иванова");
        for (Employee employee : employee1) {
            System.out.println(employee);
        }

        List<Employee> employee2 = book.get("Кузнецова");
        System.out.println("\nТелефоны сотрудника Кузнецовой:");
        for (Employee employee : employee2) {
            System.out.println(employee);
        }

        List<Employee> employee3 = book.get("Петров");
        System.out.println("\nТелефоны сотрудника Петрова");
        for (Employee employee : employee3) {
            System.out.println(employee);
        }
    }
}
