package Listing_5;

class BubbleSort {
    static void sort(int[] nums) {
        int t; // вспомогательная переменная
        for (int a = 1; a < nums.length; a++) {
            // Повтор для каждого элемента массива
            for (int b = 0; b < nums.length - 1; b++) {
                // Повтор для проверки порядка соседних элементов
                if (nums[b] > nums[b + 1]) {
                    // перестановка элементов
                    t = nums[b];
                    nums[b] = nums[b + 1];
                    nums[b + 1] = t;
                }
            }
        }
    }
}

public class Listing5_6 {
    public static void main(String[] args) {
        int nums[] = {99, -10, 23, 123972, 17, -654, 87, -9};
        System.out.print("Исходный порядок массива: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
        BubbleSort.sort(nums);
        System.out.print("Новый порядок: ");
        for (int i = 0; i < nums.length; i++)
            System.out.print(nums[i] + " ");
        System.out.println();
    }
}