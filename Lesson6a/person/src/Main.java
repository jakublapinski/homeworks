public class Main {
    public static void main(String args[]) {
        Person p1 = new Person();
        Person p2 = new Person();
        Person p3 = new Person();
        p2.setAge(10);
        p3.setAge(5);
        p1.setName("John");
        p2.setName("jdkaf");
        p3.setName("kjdsk");

        p1.introduceYourself();
        p2.introduceYourself();
        p3.introduceYourself();
    }
}

