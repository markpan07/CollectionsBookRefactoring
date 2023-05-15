public class Main {


    public static void main(String[] args) {
        EmployeeBook book = new EmployeeBook();

        book.addEmployee("Perov", "Ivan", "Alekseevich", 1, 50_000);
        book.addEmployee("Pankov", "Mark", "Dmitrievich", 1, 150_000);
        book.addEmployee("Ivanov", "Samuil", "Olegovich", 1, 150_000);
        book.addEmployee("Gres", "Roman", "Dmitrievich", 1, 150_000);
        book.addEmployee("Miheev", "Oleg", "Evgenievich", 2, 111_000);
        book.addEmployee("Lobov", "Aleksandr", "Dmitrievich", 5, 100_000);
        book.addEmployee("Konstantinov", "Gulnaz", "Grigorievich", 3, 89_000);
        book.addEmployee("Medakov", "Artem", "Pavlovich", 2, 90_000);
        book.addEmployee("Grishin", "Aleksey", "Olegovich", 4, 95_000);
        book.addEmployee("Puzin", "Yuliy", "Alekseevich", 2, 95_000);

        System.out.println(book.getEmployees());
        System.out.println(book.getEmployee("PerovIvanAlekseevich"));

        System.out.println("Список сотрудников:");
        System.out.println(book.getEmployeeFullNameList());

        System.out.println("Поиск сорудника по запросу:");
        System.out.println(book.getEmployee("PankovMarkDmitrievich"));
        System.out.println("--------------------------------------------");

        book.removeEmployee("PankovMarkDmitrievich");
        System.out.println("Список сотрудников после удаления: ");
        System.out.println(book.getEmployeeFullNameList());
        //System.out.println(book.getEmployee(2));
        System.out.println("");


        System.out.println("--------------------------------------------");
        System.out.println(book.getEmployee("PerovIvanAlekseevich"));
        book.changeSalary("PerovIvanAlekseevich", 100_000);
        book.changeDepartment("PerovIvanAlekseevich", 3);
        System.out.println(book.getEmployee("PerovIvanAlekseevich"));







//старые тесты
      /*
        System.out.println("Сумма затрат на зп сотрудникам: " + countEmployeeSalarySum() + "\n");
        System.out.println("Всего сотрудников в компании: " + getEmployeeQuantity() + "\n");

        System.out.println("Средняя зп сотрудников: " + countMeanSalary() + "\n");
        System.out.println("Сотрудник с минимальной зп: \n" + findEmployeeWithMinimalSalary() + "\n");
        System.out.println("Сотрудник с максимальной зп: \n" + findEmployeeWithMaximalSalary() + "\n");

        System.out.println("Список ФИО всех сотрудников: ");
        printArray(getEmployeeFullNameList());
        System.out.println("___________________________________");

        System.out.println("Информация по 2му департаменту:" + "\n");
        System.out.println("Сотрудник с минимальной зп: \n" + findEmployeeWithMinimalSalary(2)+ "\n");
        System.out.println("Сотрудник с максимальной зп: \n" + findEmployeeWithMaximalSalary(5) + "\n");
        System.out.println("Сотрудники департамента: ");
        printArray(getEmployeeInfoListInDepartment(2));
        System.out.println("Сумма зарплат в департаменте: " + countSumOfSalaryInDepartment(2) +  "\n");
        System.out.println("Срденяя ЗП в департаменте: " + countMeanSalaryInDepartment(2) + "\n");
        System.out.println("ЗП после индексации на 10%% у сотрудников в департаменте");
        increaseSalaryForEmployeesInDepartment(2, 10);
        printArray(getEmployeeInfoListInDepartment(2));
        System.out.println("___________________________________");


        System.out.println("Сотрудники в  с ЗП меньше 100 000 рублей: " + getEmployeeQuantitySalaryLess(100000));
        printArray(getEmployeeListWithSalaryLess(100000));
        System.out.println();
        System.out.println("Сотрудники с ЗП больше 100 000 рублей: " + getEmployeeQuantitySalaryMore(100000));
        printArray(getEmployeeListWithSalaryMore(100000));*/
    }






}