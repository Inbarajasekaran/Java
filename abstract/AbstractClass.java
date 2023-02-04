abstract class AbstractClass { // // abstract class

    // public void print5Numbers(String test) {
    public void print5Numbers() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
    }

    abstract void print5Letters(); // // abstract method

}

class ClassToCallAbstractClass extends AbstractClass {

    // // @Override
    // public void print5Numbers() {
    // }

    @Override
    void print5Letters() {
        String[] lettersArray = { "A", "B", "C", "D", "E" };
        for (int i = 0; i < lettersArray.length; i++) {
            System.out.println(lettersArray[i]);
        }
    }

    // public static void main(String[] args) {
    // ClassToCallAbstractClass callAbstractClass = new ClassToCallAbstractClass();
    // callAbstractClass.print5Numbers();
    // callAbstractClass.print5Letters();
    // }

}
