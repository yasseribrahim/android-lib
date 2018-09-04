package lib.soft.com.opandroidlibrary;

public class AndroidOperations {
    private static final AndroidOperations OPERATIONS = new AndroidOperations();

    private AndroidOperations() {
    }

    public static AndroidOperations getCurrentInstance() {
        return OPERATIONS;
    }

    public int add(int... values) {
        int value = 0;
        for (int v : values) {
            value += v;
        }
        return value;
    }

    public int products(int... values) {
        int value = 1;
        for (int v : values) {
            value *= v;
        }
        return value;
    }

    public int factorial(int n) {
        int value = 1;
        for (int i = 1; i <= n; i++) {
            value *= i;
        }
        return value;
    }
}
