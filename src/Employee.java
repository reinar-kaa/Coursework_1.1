public class Employee {
    private int salary; //зарплата
    public final String fullName; //Ф.И.О.
    private final int id; //поле объекта
    private static int counter = 0; //счётчик - поле класса
    private int department; //отдел

    public Employee(int salary, String fullName) {
        this.fullName = fullName;
        this.salary = salary;
        this.id = counter++;
    }

    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getFullName() {
        return this.fullName;
    }

    public int getId() {
        return id;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }



    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", fullName='" + fullName + '\'' +
                ", id=" + id +
                ", department=" + department +
                '}';
    }



}
