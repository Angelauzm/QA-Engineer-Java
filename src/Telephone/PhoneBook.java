package Telephone;
import java.util.*;

public class PhoneBook {
    private Map<String, List<Employee>> phoneBook; // Используем Map<String, List<Employee>>

    public PhoneBook() {
        phoneBook = new HashMap<>();
    }

    //добавление записи в справочник
    public void add(String lastName, String firstName, String phoneNumber) {
        if (phoneBook.containsKey(lastName)) {
            phoneBook.get(lastName).add(new Employee(firstName, lastName, phoneNumber));
        } else {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(firstName, lastName, phoneNumber));
            phoneBook.put(lastName, employees);
        }
    }

    //поиск номера по фамилии
    public List<Employee> get(String lastName) {
        return phoneBook.getOrDefault(lastName, new ArrayList<>());
    }

}
