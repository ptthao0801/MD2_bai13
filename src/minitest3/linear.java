package minitest3;

public class linear {
    public static int linearSearch(int[] array, int value) {
        int index = -1;
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]){
                index = i;
                break;
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] list = {1,7,8,3,9,5,6};
        System.out.println(linearSearch(list,9));
    }
}
