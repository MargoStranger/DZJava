package ru.margostranger.hw2;
/* 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
        * # поле с балансом
        * # конструктор, который принимает начальное значение баланса
        * # реализация всех методов

 */
public abstract class AbstractAccount implements IAccount{
    double balance;
    public AbstractAccount(double b){
        balance = b;
    }

    @Override
    public double getAmount() {
        return balance;
    }

    @Override
    public void put(double amount) {
        if(amount <= 0)
        {
            throw new IllegalArgumentException("Неправильная сумма пополнения");
        }
        balance += amount;
    }

    @Override
    public void take(double amount) {
        if(amount > balance)
        {
            throw new IllegalArgumentException("Недостаточно средств на счету");
        }
        balance -= amount;
    }
}
