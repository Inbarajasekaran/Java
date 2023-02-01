public interface InterfaceB extends InterfaceA {
    boolean active = true;

    default boolean sayMyStatus() {
        System.out.println(active);
        return active;
    }

    int mobileNumber();
}