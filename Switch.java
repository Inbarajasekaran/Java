public class Switch {
    public static void main(String[] args) {
        int number = 2;
        switch (number) {
            case 1:
                System.out.println("Odd Number");
                break;
            case 2:
                System.out.println("Even Number");
                break;
            case 3:
                System.out.println("Odd Number");
                break;
            case 4:
                System.out.println("Even number");
                break;
            default:
                if (number / 2 == 0) {
                    System.out.println("The given number is : " + number + " The number is Even");
                } else {
                    System.out.println("The given number is : " + number + " The number is Odd");
                }
        }
    }
}
