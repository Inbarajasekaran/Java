public class loop {
    public static void basicLoop() {
        for (int i = 1; i <= 5; i++ ) {
            System.out.println(i);
        }
    } 

    public static void nestedLoop() {
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println(i);
                System.out.println(j);
            }
        }
    }

    public static void main(String[] args) {
        // basicLoop();
        nestedLoop();
    }
}
