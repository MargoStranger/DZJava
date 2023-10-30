/* - Кредитный счет (CreditAccount)
        * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
        * То есть, если снимаем 100 у.е., то снять нужно 101.
*/
public class CreditAccount extends Account {
    public CreditAccount(int balance) {
        super(balance);
    }

    @Override
    public int take(int removeBalance) {
        int resultSum = (int) (0.01 * removeBalance + removeBalance);
        return super.take(resultSum);
    }
}
