import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int queue_size = 10;
        ArrayBasedQueue<Integer> queue = new ArrayBasedQueue<>(queue_size);
        print(queue);

        // populate queue with random integers between 0 and 10 (inclusive)
        int[] added_elements = new int[12];
        for (int i = 0; i < 12; i++) {
            int element = (int) (Math.random() * 11);
            added_elements[i] = element;
            queue.enqueue(element);
        }
        print(queue);
        print("Order of addition " + Arrays.toString(added_elements));

        // repetitive removal
        int[] removed = new int[queue.getSize()];
        for (int i = 0; i < queue_size; i++) {
            int element = queue.dequeue();
            removed[i] = element;
        }
        print(Arrays.toString(removed));

        /**
         * Print the elements of the queue in the right order
         * i.e. the head first, and the tail last.
         * In your codes to demonstrate your solution, ensure that
         * the head of the queue is in the middle of the array backing the queue.
         */
        //Put your codes here

        print(queue);

        int temp;

        if (queue.isEmpty()) {
            System.out.println("Queue is Empty");
        }
        for (int i = 0; i < queue_size; i++) {
            for (int j = i; j < queue_size; j++) {
                if (added_elements[i] > added_elements[j]) {
                    temp = added_elements[i];
                    added_elements[i] = added_elements[j];
                    added_elements[j] = temp;
                }
            }
        }

        System.out.println("Sorted queue below:");
        for (int i = 0; i < queue_size; i++) {
            System.out.print(" " + added_elements[i]);
        }
    }

    public static void print(Object o) {
        System.out.println(o.toString());
    }
}
