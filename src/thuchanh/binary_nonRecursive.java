package thuchanh;
import java.util.Scanner;
import java.util.Arrays;

public class binary_nonRecursive {
    public static int binarySearch(int[] array, int left, int right ,int value){
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (array[mid] == value){
                return mid;
            } else if (value > array[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] list = new int[5]; // Sửa Int thành int
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < list.length; i++) {
            System.out.print("Nhap phan tu thu "+(i+1) + ": ");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);

        int left = 0;
        int right = list.length - 1;

        System.out.print("Nhap key can tim: ");
        int value = scanner.nextInt();

        int result = binarySearch(list, left, right, value);
        if (result != -1) {
            System.out.println("Phan tu " + value + " duoc tim thay tai vi tri " + result);
        } else {
            System.out.println("Phan tu " + value + " khong duoc tim thay trong mang.");
        }
    }
}
