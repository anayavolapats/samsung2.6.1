public class Main {
    public static void main(String[] args) {
        Person p = new Person("Test", 3);
        System.out.println(p);
        p.setAge(5);
        p.setName("Vasya");
        System.out.println(p);
    }
}
