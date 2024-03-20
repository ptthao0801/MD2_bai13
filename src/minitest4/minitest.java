package minitest4;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class minitest {
    public static int binary(meat[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (list[mid].getPrice() == key) {
                return mid;
            } else if (list[mid].getPrice() > key) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }

    public static String linearFlour(flour[] list, String key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i].getName().equals(key)){
                return list[i].getName();
            }
        }
        return "FLOUR NOT FOUND.";
    }

    public static void main(String[] args) {
        // Tao array Meat
        List<meat> m = new ArrayList<>();
        meat meat1 = new meat("pork", 5, 20);
        meat meat2 = new meat("beef", 6, 30);
        meat meat3 = new meat("chicken", 7, 50);
        meat meat4 = new meat("turkey", 8, 90);
        meat meat5 = new meat("sheep", 9, 100);
        m.add(meat1);
        m.add(meat2);
        m.add(meat3);
        m.add(meat4);
        m.add(meat5);

        // Tao array Flour
        List<flour> f = new ArrayList<>();
        flour flour1 = new flour("flour1", 5, 123);
        flour flour2 = new flour("flour2", 3, 345);
        flour flour3 = new flour("flour3", 7, 342);
        flour flour4 = new flour("flour4", 9, 753);
        flour flour5 = new flour("flour5", 10, 396);
        f.add(flour1);
        f.add(flour2);
        f.add(flour3);
        f.add(flour4);
        f.add(flour5);

        // chuyen arrayList -> Array
        meat[] meatArray = m.toArray(new meat[m.size()]);
        flour[] flourArray = f.toArray(new flour[f.size()]);

        // Tao key cho Meat
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap Price cua thit can tim: ");
        int meatKey = scanner.nextInt();

        // Xóa bộ đệm
        scanner.nextLine();

        // Tao key cho Flour
        System.out.print("Nhap Name cua bot can tim: ");
        String flourKey = scanner.nextLine();

        // tim kiem Meat bang Price và Binary
        int index = binary(meatArray, meatKey);
        if (index >= 0){
            System.out.println("Meat found: " + meatArray[index].getName());
        } else {
            System.out.println("MEAT NOT FOUND.");
        }

        // tim kiem Flour bang Name và Linear
        System.out.println("Flour found: " + linearFlour(flourArray, flourKey));
    }
}
