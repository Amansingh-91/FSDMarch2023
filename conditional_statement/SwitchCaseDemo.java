public class SwitchCaseDemo {
    public static void main(String[] args) {
        // switch case works on expression(mathematical)

        int amount = 10;
        switch (amount-5) {
            case 5:
                System.out.println("one leter water");
                break;
            case 10:
                System.out.println("2 leters of water");
                break;
            default:
                System.out.println("not valid amount");
                break;
        }
    }
}
