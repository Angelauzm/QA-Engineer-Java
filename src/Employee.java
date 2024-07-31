public class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public void printInfo() {
        System.out.println("ФИО: " + fullName + ", Должность: " + position + ", Email: " + email +
                ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }

    public Employee(String employeeFullName, String position, String email, String phone, int salary, int age) {
        this.fullName = employeeFullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }


    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrp@mailbox.com", "892312313", 40000, 35);
        employees[2] = new Employee("Sidorov Sidr", "Developer", "sidorov@mailbox.com", "892312314", 50000, 25);
        employees[3] = new Employee("Smirnov Smir", "Designer", "smirnov@mailbox.com", "892312315", 35000, 28);
        employees[4] = new Employee("Fedorov Fedor", "Analyst", "fedorov@mailbox.com", "892312316", 45000, 32);

        for (Employee employee : employees) {
            employee.printInfo();
        }
    }
}
