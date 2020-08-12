package school.upcasting;

class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Researcher {
}


public class InstanceOfEx {
    static void print(Person person) {
        if (person instanceof Person) {
            System.out.println("Person");
        }
        if (person instanceof Person) {
            System.out.println("Person");
        }
        if (person instanceof Student) {
            System.out.println("Student");
        }
        if (person instanceof Researcher) {
            System.out.println("Researcher");
        }
        if (person instanceof Professor) {
            System.out.println("Professor");
        }
    }

    public static void main(String[] args) {
        System.out.print("new Student() -> ");
        print(new Student());
        System.out.print("new Researcher() -> ");
        print(new Researcher());
        System.out.print("new Professor() -> ");
        print(new Professor());
    }
}
