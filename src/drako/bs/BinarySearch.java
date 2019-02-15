package drako.bs;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.printf("Array  pos: %d ", binarySearch(new int[]{0, 1, 2, 4, 6, 8, 10, 22, 33, 44, 66, 77, 99}, 66));
    }

    public static int binarySearch(int[] array, int target) {
        int left = 0;
        int right = array.length - 1;
        int middle;

        while (left <= right) {
            middle = (left + right) / 2;
            if (array[middle] == target) {
                return middle;
            } else if (array[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        return -1;
    }
}


