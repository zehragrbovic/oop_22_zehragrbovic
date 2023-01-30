public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        if(name == null || name == "" || name.length() > 40 || age < 0 || age > 120) {
            throw new IllegalArgumentException("Input not valid.");
        }
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + ": " + this.age;
    }
}
