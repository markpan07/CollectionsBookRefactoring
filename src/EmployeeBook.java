import java.util.*;

public class EmployeeBook {
    private Map<String, Employee> employees = new HashMap<>();

    public Map<String, Employee> getEmployees() {
        return employees;
    }

    public String getKey(Employee empl) {
        return empl.getLastName() + empl.getFirstName() + empl.getThirdName();
    }

    public void addEmployee(Employee employee) {
        employees.put(getKey(employee), employee);
    }

    public void addEmployee(String lastName, String firstName, String thirdName, int department, int salary) {
        addEmployee(new Employee(lastName, firstName, thirdName, department, salary));
    }

    public Employee getEmployee(String key) {
        return employees.get(key);
    }

    public Employee getEmployee(int id) throws RuntimeException {
        for (Employee empl : employees.values()) {
            if (empl != null && empl.getId() == id) {
                return empl;
            }
        }
        throw new RuntimeException("Сотрудник не найден");

    }

    public void removeEmployee(String key) {
        employees.remove(key);
    }


    public void removeEmployee(Employee employee) {
        employees.remove(getKey(employee));
    }





    /*
    employees.put( ,new Employee("Pankov", "Mark", "Dmitrievich", 1, 270_000));
    employees.put( ,new Employee("Gres", "Roman", "Antonovich", 3, 300_000));
    employees.put( ,new Employee("Saveliev", "Yuriy", "Afanasievich", 5, 190_000));
    employees.put( ,new Employee("Pavlov", "Stepan", "Aleksandrovich", 4, 120_000));
    employees.put( ,new Employee("Grishin", "Dmitriy", "Stepanovich", 4, 105_000));
    employees.put( ,new Employee("Miheev", "Oleg", "Evgenievich", 2, 111_000));
    employees.put( ,new Employee("Lobov", "Aleksandr", "Dmitrievich", 5, 100_000));
    employees.put( ,new Employee("Konstantinov", "Gulnaz", "Grigorievich", 3, 89_000));
    employees.put( ,new Employee("Medakov", "Artem", "Pavlovich", 2, 90_000));

    employees[1].setSalary(150000);
    employees[1].setDepartment(3);


    public Employee[] getEmployees() {
        return employees;
    }
       */


    //Method for employee manage


    public void changeSalary(Employee empl, int newSalary) {
        if (employees.containsKey(getKey(empl))) {
            employees.get(getKey(empl)).setSalary(newSalary);
        }

    }


    public void changeSalary(String key, int newSalary) {
        if (employees.containsKey(key)) {
            employees.get(key).setSalary(newSalary);
        }

    }

    public void changeDepartment(Employee empl, int newDepartment) {
        if (employees.containsKey(getKey(empl))) {
            employees.get(getKey(empl)).setDepartment(newDepartment);
        }
    }

    public void changeDepartment(String key, int newDepartment) {
        if (employees.containsKey(key)) {
            employees.get(key).setDepartment(newDepartment);
        }
    }


    public void removeEmployee(int id) {
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (entry.getValue().getId() == id) {
                employees.remove(entry.getKey());
            }
        }

    }

// Custom helpful methods


    public int getEmployeeQuantitySalaryLess(int salary) {
        int count = 0;
        for (Employee empl : employees.values()) {
            if ((empl != null) && (empl.getSalary() < salary)) {
                count++;
            }
        }
        return count;
    }

    public int getEmployeeQuantitySalaryMore(int salary) {
        int count = 0;
        for (Employee empl : employees.values()) {
            if ((empl != null) && (empl.getSalary() >= salary)) {
                count++;
            }
        }
        return count;
    }

    public List<Employee> getEmployeeListWithSalaryLess(int salary) {
        List<Employee> employeeList = new ArrayList<>();

        for (Employee empl : employees.values()) {
            if ((empl != null) && (empl.getSalary() < salary)) {
                employeeList.add(empl);
            }
        }
        return employeeList;

    }

    public List<Employee> getEmployeeListWithSalaryMore(int salary) {
        List<Employee> employeeList = new ArrayList<>();

        for (Employee empl : employees.values()) {
            if ((empl != null) && (empl.getSalary() > salary)) {
                employeeList.add(empl);
            }
        }
        return employeeList;

    }


// Methods for all employees

    /*public void printEmployeesWithDepartment() {
        System.out.println("");
        System.out.println("Список сотрудников по департаментам");
        System.out.println("Департамент 1:");
        printArray(getEmployeeInfoListInDepartment(1));
        System.out.println("");
        System.out.println("Департамент 2:");
        printArray(getEmployeeInfoListInDepartment(2));
        System.out.println("");
        System.out.println("Департамент 3:");
        printArray(getEmployeeInfoListInDepartment(3));
        System.out.println("");
        System.out.println("Департамент 4:");
        printArray(getEmployeeInfoListInDepartment(4));
        System.out.println("");
        System.out.println("Департамент 5:");
        printArray(getEmployeeInfoListInDepartment(5));
        System.out.println("");
    }*/

    public int getEmployeeQuantity() {
        return employees.size();
    }

    public double countEmployeeSalarySum() {
        int salarySum = 0;
        for (Employee empl : employees.values()) {
            salarySum += empl.getSalary();
        }
        return salarySum;
    }

    public Employee findEmployeeWithMinimalSalary() {
        int minSalary = Integer.MAX_VALUE;
        Employee employee = null;
        for (Employee empl : employees.values()) {
            if (empl.getSalary() < minSalary) {
                employee = empl;
            }
        }
        return employee;
    }

    public Employee findEmployeeWithMaximalSalary() {
        int maxSalary = Integer.MIN_VALUE;
        Employee employee = null;
        for (Employee empl : employees.values()) {
            if (empl.getSalary() > maxSalary) {
                employee = empl;
            }
        }
        return employee;
    }


    public double countMeanSalary() {
        return countEmployeeSalarySum() / getEmployeeQuantity();
    }

    public List<String> getEmployeeFullNameList() {
        List<String> fullNameList = new ArrayList<>();

        for (Employee empl : employees.values()) {
            fullNameList.add(empl.getLastName() + " " +
                    empl.getFirstName() + " " +
                    empl.getThirdName());
        }
        return fullNameList;
    }

    public void increaseSalaryForAllEmployees(int percent) {
        for (Employee empl : employees.values()) {
            if (empl != null) {
                int newSalary = empl.getSalary() + (empl.getSalary() / 100 * percent);
                empl.setSalary(newSalary);
            }
        }
    }


    //Methods for department
    public List<Employee> getEmployeeInfoListInDepartment(int department) {
        List<Employee> fullNameList = new ArrayList<>();

        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (Objects.nonNull(entry.getValue()) && entry.getValue().getDepartment() == department) {
                fullNameList.add(entry.getValue());
            }
        }
        return fullNameList;

    }

    public int getEmployeeQuantityInDepartment(int department) {
        int count = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (Objects.nonNull(entry.getValue()) && entry.getValue().getDepartment() == department) {
                count += 1;
            }
        }
        return count;
    }

    public Employee findEmployeeWithMinimalSalary(int department) {
        int minSalary = findEmployeeWithMaximalSalary().getSalary();
        Employee employee = findEmployeeWithMaximalSalary();
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (Objects.nonNull(entry.getValue()) &&
                    (entry.getValue().getDepartment() == department) &&
                    (entry.getValue().getSalary()) < minSalary) {
                employee = entry.getValue();
            }
        }
        return employee;
    }

    public Employee findEmployeeWithMaximalSalary(int department) {
        int maxSalary = findEmployeeWithMinimalSalary().getSalary();
        Employee employee = findEmployeeWithMinimalSalary();
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (Objects.nonNull(entry.getValue()) &&
                    (entry.getValue().getDepartment() == department) &&
                    (entry.getValue().getSalary()) > maxSalary) {
                employee = entry.getValue();
            }
        }
        return employee;
    }


    public int countSumOfSalaryInDepartment(int department) {

        int salarySum = 0;
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (Objects.nonNull(entry.getValue()) && (entry.getValue().getDepartment() == department)) {
                salarySum += entry.getValue().getSalary();
            }

        }
        return salarySum;
    }

    public double countMeanSalaryInDepartment(int department) {
        int sum = countSumOfSalaryInDepartment(department);
        int peopleInDepartment = getEmployeeQuantityInDepartment(department);
        return sum / peopleInDepartment;
    }

    public void increaseSalaryForEmployeesInDepartment(int department, int percent) {
        for (Map.Entry<String, Employee> entry : employees.entrySet()) {
            if (Objects.nonNull(entry.getValue()) && (entry.getValue().getDepartment() == department)) {
                entry.getValue().setSalary(entry.getValue().getSalary() + (entry.getValue().getSalary() / 100 * percent));

            }
        }

    }

}
