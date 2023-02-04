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

    @Override
    public void print5Numbers() {
        super.print5Numbers(); // // super keyword used to call the parent function inside the abstract class
        String saySomething = "By superkeyword we called the parent functionality and by overriding we can also add ne functionalities in below";
        System.out.println(saySomething);
        int[] next5Numbers = { 6, 7, 8, 9, 10 };
        for (int i : next5Numbers) {
            System.out.println(i);
        }
    }

    @Override
    void print5Letters() {
        String[] lettersArray = { "A", "B", "C", "D", "E" };
        for (int i = 0; i < lettersArray.length; i++) {
            System.out.println(lettersArray[i]);
        }
    }

    // public static void main(String[] args) {
    // ClassToCallAbstractClass callAbstractClass = new ClassToCallAbstractClass();
    // AbstractClass abstractClass = new ClassToCallAbstractClass();
    // abstractClass.print5Numbers();
    // abstractClass.print5Letters();
    // callAbstractClass.print5Numbers();
    // callAbstractClass.print5Letters();
    // }

}
