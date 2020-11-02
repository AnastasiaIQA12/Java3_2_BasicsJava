public class Main {
    public static void main(String[] args) {
        int current_account = 10000;
        int deposited_amount = 110000;
        int bonus = 0;
        if (deposited_amount >= 100000) {
            bonus = (int) (deposited_amount / 100);
        }
        current_account = (current_account + deposited_amount + bonus) / 100;

        if (bonus > 0) {
            System.out.println("Клиент пополнил счёт на " + deposited_amount / 100 + " рублей - бонус равен " + bonus / 100 + " рублям, итоговая сумма на счету клиента - " + current_account  + " рублей");
        } else {
            System.out.println("Клиент пополнил счёт на " + deposited_amount / 100 + " рублей - бонусов нет, итоговая сумма на счету клиента - " + current_account + " рублей");
        }
    }
}
