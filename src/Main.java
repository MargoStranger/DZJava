     /*
     * 1. Создать класс "Счет в банке" - Account.
     * У этого класса должно быть поле с текущим балансом на счете.
     * У этого класса должно быть 3 метода:
     * - (put) Пополнить счет - принимат положительное число, увеличивает текущий баланс
     * - (take) Вывести средства - принимат положительное число, уменьшает текущий баланс
     * - (getAmount) Показать баланс - ничего не принимает, возвращает текущий баланс (getter)
     *
     * 2. Создать несколько наследников.
     * - Кредитный счет (CreditAccount)
     * Особенность: на каждое снятие нужно наложить комиссию в размере 1% от суммы снятия.
     * То есть, если снимаем 100 у.е., то снять нужно 101.
     * - Депозитный счет (DepositAccount) *
     * Особенность: нельзя снимать средства чаще, чем раз в месяц.
     * То есть, нужно завести поле с датой последнего снятия, и использовать его.
     * (Для дат лучше использовать LocalDate, пример в классе Dates в проекте урока)
     */

     import java.time.LocalDate;

     public class Main {
         public static void main(String[] args) {
             DepositAccount evgeniyDepositAccount = new DepositAccount(100, LocalDate.of(2023, 9, 20));
             int resultBalanceEvgeniy = evgeniyDepositAccount.take(10);
             System.out.println(resultBalanceEvgeniy);
             try {
                 DepositAccount margoDepositAccount = new DepositAccount(100000, LocalDate.of(2023, 10, 15));
                 int resultBalanceMargo = margoDepositAccount.take(1000);
                 System.out.println(resultBalanceMargo);
             } catch (Throwable ex) {
                 ex.printStackTrace();
             }

             CreditAccount evgeniyCreditAccount = new CreditAccount(50000); //50 000 - 10 000 - 100 = 39900
             int creditRemoveEvgeniy = evgeniyCreditAccount.take(10000);
             System.out.println(creditRemoveEvgeniy);


         }
     }