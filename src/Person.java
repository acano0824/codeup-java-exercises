public class Person {
    public static void main(String[] args) {
        Person studentA = new Person("Bob");
        System.out.println(studentA.name);
        System.out.println(studentA.getName());
        studentA.setName("Sally");
        System.out.println(studentA.name);
        studentA.sayHello();


//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
//        System.out.println(person1.getName().equals(person2.getName()));
//        System.out.println(person1 == person2);

        Person person1 = new Person("John");
        Person person2 = person1;
        person2.setName("Jack");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        System.out.println(person1 == person2);


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
