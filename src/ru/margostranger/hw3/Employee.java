/**
 * Реализовать класс Сотрудник (Employee) c полями:
 * 1. Имя
 * 2. Возраст
 * 3. Зарплата
 * 4. Наименование департамента
 * */
package ru.margostranger.hw3;

public class Employee implements Comparable <Employee>{
    private String name;
    private int age;
    private int salary;
    private String deportmentName;

    public Employee(String name, int age, int salary, String deportmentName){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.deportmentName = deportmentName;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getDeportmentName() {
        return deportmentName;
    }

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(age, o.age);
    }

    @Override
    public String toString() {
        return "Employee[" + age + "," + salary + "," + deportmentName + "]";
    }
}
