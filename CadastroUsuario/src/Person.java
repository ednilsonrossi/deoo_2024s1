public class Person implements Comparable<Person> {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Método compareTo para comparar pessoas com base na idade
    @Override
    public int compareTo(Person otherPerson) {
        return this.age - otherPerson.age;
    }
}
