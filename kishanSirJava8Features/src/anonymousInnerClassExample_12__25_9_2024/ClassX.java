package anonymousInnerClassExample_12__25_9_2024;

public class ClassX {
    static OuterClassA out = new OuterClassA() {
        void print() {
            System.out.println("Start");
        }
    };

    public static void main(String[] args) {

        out.print();
    }
}
