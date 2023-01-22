public class Main {
    public static void main(String[] args) {
        Landline l1 = new Landline("56424125");
        Landline l2 = new Landline("89412456");

        l1.CallNumber("2345");
        l2.recieveCall("89412456");
        System.out.println(l2.answerCall());
    }
}