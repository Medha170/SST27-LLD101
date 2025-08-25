public class Demo08 {
    public static void main(String[] args) {
        Pedal v = new Bicycle();
        // v.startEngine(); // crash
        v.pedal(10);
    }
}
