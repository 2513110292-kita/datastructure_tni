import java.util.Scanner;
 
public class Ex02 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        Scanner scanner = new Scanner(System.in);
 
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter number index " + i + ": ");
            nums[i] = scanner.nextInt();
        }
        NumberArrayController numbers = new NumberArrayController();
        numbers.setNums(nums);
        numbers.display("Print all elements : ");
        System.out.println();
        scanner.close();
    }
}
 