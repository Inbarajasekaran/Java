class Variable {
    static class localVariableClass {
        public static Integer localVariable() {
            int number = 3; // Local variable
            System.out.println(number);
            return number;
        }
    }

    static class InstantVariableClass {
        String name; // Instance variable
        public void setName(String nameValue) {
            name = nameValue;
        }
    }

    static class StaticVariableClass {
        static String role = ""; // Static variable or Class Variable
    }

    public static void main(String[] args) {
        // //LOCAL VARIABLE // //
        localVariableClass.localVariable();

        // //INSTANT VARIABLE // //
        InstantVariableClass instantVariable = new InstantVariableClass(); // creating  instance to access instance variable
        instantVariable.setName("INBA");
        // System.out.println(Variable.InstantVariableClass.name);
        System.out.println(instantVariable.name);

        // // STATIC VARIABLE // //
        StaticVariableClass.role = "Software Developer"; // static variable and static methods can be access inside the class anywhere
        System.out.println(Variable.StaticVariableClass.role);
        // System.out.println(staticVariable.role);
    }
}