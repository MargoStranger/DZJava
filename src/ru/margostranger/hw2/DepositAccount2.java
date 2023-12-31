package ru.margostranger.hw2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/* - Депозитный счет (ru.margostranger.hw1.DepositAccount) *
 * Особенность: нельзя снимать средства чаще, чем раз в месяц.
 * То есть, нужно завести поле с датой последнего снятия, и использовать его.
 * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
 */
public class DepositAccount2 extends AbstractAccount {
    public DepositAccount2(double balance, LocalDate date) {
        super(balance);
        this.date = date;
    }
    private LocalDate date;

    @Override
    public void take(double removeBalance) {
        LocalDate now = LocalDate.now();
        long different = ChronoUnit.MONTHS.between(date, now);
        if (different >= 1) {
            date = now;
            super.take(removeBalance);
        }
        else throw new IllegalStateException("Месяц еще не прошёл");
    }
}
