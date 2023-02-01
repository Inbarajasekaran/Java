public class Condition {
    int age = 10;

    public void checkAge() {
        if (this.age > 10) { // // if condition
            System.out.println("Age is greater than 10");
        } else { // // else condition
            System.out.println("Age is lesser than 10");
        }
    }
    public static void main(String[] args) {
        Condition conditionCheckAge = new Condition();
        conditionCheckAge.checkAge();
    }
}