package ru.margostranger.hw3;

import java.util.Comparator;

public class DeportmaneNameComparator implements Comparator <Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        return Integer.compare(o1.getDeportmentName().toLowerCase().charAt(0), o2.getDeportmentName().toLowerCase().charAt(0));
    }
}
