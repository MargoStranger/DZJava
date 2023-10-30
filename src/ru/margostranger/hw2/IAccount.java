package ru.margostranger.hw2;
/* 1. Класс IAccount превратить в интерфейс с методами:
        * # double getAmount() - получение текущего баланса
        * # void put(double amount) - пополнить счет
        * # void take(double amount) - снять средства со счета

 */
public interface IAccount {
    double getAmount();
    void put(double amount);
    void take(double amount);
}
