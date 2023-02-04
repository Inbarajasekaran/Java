public class AbstractMain {
    public static void main(String[] args) {
        // AbstractClass abstractClass = new AbstractClass();
        // AbstractClass abstractClass = new ClassToCallAbstractClass();
        ClassToCallAbstractClass callAbstractClass = new ClassToCallAbstractClass();
        callAbstractClass.print5Numbers();
        callAbstractClass.print5Letters();
    }
}
