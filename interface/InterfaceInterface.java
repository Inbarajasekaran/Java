public interface InterfaceInterface {
    int add();

    // // default method used to avoid the method override in the class
    default void testDefault() {
        System.out.println("Test Default from Interface");
    }

    default void testDefaultFromClass() {
        System.out.println("Test Default from Interface");
    }

    // // static method used to avoid the method overriding in the class
    // // but accessable only by its interface or class name
    static void testStatic() {
        System.out.println("Test static from Interface");
    }
}
