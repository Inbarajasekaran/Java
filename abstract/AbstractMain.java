public class AbstractMain {
    public static void main(String[] args) {
        // AbstractClassA abstractClass = new AbstractClassA();
        ClassToCallAbstractClass callAbstractClass = new ClassToCallAbstractClass();
        callAbstractClass.print5Numbers();
        callAbstractClass.print5Letters();
    }
}
