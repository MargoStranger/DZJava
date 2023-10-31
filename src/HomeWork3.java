import ru.margostranger.hw3.DeportmaneNameComparator;
import ru.margostranger.hw3.Employee;
import ru.margostranger.hw3.SalaryComparator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Реализовать класс Сотрудник (Employee) c полями:
 * 1. Имя
 * 2. Возраст
 * 3. Зарплата
 * 4. Наименование департамента
 *
 * Необходимо:
 * 1. Создать список из разных сотрудников (штук 20)
 * 2. Отсортировать список по возрастанию возраста,
 * по убыванию зарплаты,
 * и по наименованию отдела (в лексикографическом порядке) (вывести на консоль).
 * Подумать о том, какую сортирвку сделать по умолчанию (заложить в класс, интерфейс Comparable), а какие две сделать внешними (интерфейс Comparator).
 */
public class HomeWork3 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        String [] deportments = new String[]{"HR", "IT"};
        for (int i = 0; i < 21; i++) {
            String deportment = deportments[0];
            if (i % 2 == 0) {
               deportment = deportments[1];
            }
            Employee people = new Employee("name" + i, 50 + i, 10000 + i, deportment);
            employeeList.add(people);
        }
        Collections.shuffle(employeeList);
        System.out.println(employeeList);

        Collections.sort(employeeList);
        System.out.println(employeeList);

        employeeList.sort(new SalaryComparator());
        System.out.println(employeeList);

        employeeList.sort(new DeportmaneNameComparator());
        System.out.println(employeeList);
    }
}
