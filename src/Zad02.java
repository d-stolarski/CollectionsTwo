import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Zad02 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println("Podaj " + (i + 1) + " liczbę");
            int value = scan.nextInt();
            queue.offer(value);
        }
        System.out.println(queue);

        int sum = 0;
        for (int i = 10; i > 0; i--) {
            int elem = queue.poll();
            System.out.print(elem);
            if (i > 1){
                System.out.print(" + ");
            }
            sum += elem;
        }
        System.out.print(" = " + sum);
    }
}
