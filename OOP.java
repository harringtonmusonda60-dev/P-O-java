class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void printDetails() { 
        System.out.println(this.name +": " + this.age + " years old.");
    }
}

public class OOP {
    public static void main(String[] args) {
        Person[] People = {
            new Person("Harrington", 24),
            new Person("Vanessa", 17),
            new Person("Harrison", 35)
        };

        for (Person p : People) {
            p.printDetails();
        }
    }
}