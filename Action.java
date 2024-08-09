
public class Action {

    int age = 16;

    public static void main(String[] args) {
        Person person = new Person();
        person.printAge();
        person.increesAge();
        person.printAge();
// newAge getter both
person.newAge(25);
System.out.println("New age" + person.getter());

person.both("Zach",14);
System.out.println("new age(part 2)" + person.getter());
    }

}
