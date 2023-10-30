package ru.margostranger.hw2;
// 3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.
public class FixedAmountAccount extends AbstractAccount{
    public FixedAmountAccount(double b) {
        super(b);
    }

    @Override
    public void take(double amount) {}

    @Override
    public void put(double amount) {}
}
