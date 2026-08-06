import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class LabQueue02 {

    public static boolean checkByDeque(String message) {
        Deque<Character> deque = new ArrayDeque<>();
        String lowerMsg = message.toLowerCase();

        for (int i = 0; i < lowerMsg.length(); i++) {
            deque.addLast(lowerMsg.charAt(i));
        }

        while (deque.size() > 1) {
            char first = deque.removeFirst();
            char last = deque.removeLast();

            if (first != last) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkByStack(String message) {
        Queue<Character> queue = new LinkedList<>();
        Deque<Character> stack = new ArrayDeque<>();

        String lowerMsg = message.toLowerCase();

        for (int i = 0; i < lowerMsg.length(); i++) {
            char ch = lowerMsg.charAt(i);
            queue.add(ch);
            stack.push(ch);
        }

        while (!queue.isEmpty()) {
            char fromQueue = queue.poll();
            char fromStack = stack.pop();

            if (fromQueue != fromStack) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter some message: ");
        String message = scanner.nextLine();
        
        System.out.println();
        System.out.print("Check Palindrome by Deque = ");
        if (checkByDeque(message)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        System.out.print("Check Palindrome by Stack = ");
        if (checkByStack(message)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        scanner.close();
    }
}