public class figureMain {
    public static void main(String[] args) {
        Forma f1 = Factory.createForma("CIRCLE");
        Forma f2 = Factory.createForma("RECTANGLE");
        Forma f3 = Factory.createForma("TRIANGLE");
        System.out.println(f1.toString());
        System.out.println(f2.toString());
        System.out.println(f3.toString());
    }
}