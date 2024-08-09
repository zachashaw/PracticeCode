
public class Person {

    int age = 16;
    String name = "zach";

    public void printAge() {
        System.out.println(age);
    }

    public void increesAge() {
        age++;
    }

    public void decreesAge() {
        age--;
    }

    public void newAge(int newAge) {
        age = newAge;
    }

    public void both(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    public int getter() {
        return age;
    }
}
