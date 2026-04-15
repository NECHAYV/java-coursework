public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[10];

        employees[0] = new Employee("Kentucky Fried", 1, 5000);
        employees[1] = new Employee("Bugha", 2, 600000);
        employees[2] = new Employee("Mongraal", 3, 550000);
        employees[3] = new Employee("Ninja", 1, 700000);
        employees[4] = new Employee("Tfue", 4, 450000);
        employees[5] = new Employee("Clix", 5, 300000);
        employees[6] = new Employee("MrSavage", 2, 980000);
        employees[7] = new Employee("Mitr0", 3, 999000);
        employees[8] = new Employee("Benjyfishy", 4, 4000000);
        employees[9] = new Employee("Dakotaz", 1, 100000);


        System.out.println("Все сотрудники:");
        Employee.printAllEmployees(employees);

        System.out.println("\nСумма затрат на зарплату в месяц: " + Employee.calculateTotalSalary(employees));
        Employee minSalaryEmployee = Employee.findEmployeeWithMinSalary(employees);
        System.out.println("\nСотрудник с минимальной зарплатой: " + minSalaryEmployee);

        Employee maxSalaryEmployee = Employee.findEmployeeWithMaxSalary(employees);
        System.out.println("\nСотрудник с максимальной зарплатой: " + maxSalaryEmployee);

        System.out.println("\nСреднее значение зарплат: " + Employee.calculateAverageSalary(employees));

        System.out.println("\nФИО всех сотрудников:");
        Employee.printEmployeeNames(employees);
    }
}
