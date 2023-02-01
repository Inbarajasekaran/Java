public interface InterfaceA {
    public String name = "Inba";

    default String sayMyName() {
        System.out.println(name);
        return name;
    }
}
