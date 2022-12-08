import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final Employee[] employees = new Employee[10];

    public static void main(String[] args) {
        employees[0] = new Employee(10000, "Блинов Вячеслав Владимирович");
        employees[1] = new Employee(20000, "Колесникова Ульяна Александровна");
        employees[2] = new Employee(30000, "Дубинин Антон Никитич");
        employees[3] = new Employee(40000, "Ермолаев Игорь Владимирович");
        employees[4] = new Employee(50000, "Соколова Василиса Викторовна");

        printAllEmployees();
        System.out.println("Сумма всех зарплат сотрудников в месяц: " + costAmount());
        System.out.println("Сотрудник с минимальной зарплатой: " + employeeWithMinSalary());
        Employee employeeWithMaxSalary = getEmployeeMaxSalary();
        if (employeeWithMaxSalary == null) {
            System.out.println("Нет сотрудника с максимальной зарплатой");
        } else {
            System.out.println("Сотрудник с максимальной зарплатой: " + employeeWithMaxSalary);
        }
        System.out.println("Среднее значение зарплат: " + getAverageValueSalary());
        printEmployeesNames();
        System.out.println(divideWords());
    }

    public static void printAllEmployees() { //для вывода всех сотрудников
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee);
            }
        }
    }

    public static int costAmount() { //сумма в месяц всех зарплат
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static Employee getEmployeeMaxSalary() { //макс.зарплата
        int max = Integer.MIN_VALUE;
        Employee targetEmployee = null; //сотрудник, которого мы ищем
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() > max) {
                max = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static Employee employeeWithMinSalary() { //мин.зарплата
        int min = Integer.MAX_VALUE;
        Employee targetEmployee = null; //сотрудник, которого мы ищем
        for (Employee employee : employees) {
            if (employee != null && employee.getSalary() < min) {
                min = employee.getSalary();
                targetEmployee = employee;
            }
        }
        return targetEmployee;
    }

    public static int getAverageValueSalary() { //средн.знач.зарплат
        int sum = 0;
        for (Employee employee : employees) {
            if (employee != null) {
                sum += employee.getSalary() / 5;
            }
        }
        return sum;
    }

    public static void printEmployeesNames() { //печать всех Ф.И.О. сотрудников отдельно
        for (Employee employee : employees) {
            if (employee != null) {
                System.out.println(employee.getFullName());
            }
        }
    }

    public static Employee findEmployee(String name) {
        for (Employee employee : employees) {
            if (employee != null && employee.getFullName().equals(name)) {
                return employee;
            }
        }
        return null;
    }

    //Задача к курсовой: Напишите программу, которая разделяет любую строку на две части ровно пополам по количеству символов.
    public static List<String> divideWords (){
        String str = "i'dliketochangemyjob";
        int size = 7;
        List<String> tokens = new ArrayList<>();
        for (int start = 0; start < str.length(); start += size) {
            tokens.add(str.substring(start, Math.min(str.length(), start + size)));
            }
        return tokens;
    }

}