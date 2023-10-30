package ru.margostranger.hw1;

/*
     * 1. Создать класс "Счет в банке" - ru.margostranger.hw1.Account.
     * У этого класса должно быть поле с текущим балансом на счете.
     * У этого класса должно быть 3 метода:
     * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
     * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
     * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
 */
public class Account {
    private int balance;
    public Account(int balance)
    {
        this.balance = balance;
    };
    public int put(int addBalance) {
        if(addBalance > 0){
            balance += addBalance;
        }
        return balance;
    };
    public int take(int removeBalance) {
        if(removeBalance > 0){
            balance -= removeBalance;
        }
        return balance;
    };
    public int getAmount() {
        return balance;
    };
}
