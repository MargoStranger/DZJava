import ru.margostranger.hw2.CreditAccount2;
import ru.margostranger.hw2.FixedAmountAccount;

/**
 * Модифицируем пример, описанный в предыдущем домашнем задании (со счетами).
 * {@link ru.margostranger}
 *
 * 1. Класс IAccount превратить в интерфейс с методами:
 * # double getAmount() - получение текущего баланса
 * # void put(double amount) - пополнить счет
 * # void take(double amount) - снять средства со счета
 *
 * 2. Создать базовый абстрактный класс AbstractAccount, в котором будет общая часть:
 * # поле с балансом
 * # конструктор, который принимает начальное значение баланса
 * # реализация всех методов
 *
 * 3. Добавить еще один класс FixedAmountAccount с особенностью: методы put, take НЕ изменяют баланс.
 *
 * 4.* Класс AbstractAccount можно реализовать хитрее. Пример ниже.
 */


public class HomeWork2 {
    public static void main(String[] args) {
        CreditAccount2 evgeniyCreditAccount2 = new CreditAccount2(1000.001);
        evgeniyCreditAccount2.take(101.001);
        double amountAftorTake = evgeniyCreditAccount2.getAmount();
        System.out.println(amountAftorTake);

        evgeniyCreditAccount2.put(200);
        double amountAftorPut = evgeniyCreditAccount2.getAmount();
        System.out.println(amountAftorPut);

        FixedAmountAccount margoFix = new FixedAmountAccount(1500);
        margoFix.put(100);
        amountAftorPut = margoFix.getAmount();
        System.out.println(amountAftorPut);
        margoFix.take(300);
        amountAftorTake = margoFix.getAmount();
        System.out.println(amountAftorTake);

    }
}
