
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
        PaymentCard paulCard = new PaymentCard(20);
        PaymentCard mattCard = new PaymentCard(30);

        paulCard.eatHeartily();
        mattCard.eatAffordably();
        System.out.println("Paul: "+paulCard.toString());
        System.out.println("Matt: "+mattCard.toString());

        paulCard.addMoney(20.0);
        mattCard.eatHeartily();

        System.out.println("Paul: "+paulCard.toString());
        System.out.println("Matt: "+mattCard.toString());

        paulCard.eatAffordably();
        paulCard.eatAffordably();

        mattCard.addMoney(50.0);

        System.out.println("Paul: "+paulCard.toString());
        System.out.println("Matt: "+mattCard.toString());

    }
}
