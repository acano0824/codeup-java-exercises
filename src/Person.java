public class Person {
    public static void main(String[] args) {
        Person studentA = new Person("Bob");
        System.out.println(studentA.name);
        System.out.println(studentA.getName());
        studentA.setName("Sally");
        System.out.println(studentA.name);
        studentA.sayHello();
    }

    private String name;

    // returns the person's name
    public String getName() {
        return this.name;
    };

    // changes the name property to the passed value
    public void setName(String name) {
        this.name = name;
    };

    // prints a message to the console using the person's name
    public void sayHello() {
        System.out.println("Hello, " + this.name + "!");
    };

    public Person (String name) {
        this.name = name;
    };

}
