public class AbstractMain {
    public static void main(String[] args) {
        // AbstractClass abstractClass = new AbstractClass();
        ClassToCallAbstractClass callAbstractClass = new ClassToCallAbstractClass();
        callAbstractClass.print5Numbers();
        callAbstractClass.print5Letters();
    }
}
