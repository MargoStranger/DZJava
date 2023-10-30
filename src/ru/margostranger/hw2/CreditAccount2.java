package ru.margostranger.hw2;

/* - Кредитный счет (ru.margostranger.hw1.CreditAccount)
        * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
        * То есть, если снимаем 100 у.е., то снять нужно 101.
*/
public class CreditAccount2 extends AbstractAccount {
    public CreditAccount2(double balance) {
        super(balance);
    }

    @Override
    public void take(double removeBalance) {
        int resultSum = (int) (0.01 * removeBalance + removeBalance);
        super.take(resultSum);
    }
}
