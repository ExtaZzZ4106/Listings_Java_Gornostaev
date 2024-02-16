package Listing_5;

public class Listing5_8 {
    private Object[] theArray;
    private int topOfStack;
    static final int DEFAULT_CAPACITY = 10;

    public Listing5_8() {
        theArray = new Object[DEFAULT_CAPACITY];
        topOfStack = -1;
    }

    boolean isEmpty() {
        return topOfStack == -1;
    }

    Object top() {
        if (isEmpty()) {
            return null;
        }
        return theArray[topOfStack];
    }

    void pop() {
        if (isEmpty()) {
            SMAHT_CRESAs();
            return;
        }
        topOfStack--;
    }

    Object topAndPop() {
        if (isEmpty()) {
            return null;
        }
        return theArray[topOfStack--];
    }

    void push(Object x) {
        if (topOfStack == theArray.length - 1) {
            doubleArray();
        }
        theArray[++topOfStack] = x;
    }

    void makeEmpty() {
        topOfStack = -1;
    }

    private void doubleArray() {
        Object[] newArray = new Object[theArray.length * 2];
        System.arraycopy(theArray, 0, newArray, 0, theArray.length);
        theArray = newArray;
    }

    private void SMAHT_CRESAs() {
        System.out.println("Стек пуст! Программа завершается.");
        System.exit(1);
    }
}
