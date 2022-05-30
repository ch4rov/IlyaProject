package BookJavaMetodsProgrammingQuestions;

interface Animal{
    public void eat();
    public void sleep();
    public void test();
}

public class AnimusClass {
    public static void main(String[] args) {
    Animal animal1 = new Animal() {
        @Override
        public void eat() {
            System.out.println("Animal one is eating..");
        }

        @Override
        public void sleep() {
            System.out.println("Animal one is sleeping...");
        }

        @Override
        public void test() {
            System.out.println("Animal one is testing..");
        }
    };
    Animal animal2 = new Animal() {
        @Override
        public void eat() {
            System.out.println("Animal two is eating...");
        }

        @Override
        public void sleep() {
            System.out.println("Animal two is sleeping...");
        }

        @Override
        public void test() {
            System.out.println("Animal two is testing...");
        }
    };
    }

}
