package YouTubeLessons.Queue;

import YouTubeLessons.StringBuilder;

public class QueueStackTest {
    public static void main(String[] args) {
        System.out.print("Queue: ");
        testQueue();
        System.out.print("Stack: ");
        testStack();

    }

    private static void testQueue(){
        Queue<Integer> queue = new Queue<Integer>();
        for (int i = 1; i < 10; i++){
            System.out.println(i);
            queue.add(i);
        }

        System.out.println();

        while (!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }

// ===================

    private static void testStack(){
        Stack<Integer> queue = new Stack<Integer>();
        for (int i = 1; i < 10; i++){
            System.out.println(i);
            queue.push(i);
        }
        System.out.println();

        while (!queue.isEmpty()){
            System.out.println(queue.pop());
        }
    }
}
