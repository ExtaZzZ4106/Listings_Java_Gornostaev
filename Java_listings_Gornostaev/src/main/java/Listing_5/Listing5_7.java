package Listing_5;

class QuickSort {
    static void sort(char items[]) {
        quicksort(items, 0, items.length - 1);
    }

    private static void quicksort(char items[], int left, int right) {
        int top = left, bottom = right;
        char comparand, value;


        comparand = items[(left + right) / 2];

        do {

            while (items[top] < comparand)
                top++;


            while (comparand < items[bottom])
                bottom--;


            if (top < bottom) {
                value = items[top];
                items[top] = items[bottom];
                items[bottom] = value;
            }

            top++;
            bottom--;

        } while (top <= bottom);


        if (left < bottom)
            quicksort(items, left, bottom);
        if (top < right)
            quicksort(items, top, right);
    }
}

public class Listing5_7 {
    public static void main(String[] args) {
        char seq[] = {'h', 'e', 'd', 'a', 'c', ' '};

        System.out.println();
        QuickSort.sort(seq);
        System.out.print("Исходный порядок символов: ");
        for (int i = 0; i < seq.length; i++)
            System.out.print(seq[i]);
        System.out.println();

        System.out.print("Сортированный порядок: ");
        for (int i = 0; i < seq.length; i++)
            System.out.print(Integer.toHexString((int) seq[i]));
        System.out.println();
    }
}