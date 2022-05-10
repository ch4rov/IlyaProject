package YouTubeLessons;

public class Object_ToString {
    public static void main(String[] args) {
            Human h1 = new Human("Bob", 40);

        System.out.println(h1 /*h1.toString();*/ );
    }
}


class Human extends Object {
    private String name;
    private int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name+", "+age;
    }
}
