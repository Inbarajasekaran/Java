public class Operators {

    public static class Assignment {
        //Assignment Operator
        public String assignmentOperator() {
            String name = "Inba";
            return name;
        }
    }

    public static class Unary {
        public Integer increment() {
            int num = 0;
            // ++num;
            // return num;
            return num++;
        }

        public Integer decrement() {
            int num = 1;
            // --num;
            // return num;
            return num--;
        }
    }

    public static class Arithmetic {
        int num1 = 1;
        int num2 = 2;

        public Integer add() {
            return num1 + num2;
        }

        public Integer sub() {
            return num1 - num2;
        }

        public Integer prod() {
            return num1 * num2;
        }

        public Integer divide() {
            return num1 / num2;
        }

        public Integer mod() {
            return num1 % num2;
        }
    }

    public static void main(String[] args) {
        Arithmetic arithmetic = new Arithmetic();
        arithmetic.add();
    }
}