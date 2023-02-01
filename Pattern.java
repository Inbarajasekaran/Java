public class Pattern {
    static String star = "*";
    static String newStar = "";

    public static void verticallinePattern() {
        for (int i = 0; i < 5; i++) {
            System.out.println(star);
        }
    }

    public static void horizondallinePattern() {
        for (int i = 0; i < 5; i++) {
            newStar += star;
        }
        System.out.println(newStar);
    }

    public static void main(String[] args) {
        // verticallinePattern();
        // horizondallinePattern();
    }
}
