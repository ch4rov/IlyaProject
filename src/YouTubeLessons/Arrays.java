package YouTubeLessons;

public class Arrays {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        System.out.println("=== 1 ===");
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 10;
        }
        System.out.println("=== 2 ===");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
            int[] numbers2 = {1, 2, 3};
            for (int f = 0; f < numbers2.length; f++) {
                numbers2[f] = f * 10;
                System.out.println("=== 3 ===");
                System.out.println(numbers2[0]); // 0
                System.out.println(numbers2[1]); // 10
                System.out.println(numbers2[2]); // 20
            }
        }
    }
}
