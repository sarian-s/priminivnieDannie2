public class Main {
    public static void main(String[] args) {

        int amount = 1_000;
        int amountAdded = 1200;
        int bonusToAmount = 100;
        int bonus;

        if (amountAdded > 1000) {
            bonus = amountAdded / bonusToAmount;
        } else {
            bonus = 0;
        }
        System.out.println("итоговая сумма на счету клиента " + (bonus + amount + amountAdded));
    }
}
