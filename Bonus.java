public class Bonus {
    public static void main(String[] args) {
        float Balance = 100;
        float Payment = 200;
        float TotalBalance;
        if (Payment < 1000) {
            TotalBalance = Balance + Payment;
        } else {
            int Bonus = (int) (Payment / 100);
            TotalBalance = Balance + Payment + Bonus;
        }
        System.out.println(TotalBalance);
    }
}